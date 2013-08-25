import java.util.ArrayList;


public class MenuTestDrive {
	
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		menuList.add(dinerMenu);
		menuList.add(cafeMenu);
		menuList.add(pancakeHouseMenu);
		Waitress waitress = new Waitress(menuList);
		
		waitress.printMenu();
		
	}

}
