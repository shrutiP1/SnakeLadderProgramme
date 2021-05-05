package com.bridgeLabz.snackladder;

public class SnakeLadder
{
     public static final int NO_PLAY = 0;
     public static final int LADDER = 1;
     public static final int SNAKE = 2;
     int startPos=0;
	public int getRollNum()
    {
   	  int dieRollNum=(int)(Math.floor(Math.random()*10)%6)+1;
	  return dieRollNum;
    }
	public int getOption(int dieRollNum)
    {
		
		int optionNo=(int)Math.floor(Math.random()*10)%3;
		switch (optionNo)
		{
		   case NO_PLAY:
			   break;
			   
		   case LADDER:
			   startPos=startPos+dieRollNum;
			   if(startPos>100)
			   {
				   startPos=startPos-dieRollNum;
			   }
			   else
			   {
				   break;
			   }
			   
		   case SNAKE:
			   startPos=startPos-dieRollNum;
			   break;
		}
		return startPos;
		
   	 }
	public int getPosition(SnakeLadder s1)
    {
    	int num=0;
    	num=s1.getRollNum();
    	startPos=s1.getOption(num);
    	if(startPos<0)
    	{
    		startPos=0;
    	}
    	System.out.println("player position after roll is "+startPos);
    	return startPos;
    }
	public static void main(String[] args)
	{
		int count=0;
		int startPos=0;	
		System.out.println("welcome to snackladder programme");
		//UC1
		
		System.out.println("startPosition of user is "+startPos);
		//UC2
		
		SnakeLadder s1=new SnakeLadder();
		int digit=s1.getRollNum();
		System.out.println("After rolling die number is  "+digit);
		//UC3
		
		System.out.println("after roll user position is "+s1.getOption(digit));	
		//UC4
		
		s1.startPos=0;
	      while(startPos!=100)
		 {
	    	     startPos=s1.getPosition(s1);
			if(startPos==100)
		    {
		    	break;
		    }
		    else
		    {
		    	startPos=s1.getPosition(s1);
		    	
		  
		    }
			count++;
			
		}
	    System.out.println("user position is "+startPos);
	    System.out.println("dice was played "+count+" no of time to win");
	}

}
