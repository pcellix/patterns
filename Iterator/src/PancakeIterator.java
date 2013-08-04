import java.util.ArrayList;


public class PancakeIterator implements Iterator {

	ArrayList menuItems;
	int position;
	
	public PancakeIterator(ArrayList items) {
		this.menuItems = items;
		position = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(position	 >= menuItems.size() || menuItems.get(position) == null) {		
			return false;
		} else {
			return true;
		}		
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem) menuItems.get(position);
		position = position + 1;
		return menuItem;
	}
}
