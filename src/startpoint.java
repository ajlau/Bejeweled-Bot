import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;

public class startpoint extends Bejeweled
{
    static Rectangle cali = new Rectangle(0,0, 950,950);
    
	static void findorgin() throws IOException, AWTException 
	{
	    RenderedImage image = (new Robot()).createScreenCapture(cali);
	    int TL;
	    boolean found =false;
	    for (int i = 0; i < 900 && !found; i++)
	    {
		
		for (int j =0; j < 900 && !found; j++) 
		{ 
		    TL=-((BufferedImage) image).getRGB(i, j);
		  
		    if (TL == white || TL == blue || TL == green || TL == orange || TL == yellow || TL == purple)
		    {
			TL=-((BufferedImage) image).getRGB(i, j+s);
			if (TL == white || TL == blue || TL == green || TL == orange || TL == yellow || TL == purple)
			{
			    TL=-((BufferedImage) image).getRGB(i+s*2, j+s*2);
				if (TL == white || TL == blue || TL == green || TL == orange || TL == yellow || TL == purple)
				{
			    
				    System.out.println("x=" + i + ", y=" + (j+s*7));
				    found=true;
				}
			}
		    }
		}
	    }
	}
}
