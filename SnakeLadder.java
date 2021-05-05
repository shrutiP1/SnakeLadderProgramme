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
	public int getOptionTwoUser(int dieRollNum , SnakeLadder s)
    {
		//System.out.println(startPos);
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
			   else if(startPos==100)
			   {
				   startPos=100;
				   break;
			   }
			   
			     s.getPositionTwoUser(s);
				   break;
			   
			  
		case SNAKE:
		     	   startPos=startPos-dieRollNum;
		 	        break;
    }
		System.out.println(startPos);	
	    return startPos;
   }
	public int getPositionTwoUser(SnakeLadder s1)
    {
    	int num=0;
    	num=s1.getRollNum();
    	 startPos=s1.getOptionTwoUser(num , s1);
    	 //System.out.println(startPos);
    	 if(startPos<0)
    	 {
    		startPos=0;
    	 }
    	
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
            //UC6

	    System.out.println("dice was played "+count+" no of time to win");
           //UC7
	    
	    SnakeLadder player1=new SnakeLadder();
	    SnakeLadder player2=new SnakeLadder();
	    int startPos1=0;
	    int startPos2=0;
	    while(startPos1<=100 && startPos2<=100)
	    {
	    	startPos1=player1.getOptionTwoUser(startPos2, player1);
	    	startPos2=player2.getOptionTwoUser(startPos2, player2);
	    	
	    	if(startPos1==100)
	    	{
	    		System.out.println("player 1 win");
	    		break;
	    		
	    	}
	    	else if(startPos2==100)
	    	{
	    		System.out.println("player 2 win");
	    		break;
	    		
	    	}
	    	else
	    	{
	    		startPos1=player1.getOptionTwoUser(startPos2, player1);
		    	startPos2=player2.getOptionTwoUser(startPos2, player2);
	    	}
	    }
	}

}
