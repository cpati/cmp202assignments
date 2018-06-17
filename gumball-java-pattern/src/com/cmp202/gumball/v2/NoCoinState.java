package com.cmp202.gumball.v2;


public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		System.out.println("You inserted a coin "+coin);
		this.gumballMachine.hasCoinAmount=this.gumballMachine.hasCoinAmount+coin;
		//gumballMachine.setState(gumballMachine.getHasCoinState());
		gumballMachine.setState(new HasCoinState(this.gumballMachine));
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
