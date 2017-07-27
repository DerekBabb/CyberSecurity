import java.awt.Color;

public class ViewMessage
{
  public static void main(String[] args)
  {
    //open an image file and display
    PictureEdit pic = new PictureEdit();
    pic.displayImage();
    
    //get a message from the user
    String message = "";
    
    
    int x = 0;
    int y = 0;
    
    while (x < 20)
    {
    //read the color at one specific pixel
    Color pixColor = pic.getColor(x, y);
    int red = pixColor.getRed();
    int green = pixColor.getGreen();
    int blue = pixColor.getBlue();
    //build the message
    message = message + red;
    
    x = x + 1;
    }
    
    System.out.println("Message: " + message);
  }
}