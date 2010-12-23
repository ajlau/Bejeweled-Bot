import java.awt.Robot;
import java.awt.event.InputEvent;

public class find1 extends Bejeweled
{
	
    public static void findThem() throws Exception 
    {
    Robot r = new Robot();

    	for (int j = 0; j < 8; j++)
    	{
    	    for (int i = 0; i < 8; i++) 
    	    {

	    // x
        // -
        // x
	    // x

	    if (i + 0 < 8 && j + 3 < 8)
	    {
		if (grid[i + 0][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 0][j + 3])
		{
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 3)));
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 2)));
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    }

	    
	    // - x
	    // x
	    // x

	    if (i + 1 < 8 && j + 2 < 8)
	    {
		if (grid[i + 0][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 1][j + 2])
		{
		    r.mouseMove(x + (s * (i + 1)), y - (s * (j + 2)));
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 2)));
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    }

	    // x
	    // - x
	    // x

	    if (i + 1 < 8 && j + 2 < 8) 
	    {
		if (grid[i + 0][j + 0] == grid[i + 0][j + 2] && grid[i + 0][j + 2] == grid[i + 1][j + 1])
		{
		    r.mouseMove(x + (s * (i + 1)), y - (s * (j + 1)));
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 1)));
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    }

	   // x
	   // x
	   // - x

	    if (i + 1 < 8 && j + 2 < 8) 
	    {
		if (grid[i + 1][j + 0] == grid[i + 0][j + 1] && grid[i + 0][j + 1] == grid[i + 0][j + 2])
		{
		    r.mouseMove(x + (s * (i + 1)), y - (s * (j + 0)));
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 0)));
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    }


	   // x
	   // x
	   // -
	   // x

	    if (i + 0 < 8 && j + 3 < 8) 
	    {			
		if (grid[i + 0][j + 0] == grid[i + 0][j + 2] && grid[i + 0][j + 2] == grid[i + 0][j + 3]) 
		{
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 0)));
		    r.mousePress(InputEvent.BUTTON1_MASK);
		    r.mouseMove(x + (s * (i + 0)), y - (s * (j + 1)));
		    r.mouseRelease(InputEvent.BUTTON1_MASK);
		}
	    }

	    
	   // x -
	   //   x
	   //   x

	   if (i + 1 < 8 && j + 2 < 8)
	   {
	      if (grid[i + 0][j + 2] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 1][j + 0]) 
	      {
		  r.mouseMove(x + (s * (i + 0)), y - (s * (j + 2)));
		  r.mousePress(InputEvent.BUTTON1_MASK);
		  r.mouseMove(x + (s * (i + 1)), y - (s * (j + 2)));
		  r.mouseRelease(InputEvent.BUTTON1_MASK);
	      }
	   }

	   
	   //   x
	   // x -
	   //   x

	  if (i + 1 < 8 && j + 2 < 8) 
	  {
	      if (grid[i + 0][j + 1] == grid[i + 1][j + 0] && grid[i + 1][j + 0] == grid[i + 1][j + 2]) 
	      {
		  r.mouseMove(x + (s * (i + 0)), y - (s * (j + 1)));
		  r.mousePress(InputEvent.BUTTON1_MASK);
		  r.mouseMove(x + (s * (i + 1)), y - (s * (j + 1)));
		  r.mouseRelease(InputEvent.BUTTON1_MASK);
	      }
	  }

	  
	  //   x
	  //   x
	  // x -

	if (i + 1 < 8 && j + 2 < 8) 
	{
	    if (grid[i + 0][j + 0] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 1][j + 2]) 
	    {
		r.mouseMove(x + (s * (i + 0)), y - (s * (j + 0)));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 1)), y - (s * (j + 0)));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	// xx-x

	if (i < 5) 
	{
	    if (grid[i][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 3][j]) 
	    {
		r.mouseMove(x + (s * (i + 3)), y - (s * j));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 2)), y - (s * j));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	// x--
	// -xx
	
	if (i + 2 < 8 && j + 1 < 8)
	{
	    if (grid[i + 1][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 0][j + 1])
	    {
		r.mouseMove(x + (s * (i + 0)), y - (s * (j + 1)));
	    	r.mousePress(InputEvent.BUTTON1_MASK);
	    	r.mouseMove(x + (s * (i + 0)), y - (s * (j + 0)));
	    	r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	// -x-
	// x-x
	if (i + 2 < 8 && j + 1 < 8) 
	{
	    if (grid[i + 0][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 1][j + 1])
	    {
		r.mouseMove(x + (s * (i + 1)), y - (s * (j + 1)));
	    	r.mousePress(InputEvent.BUTTON1_MASK);
	    	r.mouseMove(x + (s * (i + 1)), y - (s * (j + 0)));
	    	r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	// --x
	// xx-

	if (i + 3 < 8 && j + 1 < 8)
	{
	    if (grid[i + 0][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j + 1])
	    {
		r.mouseMove(x + (s * (i + 2)), y - (s * (j + 1)));
	    	r.mousePress(InputEvent.BUTTON1_MASK);
	    	r.mouseMove(x + (s * (i + 2)), y - (s * (j + 0)));
	    	r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	// x-xx

	if (i < 6) 
	{
	    if (grid[i][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 3][j])
	    {
		r.mouseMove(x + (s * (i + 0)), y - (s * j));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 1)), y - (s * j));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	// -xx
	// x--

	if (i + 2 < 8 && j + 1 < 8)
	{
	    if (grid[i + 0][j] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 1]) 
	    {
		r.mouseMove(x + (s * (i + 0)), y - (s * (j + 0)));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 0)), y - (s * (j + 1)));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	// x-x
	// -x-
	
	if (i + 2 < 8 && j + 1 < 8) 
	{
	    if (grid[i + 0][j + 1] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j + 1]) 
	    {
		r.mouseMove(x + (s * (i + 1)), y - (s * (j + 0)));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 1)), y - (s * (j + 1)));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	// xx-
	// --x
	
	if (i + 2 < 8 && j + 1 < 8) 
	{
	    if (grid[i + 0][j + 1] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 0]) 
	    {
		r.mouseMove(x + (s * (i + 2)), y - (s * (j + 0)));
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseMove(x + (s * (i + 2)), y - (s * (j + 1)));
		r.mouseRelease(InputEvent.BUTTON1_MASK);
	    }
	}

	
	
    	    }
    	   

    	}
		
    }
	
}
