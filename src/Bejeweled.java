import java.awt.Robot;

public class Bejeweled 
{
    static final int red = 452042;
    static final int redfire = 385736;
    static final int redSpark = 43136;
    static final int redMulti = 388831;
   
    static final int blue = 15692802;
    static final int bluefire = 15496193;
    static final int blueSpark = 0;
    static final int blueMulti = 13919750;

    static final int green = 15686623;
    static final int greenfire = 15358170;
    static final int greenSpark = 11932553;
    static final int greenMulti2 = 16727796;
    static final int greenMulti3 = 16730612;
   
    
    static final int white = 2039584;
    static final int whitefire = 1513240;
    static final int whiteSpark = 385734;
    static final int whiteMulti = 3026479;
    
    static final int orange = 1678047;
    static final int orangefire = 1610971;
    static final int orangeSpark = 17018;
    static final int orangeMulti = 1280728;

    static final int yellow = 68317;
    static final int yellowfire = 2523;
    static final int yellowcoin = 4550366;
    static final int yellowSpark = 117;
    static final int yellowMulit = 790784;

    static final int purple = 1110033;
    static final int purplefire = 1043728;
    static final int purpleSpark = 41985;
    static final int purpleMulti2 = 2616617;
    static final int purpleMulti3 = 3403317;
   
    public static int[][] grid = new int[9][9];
    
    static final int s = 40;
    static long starttime = System.currentTimeMillis();
   
    public static int x = 546;
    public static int y = 598;
   
    public static boolean calibrate = false;


    public static void main(String[] args) throws Exception
    {
		Robot r = new Robot();
		Thread.sleep(5000); //fuse set at 5 seconds.
		
		if(calibrate)
			startpoint.findorgin();

	
		r.mouseMove(x, y);
	
		while(true)
		{
		    if (System.currentTimeMillis() - starttime > 85000)
		    	break;
		    
		    thread1.scan();
		    
		    if(calibrate)
		    	break;
		    
		    find1.findThem();
		    
		    Thread.sleep(225);
		}
	
		System.out.println();
		for (int j = 7; j >-1; j--)
		{
		    for (int i = 0; i<8; i++)
		    {
			System.out.print(grid[i][j]);
			System.out.print("; ");
		    }
		    System.out.println();
		}

    }
}
