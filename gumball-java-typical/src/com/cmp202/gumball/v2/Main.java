package com.cmp202.gumball.v2;
public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine;
		
		//Insert 2 quarters and turn the crank
		System.out.println("---Insert 2 quarters and turn the crank--");
		gumballMachine = new GumballMachine(5);
		for(int i=0;i<2;i++){
			gumballMachine.insertQuarter( 25 );
		}
		gumballMachine.turnCrank();
		
		//Insert 1 quarter and turn the crank
		System.out.println("---Insert 1 quarter and turn the crank--");
		gumballMachine = new GumballMachine(5);
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		
		//Insert 3 quarters and turn the crank
		System.out.println("---Insert 3 quarters and turn the crank--");
		gumballMachine = new GumballMachine(5);
		for(int i=0;i<3;i++){
			gumballMachine.insertQuarter( 25 );
		}
		gumballMachine.turnCrank();
	}	
		
}