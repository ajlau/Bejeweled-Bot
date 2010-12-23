import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;

public class snapshot extends Bejeweled
{
    static Rectangle screenRect = new Rectangle(x, y-(s * 7), (s * 7)+40,(s * 7)+40);

    static int getpixcolor(int x, int y) throws IOException, AWTException 
    {
	RenderedImage image = (new Robot()).createScreenCapture(screenRect);
	return -((BufferedImage) image).getRGB(x, y);
    }
    
 
    

}
