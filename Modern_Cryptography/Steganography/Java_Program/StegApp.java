import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class StegApp implements ActionListener
{
  private JFrame jf;
  private Container cp;
  private JButton openBtn, saveBtn;
  private JButton encodeBtn, decodeBtn;
  private JTextArea textField;
  private PictureEdit pic;
  
  
  public void setupGUI()
  {
    jf = new JFrame("Steg App");
    cp = jf.getContentPane();
    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(600, 400);
    jf.setLayout(new GridLayout(2, 1));
    
    Container buttonsCtr = new Container();
    buttonsCtr.setLayout(new GridLayout(2,2, 5, 5));
    
    
    JPanel msgCtr = new JPanel();
    msgCtr.setLayout(new GridLayout(1,1));
    TitledBorder title;
    title = BorderFactory.createTitledBorder("Message");
    msgCtr.setBorder(title);
    
    textField = new JTextArea();
    msgCtr.add(textField);
    
    openBtn = new JButton("Open Image");
    saveBtn = new JButton("Save Image");
    encodeBtn = new JButton("Encode Message");
    decodeBtn = new JButton("Decode Message");
    openBtn.addActionListener(this);
    saveBtn.addActionListener(this);
    encodeBtn.addActionListener(this);
    decodeBtn.addActionListener(this);
    
    buttonsCtr.add(openBtn);
    buttonsCtr.add(saveBtn);
    buttonsCtr.add(encodeBtn);
    buttonsCtr.add(decodeBtn);
    
    cp.add(buttonsCtr);
    cp.add(msgCtr);
    
    jf.setLocation(100, 100);
    
    jf.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getActionCommand().equals("Open Image"))
    {
      pic = new PictureEdit();
      pic.displayImage();
    }
    if (pic == null)
    {
      return;
    }
    if(e.getActionCommand().equals("Save Image"))
    {
      pic.saveAs();
    }
    
    if(e.getActionCommand().equals("Encode Message"))
    {
      String msg = textField.getText();
      pic = Steganography.encode(pic, msg);
      textField.setText(msg);
    }
    
    if(e.getActionCommand().equals("Decode Message"))
    {
      String msg = Steganography.decode(pic);
      textField.setText(msg);
    }
  }
  
  public static void main(String[] args)
  {
    StegApp myApp = new StegApp();
    myApp.setupGUI();
  }
}