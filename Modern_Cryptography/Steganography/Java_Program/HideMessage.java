import java.awt.Color;
import java.util.Scanner;

public class HideMessage
{
  public static void main(String[] args)
  {
    //open an image file and display
    PictureEdit pic = new PictureEdit();
    pic.displayImage();
    
    //get a message from the user
    Scanner in = new Scanner(System.in);
    System.out.print("Enter message: ");
    String message = in.nextLine();
    
    
    int x = 0;
    int y = 0;
    
    //read the color at one specific pixel
    Color pixColor = pic.getColor(x, y);
    int red = pixColor.getRed();
    int green = pixColor.getGreen();
    int blue = pixColor.getBlue();
    Color change = new Color(red, green, blue);
    pic.setColor(x, y, change);
    
    
    
    //display and save the new image
    pic.displayImage();
    pic.saveAs();
  }
}