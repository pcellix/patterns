import java.util.Hashtable;
import java.util.Iterator;


public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable();
	
	public CafeMenu() {
		addItem("kawka","nastawki");
	}
	
	public void addItem(String name, String description) {
		MenuItem menuItem = new MenuItem(name, description);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
         return menuItems.values().iterator();
	}
	

}
