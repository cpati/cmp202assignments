package com.cmp202.gumball.v3;
public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine;
		
		//Insert coins 10,25,10,5 and turn the crank
		System.out.println("---Insert coins 10,25,10,5 and turn the crank--");
		gumballMachine = new GumballMachine(5);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(5);
		gumballMachine.turnCrank();
		
		//Insert 10,25,10 coin and turn the crank
		System.out.println("---Insert 10,25,10 coin and turn the crank--");
		gumballMachine = new GumballMachine(5);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
		
		//Insert 10,25,10,5,10 coin and turn the crank
		System.out.println("---Insert 10,25,10,5,10 coin and turn the crank--");
		gumballMachine = new GumballMachine(5);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(25);
		gumballMachine.insertCoin(10);
		gumballMachine.insertCoin(5);
		gumballMachine.insertCoin(10);
		gumballMachine.turnCrank();
	}	
		
}