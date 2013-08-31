import java.util.ArrayList;


public class MenuTestDrive {
	
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "pancakes");
		MenuComponent dinerMenu = new Menu("Dinner menu", "dinner menu");
		MenuComponent allMenus = new Menu("Main menu","All items");
		allMenus.add(dinerMenu);
		allMenus.add(pancakeHouseMenu);
		dinerMenu.add(new MenuItem("ss", "Sdasd", false));
		Waitress waitress = new Waitress(allMenus);
		waitress.printVegetarian();
	}

}
