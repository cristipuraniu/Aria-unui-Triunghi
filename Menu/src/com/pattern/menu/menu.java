package com.pattern.menu;
 
/**
   * Interfata meniului
 */
public interface menu {
	/**
	  * Adaug produsele
	 * @param item
	 */
	void addItem(MenuItem item);
	/**
	  * Afiseaza preturile la toate produsele
	 */
	void printItems();
	/**
	  * Adaug un submeniu
	 * @param FoodMenu
	 */
	void addSubMenu(menu FoodMenu);
}
 
