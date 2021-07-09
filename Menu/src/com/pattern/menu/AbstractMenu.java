package com.pattern.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public abstract class AbstractMenu implements menu {
	private Collection<menu> menus = new ArrayList<menu>();
	/**
	  * Salvez produsele meniului curent
	 */
	private Collection<MenuItem> menuItems = new ArrayList<MenuItem>();
	
	public void addSubMenu(menu menu){
		menus.add(menu);
	}
 
	public void addItem(MenuItem item) {
		menuItems.add(item);
	}
 
	public void printItems() {
		printMyMenusItems();
		printMyItems();
	}
 
	/**
	  * Afisez produsele la toate submeniurile in meniul curent
	 */
	private void printMyMenusItems() {
		Iterator<menu> menusItrator = menus.iterator();
		while (menusItrator.hasNext()) {
			menu menu = (menu) menusItrator.next();
			menu.printItems();
		}
	}
	/**
	  * Afisez produsele si preturile in meniul curent
	 */
	private void printMyItems() {
		Iterator<MenuItem> itemsIterator = menuItems.iterator();
		while (itemsIterator.hasNext()) {
			MenuItem menuItem = (MenuItem) itemsIterator.next();
			menuItem.price();
		}
	}
 
}
 


