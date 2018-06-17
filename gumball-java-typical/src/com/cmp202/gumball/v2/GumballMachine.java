package com.cmp202.gumball.v2;


public class GumballMachine
{

    private int numGumballs;
    private int numQuarters=0;

    public GumballMachine( int size )
    {
        this.numGumballs = size;
        this.numQuarters=0;
    }

    public void insertQuarter(int coin)
    {
    	if (this.numQuarters==2)
    		System.out.println("Only 2 quarters are accepted, please turn the crank!!");
        if ( coin == 25 )
        	this.numQuarters++;
        else 
            System.out.println("Please enter a quarter!!");
    }
    
    public void turnCrank()
    {
    	if ( this.numQuarters >= 2 )
    	{
    		if ( this.numGumballs > 0 )
    		{
    			this.numGumballs-- ;
    			this.numQuarters=0;
    			System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "2 quarters are required, you inserted "+this.numQuarters) ;
    	}        
    }
}