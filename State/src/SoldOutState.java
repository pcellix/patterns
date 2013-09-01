
public class SoldOutState implements State{
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert machine is sold out");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You cant eject there's no quarter");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Does not work");
		
	}

	@Override
	public void dispense() {
		System.out.println("Does not work");
		
	}

	
}
