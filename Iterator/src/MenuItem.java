import java.util.Iterator;


public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean isVeg;
	
	public MenuItem(String name, String description, boolean isVeg) {
		this.name = name;
		this.description = description;
		this.isVeg = isVeg;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public boolean isVegatarian() {
		return isVeg;
	}
	
	public void print() {
		System.out.println(getName() + " " + getDescription());
	}	
	
	public Iterator createIterator() {
		return new NullIterator();
	}

}
