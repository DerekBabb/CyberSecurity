import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class StegTest implements ActionListener
{
  private JFrame jf;
  private Container cp;
  private JButton openBtn, saveBtn;
  private JButton getBtn, setBtn;
  private JTextField redField, greenField, blueField, xField, yField;
  private JLabel sizeLabel;
  private PictureEdit pic;
  
  
  public void setupGUI()
  {
    jf = new JFrame("Steg Test");
    cp = jf.getContentPane();
    
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400, 300);
    jf.setLayout(null);
    
    JPanel leftPanel = new JPanel();
    leftPanel.setBounds(20, 20, 150, 200);
    leftPanel.setLayout(new GridLayout(4, 1, 5, 5));
    
    JPanel rightPanel = new JPanel();
    rightPanel.setBounds(200, 20, 170, 150);
    rightPanel.setLayout(new GridLayout(4, 1));
    
    JPanel pixelPanel = new JPanel();
    pixelPanel.setLayout(new GridLayout(1, 4));
    xField = new JTextField("", JTextField.CENTER);
    yField = new JTextField("", JTextField.CENTER);
    
    pixelPanel.add(new JLabel("X: ", JLabel.RIGHT));
    pixelPanel.add(xField);
    pixelPanel.add(new JLabel("Y: ", JLabel.RIGHT));
    pixelPanel.add(yField);
    
    TitledBorder title;
    title = BorderFactory.createTitledBorder("Pixel Info");
    rightPanel.setBorder(title);
    
    
    redField = new JTextField("", JTextField.CENTER);
    greenField = new JTextField("", JTextField.CENTER);
    blueField = new JTextField("", JTextField.CENTER);
    
    sizeLabel = new JLabel("Image Size: ");
    
    
    
    rightPanel.add(pixelPanel);
    //rightPanel.add();
    Container redContainer = new Container();
    redContainer.setLayout(new GridLayout(1, 2));
    redContainer.add(new JLabel("Red: ", JLabel.RIGHT));
    redContainer.add(redField);
    rightPanel.add(redContainer);
    
    Container greenContainer = new Container();
    greenContainer.setLayout(new GridLayout(1, 2));
    greenContainer.add(new JLabel("Green: ", JLabel.RIGHT));
    greenContainer.add(greenField);
    rightPanel.add(greenContainer);
    
    Container blueContainer = new Container();
    blueContainer.setLayout(new GridLayout(1, 2));
    blueContainer.add(new JLabel("Blue: " , JLabel.RIGHT));
    blueContainer.add(blueField);
    rightPanel.add(blueContainer);
    
    
    openBtn = new JButton("Open Image");
    saveBtn = new JButton("Save Image");
    getBtn = new JButton("Get RGB");
    setBtn = new JButton("Set RGB");
    openBtn.addActionListener(this);
    saveBtn.addActionListener(this);
    getBtn.addActionListener(this);
    setBtn.addActionListener(this);
    
    leftPanel.add(openBtn);
    leftPanel.add(saveBtn);
    leftPanel.add(getBtn);
    leftPanel.add(setBtn);
    
    sizeLabel = new JLabel("Image Size: 0 x 0");
    sizeLabel.setBounds(200, 175, 300, 50);
   
    
    cp.add(leftPanel);
    cp.add(rightPanel);
    cp.add(sizeLabel);
    
    jf.setLocation(100, 100);
    
    jf.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getActionCommand().equals("Open Image"))
    {
      pic = new PictureEdit();
      pic.displayImage();
      
      sizeLabel.setText("Image Size: " + pic.getWidth() + " x " + pic.getHeight());
      
    }
    if (pic == null)
    {
      return;
    }
    if(e.getActionCommand().equals("Save Image"))
    {
      pic.saveAs();
    }
    
    if(e.getActionCommand().equals("Get RGB"))
    {
      //check the x, y value is in valid range
      int x = Integer.parseInt("0" + xField.getText());
      int y = Integer.parseInt("0" + yField.getText());
      if (x >= pic.getWidth() || y >= pic.getHeight())
        return;
      Color color = pic.getColor(x, y);
      redField.setText(color.getRed() + "");
      greenField.setText(color.getGreen() + "");
      blueField.setText(color.getBlue() + "");
      
    }
    
    if(e.getActionCommand().equals("Set RGB"))
    {
      //check the x, y value is in valid range
      int x = Integer.parseInt("0" + xField.getText());
      int y = Integer.parseInt("0" + yField.getText());
      if (x >= pic.getWidth() || y >= pic.getHeight())
        return;
      
      int r = Integer.parseInt("0" + redField.getText());
      int g = Integer.parseInt("0" + greenField.getText());
      int b = Integer.parseInt("0" + blueField.getText());
      
      pic.setColor(x, y, new Color(r, g, b));
      
    }
  }
  
  public static void main(String[] args)
  {
    StegTest testApp = new StegTest();
    testApp.setupGUI();
  }
}