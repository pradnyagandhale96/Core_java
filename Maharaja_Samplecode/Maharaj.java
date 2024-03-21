import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Maharaj {

	public Maharaj() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File hh =new File("C://Users//Pradnya//Downloads//WhatsApp Image 2024-02-18 at 10.29.55 PM.jpeg");
		try {
			BufferedImage image = ImageIO.read(hh);
			for(int i=0;i<image.getHeight();i++)
			{
				for(int j=0;j<image.getWidth();j++)
				{
					Color cl = new Color(image.getRGB(j, i));
					if(cl.getBlue()==0 && cl.getRed()==0 && cl.getGreen()==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
						
				}
				System.out.println();
					
				}
				
			}
			
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
