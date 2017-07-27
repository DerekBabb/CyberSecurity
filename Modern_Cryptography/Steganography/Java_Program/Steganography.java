import java.awt.*;
public class Steganography
{
  public static PictureEdit encode(PictureEdit pic, String message)
  {
    //change the first red to the number of letters
    int length = message.length();
    Color pixColor = pic.getColor(0,0);
    int r = length;
    int g = pixColor.getGreen();
    int b = pixColor.getBlue();
    pic.setColor(0, 0, new Color(r, g, b));
    
    int count = 0;
    for (int ch = 0; ch < length; ch++)
    {
      char letter = message.charAt(ch);
      int num = (int)letter;
      String binary = toBinary(num);
      
      while(binary.length() < 9)
        binary = "0" + binary;
      //binary is now 9 digits long
      
      for (int i = 0; i < 9; i+= 3)
      {
        count++;
        int x = count % pic.getWidth();
        int y = count / pic.getWidth();
          
        pixColor = pic.getColor(x, y);
        r = pixColor.getRed();
        g = pixColor.getGreen();
        b = pixColor.getBlue();
        if(binary.charAt(i) == '0' && r % 2 == 1)
          r--;
        else if (binary.charAt(i) == '1' && r % 2 == 0)
          r++;
        
        if(binary.charAt(i + 1) == '0' && g % 2 == 1)
          g--;
        else if (binary.charAt(i + 1) == '1' && g % 2 == 0)
          g++;
        
        if(binary.charAt(i + 2) == '0' && b % 2 == 1)
          b--;
        else if (binary.charAt(i + 2) == '1' && b % 2 == 0)
          b++;
        
        pic.setColor(x, y, new Color(r, g, b)); 
      }
    }
    return pic;
  }
  
  public static String decode(PictureEdit pic)
  {
    String msg = "";
    Color pixColor = pic.getColor(0,0);
    int r = pixColor.getRed();
    int g = pixColor.getGreen();
    int b = pixColor.getBlue();
    int length = r;
    
    for (int i = 0; i < length * 3; i += 3)
    {
      String bin = "";
      for (int j = 0; j < 3; j++)
      {
        int x = (i + j + 1) % pic.getWidth();
        int y = (i + j + 1) / pic.getWidth();
        pixColor = pic.getColor(x,y);
        r = pixColor.getRed();
        g = pixColor.getGreen();
        b = pixColor.getBlue();
        bin = bin + (r % 2);
        bin = bin + (g % 2);
        bin = bin + (b % 2);
      }
      msg = msg + (char)toNumber(bin);
    }
    return msg;
  }
  
  private static String toBinary(int num)
  {
    return Integer.toBinaryString(num);
  }
  
  private static int toNumber(String bin)
  {
    return Integer.valueOf(bin, 2);
  }
}