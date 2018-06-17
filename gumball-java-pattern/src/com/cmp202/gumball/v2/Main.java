package com.cmp202.gumball.v2;

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine;
		
		//Insert 10,25,10,5,10 coin and turn the crank
		System.out.println("---No coin and turn the crank--");
		gumballMachine = new GumballMachine(5, 50);
		System.out.println(gumballMachine);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
				
		// Insert coins 10,25,10,5 and turn the crank
		System.out.println("\n---Insert coins 10,25,10,5 and turn the crank, repeat 6 times--");
		gumballMachine = new GumballMachine(5, 50);
		System.out.println(gumballMachine);
		for(int i=0;i<5;i++) {
			gumballMachine.insertCoin(10);
			gumballMachine.insertCoin(25);
			gumballMachine.insertCoin(10);
			gumballMachine.insertCoin(5);
			gumballMachine.turnCrank();	
		}
		System.out.println(gumballMachine);

		// Insert 10,25,10 coin and turn the crank
		System.out.println("\n---Insert 10,25,10 coin and turn the crank--");
		gumballMachine = new GumballMachine(5, 50);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		//Insert 10,25,10,5,10 coin and turn the crank
		System.out.println("\n---Insert 10,25,10,5,10 coin and turn the crank--");
		gumballMachine = new GumballMachine(5, 50);
		System.out.println(gumballMachine);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
	}
}
