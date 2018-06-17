package com.cmp202.gumball.v2;


public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        this.gumballMachine.hasCoinAmount=0;
    }
       
	public void insertCoin(int coin) {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectCoin() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}
 
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			//gumballMachine.setState(gumballMachine.getNoCoinState());
			gumballMachine.setState(new NoCoinState(this.gumballMachine));
		} else {
			System.out.println("Oops, out of gumballs!");
			//gumballMachine.setState(gumballMachine.getSoldOutState());
			gumballMachine.setState(new SoldOutState(this.gumballMachine));
		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


