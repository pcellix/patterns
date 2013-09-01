import java.util.Random;


public class WinnerState implements State {
	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Error");			
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Error");
	}

	@Override
	public void turnCrank() {
		System.out.println("Error");
	}

	@Override
	public void dispense() {
		System.out.println("Youre Winner!!");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Out of balls");
				gumballMachine.setState(gumballMachine.getSoldOutState());
				gumballMachine.refill(10);
			}
		}
		
	}

}
