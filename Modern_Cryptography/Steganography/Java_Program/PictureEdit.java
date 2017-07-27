/**
 * @author Derek Babb <dbabb1@gmail.com>
 * @version 1.0
 * @since 6-28-2012
 *
 * The PictureEdit class allows you to easily open and modify an image
 * at the pixel level.
 *
 * The intended purpose is to be used with Steganography and Steganalysis of images.
 */

 import java.awt.image.BufferedImage;
 import javax.swing.filechooser.FileNameExtensionFilter;
 import javax.swing.JFileChooser;
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 import javax.imageio.ImageIO;
 import java.io.File;
 import java.awt.Image;
 import java.util.Date;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.awt.Graphics;
 import java.awt.Color;

 public class PictureEdit extends JPanel
 {
 	private BufferedImage image;
 	private BufferedImage revertImage;

 	/**
 	 * Constructor will use the JFileChooser to open a file
 	 */

 	public PictureEdit()
 	{
 		image = null;
 		this.open();
 	}

 	/**
 	 * Constructor will use the JFileChooser to open a file
 	 *
 	 * @param fileName is the String file name including the directory path
 	 */

 	public PictureEdit(String fileName)
 	{
 		image = null;
 		this.open(fileName);
 	}

 	/**
 	 * Constructor will use the JFileChooser to open a file
 	 *
 	 * @param file is the File object of the picture that will be opened.
 	 */

 	public PictureEdit(File file)
 	{
 		image = null;
 		this.open(file);
 	}

 	/**
 	 * Opens a file by opening a JFileChooser which allows the user to select
 	 * the file they would like to open.
 	 *
 	 * @return true if the file successfully opened, false otherwise.
 	 */

 	public boolean open()
 	{
		JFileChooser chooser = new JFileChooser(".");
    	FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG Images", "png");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
			try{
				File file = chooser.getSelectedFile();
				image = ImageIO.read(file);
				revertImage = copyImage(image);
			}
			catch(Exception e){
				return false;
			}

			return true;
	    }
	    else
	    {
	    	return false;
	    }
 	}

 	/**
 	 * Opens an image file based on the file name in String format
 	 *
 	 * @param fileName the name of the file including file path.
 	 * @return true if the file is successfully opened, false otherwise.
 	 */

 	 public boolean open(String fileName)
 	 {
 		try{
 			File file = new File(fileName);
			image = ImageIO.read(file);
			revertImage = copyImage(image);
		}
		catch(Exception e){
			return false;
		}
		return true;
 	 }

 	/**
 	 * Opens an image file given a File object.
 	 *
 	 * @param file the File object of the image file.
 	 * @return true if the file is successfully opened, false otherwise.
 	 */

	public boolean open(File file)
	{
		try{
			image = ImageIO.read(file);
			revertImage = copyImage(image);
		}
		catch(Exception e){
			return false;
		}
		return true;
	 }

	 /**
	  * Reverts to the original file, all unsaved changes are lost.
	  */

	 public void revert()
	 {
	 	image = copyImage(revertImage);
	 }




 	/**
 	 * Saves a file by opening a JFileChooser which allows the user to select
 	 * the file they would like to save over or create a new file to save onto.
 	 *
 	 * @return true if the file successfully opened, false otherwise.
 	 */

 	public boolean saveAs()
 	{
	 	JFileChooser chooser = new JFileChooser(".");
	    int returnVal = chooser.showSaveDialog(null);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
			try{
			ImageIO.write(image, "png",chooser.getSelectedFile());
			}
			catch(Exception e){
				return false;
			}
			return true;
	    }
	    return false;

	}

	/**
 	 * Saves a file by writing a new file with the given fileName String.
 	 * CAUTION: This will overwrite any file with the name provided.  No confirmation
 	 * dialog.
 	 *
 	 * @param fileName is a String with the file name and path directory.
 	 *
 	 * @return true if the file successfully opened, false otherwise.
 	 */

	public boolean saveAs(String fileName)
 	{

		try{
		ImageIO.write(image, "png",new File(fileName));
		}
		catch(Exception e){
			return false;
		}
		return true;


	}

	/**
 	 * Returns the width of the image file
 	 *
 	 * @return integer value of the width.  Will return 0 if there is no file currently open.
 	 */
	 public int getWidth()
	 {
	 	if(image == null)
	 	{
	 		return 0;
	 	}
	 	else
	 	{
	 		return image.getWidth();
	 	}
	 }

	/**
 	 * Returns the height of the image file
 	 *
 	 * @return integer value of the height.  Will return 0 if there is no file currently open.
 	 */

	 public int getHeight()
	 {
	 	if(image == null)
	 	{
	 		return 0;
	 	}
	 	else
	 	{
	 		return image.getHeight();
	 	}
	 }

	/**
 	 * Returns the image file as an Image object.  This might be used to easily display the open image.
 	 *
 	 * @return Image object of the currently open image.
 	 */

	 public Image getImage()
	 {
	 	return (Image)image;
	 }

	/**
 	 * Displays the current image in a new JFrame.
 	 * The title of the JFrame will be the timestamp of when it was displayed.
 	 * The timestamp allows the user to see multiple revisions and know which came first.
 	 *
 	 */

 	 public void displayImage()
 	 {
 	 	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
	 	displayImage(dateFormat.format(date));
 	 }

 	 /**
 	 * Displays the current image in a new JFrame.
 	 * The title of the window is given as a paramater.
 	 *
 	 * @param title Title of the window.
 	 *
 	 */

 	 public void displayImage(String title)
 	 {
 	 	new Window(image, title);
 	 }


 	/**
 	 * Returns the integer value of the color at a given point.
 	 * Will return a -1 if the coordinate is outside the width/height of the open image.
 	 *
 	 * @param x x-coordinate of the selected pixel
 	 * @param y y-coordinate of the selected pixel
 	 *
 	 * @return integer value of the color at (x,y) coordinate.
 	 */

 	 public int getRGBColor(int x, int y)
 	 {
 	 	if(x < image.getWidth() && y < image.getHeight())
 	 	{
 	 		return image.getRGB(x,y);
 	 	}
 	 	else
 	 	{
 	 		return -1;
 	 	}
 	 }


	/**
 	 * Returns a Color object of the color at a given point.
 	 * Will return null if the coordinate is outside the width/height of the open image.
 	 *
 	 * @param x x-coordinate of the selected pixel
 	 * @param y y-coordinate of the selected pixel
 	 *
 	 * @return Color object of the color at (x,y) coordinate.
 	 */

 	 public Color getColor(int x, int y)
 	 {
 	 	if(x < image.getWidth() && y < image.getHeight())
 	 	{
 	 		return new Color(getRGBColor(x,y));
 	 	}
 	 	else
 	 	{
 	 		return null;
 	 	}
 	 }

 	/**
 	 * Sets the color at a given x,y coordinate.
 	 * The color is given in an integer RGB model.
 	 *
 	 * If the x,y is outside the image, the method returns false, true otherwise.
 	 *
 	 * @param x x-coordinate of the selected pixel
 	 * @param y y-coordinate of the selected pixel
 	 * @param color the color in integer RGB form
 	 *
 	 * @return Color object of the color at (x,y) coordinate.
 	 */

 	 public boolean setColor(int x, int y, int color)
 	 {
 	 	if(x < image.getWidth() && y < image.getHeight())
 	 	{
 	 		image.setRGB(x, y, color);
 	 		return true;
 	 	}
 	 	return false;
 	 }

 	/**
 	 * Sets the color at a given x,y coordinate.
 	 * The color is given as a Color object.
 	 *
 	 * If the x,y is outside the image, the method returns false, true otherwise.
 	 *
 	 * @param x x-coordinate of the selected pixel
 	 * @param y y-coordinate of the selected pixel
 	 * @param color Color object of the color to change to
 	 *
 	 * @return Color object of the color at (x,y) coordinate.
 	 */

 	 public boolean setColor(int x, int y, Color color)
 	 {
 	 	if(x < image.getWidth() && y < image.getHeight() && color != null)
 	 	{
 	 		image.setRGB(x, y, color.getRGB());
 	 		return true;
 	 	}
 	 	return false;
 	 }

 	 private BufferedImage copyImage(BufferedImage i)
 	 {
 	 	BufferedImage img = new BufferedImage(i.getWidth(), i.getHeight(), i.getType());
			for (int y = 0; y < i.getHeight(); y++)
			{
				for (int x = 0; x < i.getWidth(); x++)
				{
					int rgb = i.getRGB(x, y);
					img.setRGB(x, y, rgb);
				}
			}
		return img;
 	 }


	private class Window extends JPanel
	{
		private BufferedImage img;


		public Window(BufferedImage i, String title)
		{
			img = copyImage(image);
	 	 	JFrame jf = new JFrame(title);

			jf.setSize(img.getWidth() + 16, img.getHeight() + 38);
			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			jf.getContentPane().add(this);
			jf.setVisible(true);
		}


		 /**
	 	  * @Override to display image
	 	  */
	 	 public void paintComponent(Graphics g)
	 	 {
	 	 	super.paintComponent(g);
	 	 	g.drawImage(img,0,0,this);
	 	 }
	}


 }