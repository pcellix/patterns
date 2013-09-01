import java.util.Random;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;


public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert another quarter");
		
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (gumballMachine.getCount() > 1)) {
			System.out.println("Winner!!");
			gumballMachine.setState(gumballMachine.getWinnerState());
			return;
		}
		System.out.println("Not Winner!!");
	    gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
		
	}
	
	
}
