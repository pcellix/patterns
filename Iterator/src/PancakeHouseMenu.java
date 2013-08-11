import java.util.Iterator;
import java.util.ArrayList;


public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("good", "better");
		
	}
	
	public void addItem(String name, String description) {
		MenuItem menuItem = new MenuItem(name, description);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return  menuItems.iterator();
	}
	
}

