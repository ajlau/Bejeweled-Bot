public class thread1 extends Bejeweled {

    public static void scan() throws Exception 
    {
	int color = 0;
	int blank = 0;

	for (int j = 0; j < 8; j++)
	{
	    for (int i = 0; i < 8; i++)
	    {
		color = snapshot.getpixcolor((s * i), s * 7 - (s * j));
		
	
		if (color == white || color == whitefire || color == whiteSpark || color == whiteMulti) 
		{
		    grid[i][j] = 1;
		    continue;
		}

		if (color == red || color == redfire || color == redSpark || color == redMulti) 
		{
		    grid[i][j] = 2;
		    continue;
		}

		if (color == orange || color == orangefire || color == orangeSpark || color == orangeMulti) 
		{
		    grid[i][j] = 3;
		    continue;
		}

		if (color == yellow || color == yellowfire || color == yellowcoin || color == yellowMulit
			|| color == yellowSpark) 
		{
		    grid[i][j] = 4;
		    continue;
		}

		if (color == purple || color == purplefire || color == purpleSpark || color == purpleMulti2 
			|| color == purpleMulti3) 
		{
		    grid[i][j] = 5;
		    continue;
		}

		if (color == blue || color == bluefire || color == blueSpark || color == blueMulti)
		{
		    grid[i][j] = 6;
		    continue;
		}
		if (color == green || color == greenfire || color == greenMulti2  || color == greenSpark || color == greenMulti3)
		{
		    grid[i][j] = 7;
		    continue;
		}
		
		blank += 1;
		grid[i][j] = color+blank;
		
	    }
	}
	
	
	
	if(blank>60  && System.currentTimeMillis() - starttime > 85000)  
	{
	   
	    scan();
	  
	}
    
    }
}