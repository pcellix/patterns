import java.util.Iterator;


public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancake =  pancakeHouseMenu.createIterator();
		Iterator diner =  dinerMenu.createIterator();
		printMenu(pancake);
		printMenu(diner);
	}
	
	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem =  (MenuItem) iterator.next();
			System.out.println(menuItem.getName());
			
		}
	}

}
