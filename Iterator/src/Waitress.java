import java.util.ArrayList;
import java.util.Iterator;


public class Waitress {
	MenuComponent allMenus;
 	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarian() {
		Iterator iterator = allMenus.createIterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegatarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}

}
