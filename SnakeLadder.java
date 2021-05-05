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
			   break;
			   
		   case SNAKE:
			   startPos=startPos-dieRollNum;
			   break;
		}
		return startPos;
		
   	 
    }
	public static void main(String[] args)
	{
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
	}

}
