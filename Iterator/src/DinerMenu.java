import java.util.Iterator;


public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[6];		
		addItem("jajecznica", "na mleku");
		addItem("jajecznica1", "na boczku");
	}
	
	public void addItem(String name, String description) {
		MenuItem menuItem = new MenuItem(name, description);
		if(numberOfItems >=  MAX_ITEMS) {
			System.err.println("Error");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator createIterator() {
		return (Iterator) new DinerMenuIterator(menuItems);
	}		
}
