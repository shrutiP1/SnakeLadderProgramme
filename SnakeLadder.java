package com.bridgeLabz.snackladder;

public class SnakeLadder
{
	public int getRollNum()
    {
   	  int dieRollNum=(int)(Math.floor(Math.random()*10)%6)+1;
	  return dieRollNum;
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
	}

}
