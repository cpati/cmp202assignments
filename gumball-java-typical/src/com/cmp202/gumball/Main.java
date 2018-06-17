package com.cmp202.gumball;
public class Main {

	public static void main(String[] args) {
		int size=5;
		GumballMachine gumballMachine = new GumballMachine(size);

		//System.out.println(gumballMachine);
		for(int i=0;i<size+1;i++){
			gumballMachine.insertQuarter( 25 );
			gumballMachine.turnCrank();
		}
	}	
		
}