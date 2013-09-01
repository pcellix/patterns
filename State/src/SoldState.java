
public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("We are giving you a gumball!");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry it's already too late");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesnt get you another gumball!");
	}

	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else { 
			System.out.println("Oops we run out balls");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}		
	}	
}
