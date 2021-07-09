import com.pattern.menu.MenuItem;
import com.pattern.menu.menu;

public class Composite {

	public static void main(String[] args) {
		// TODO Metoda generata automat
		MenuItem Beer = new Beer();
		MenuItem Wine = new Wine();
		MenuItem Ribs = new Ribs();
		MenuItem Pasta = new Pasta();
		MenuItem Cigarettes = new Cigarettes();
		 // generarea tuturor  meniurilor
		menu DrinksMenu = new DrinksMenu();
		menu FoodMenu = new FoodMenu();
		menu oursMenu = new OursMenu();
		 // adaug produsele la meniurile potrivite
		FoodMenu.addItem(Ribs);
		FoodMenu.addItem(Pasta);
		DrinksMenu.addItem(Beer);
		DrinksMenu.addItem(Wine);
		 // Combin submeniurile si produsele in meniul general al restaurantului
		oursMenu.addSubMenu(DrinksMenu);
		oursMenu.addSubMenu(FoodMenu);
		oursMenu.addItem(Cigarettes);
		 // Afisez preturile la toate produsele
		oursMenu.printItems();

	}

}
