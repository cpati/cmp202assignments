package com.cmp202.gumball.v2;

public class HasCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		System.out.println("You inserted a coin "+coin);
		if (this.gumballMachine.hasCoinAmount >= this.gumballMachine.maxCoinAmount)
			System.out.println("You can't insert another coin, you already have "+this.gumballMachine.hasCoinAmount);
		this.gumballMachine.hasCoinAmount=this.gumballMachine.hasCoinAmount+coin;
	}
 
	public void ejectCoin() {
		System.out.println("Quarter returned");
		//gumballMachine.setState(gumballMachine.getNoCoinState());
		gumballMachine.setState(new NoCoinState(this.gumballMachine));
	}
 
	public void turnCrank() {
		if (this.gumballMachine.hasCoinAmount < this.gumballMachine.maxCoinAmount) {
			System.out.println("You inserted "+this.gumballMachine.hasCoinAmount+",you need to insert "+this.gumballMachine.maxCoinAmount);
			return;
		}
		System.out.println("You turned...");
        //this.gumballMachine.hasCoinAmount=0;
		//gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.setState(new SoldState(this.gumballMachine));
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
