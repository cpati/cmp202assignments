package com.cmp202.gumball.v2;


public interface State {
 
	public void insertCoin(int coin);
	public void ejectCoin();
	public void turnCrank();
	public void dispense();
}
