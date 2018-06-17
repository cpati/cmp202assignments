package com.cmp202.gumball.v3;


public class GumballMachine
{

    private int numGumballs;
    private int totalCoinsAmount=0;

    public GumballMachine( int size )
    {
        this.numGumballs = size;
        this.totalCoinsAmount=0;
    }

    public void insertCoin(int coin)
    {
    	if (this.totalCoinsAmount >= 50)
    		System.out.println("Only 50 cents are accepted, please turn the crank!!");
    	else
    		totalCoinsAmount=totalCoinsAmount+coin;
    }
    
    public void turnCrank()
    {
    	if ( this.totalCoinsAmount >= 50 )
    	{
    		if ( this.numGumballs > 0 )
    		{
    			this.numGumballs-- ;
    			this.totalCoinsAmount=0;
    			System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "50 cents are required, you inserted "+this.totalCoinsAmount) ;
    	}        
    }
}