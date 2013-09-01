
public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs) {
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState =  new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		if (numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("Here comes the ball!!");
		if (count != 0) {
			count = count - 1;
		}
	}
	
	State getNoQuarterState() {
		return noQuarterState;
	}
	
	State getSoldOutState() {
		return soldOutState;
	}
	
	State getHasQuarterState() {
		return hasQuarterState;
	}
	
	State getSoldState() {
		return soldState;
	}
	State getWinnerState() {
		return winnerState;
	}
	
	int getCount() {
		return count;
	}

}
