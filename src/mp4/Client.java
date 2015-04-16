package mp4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Scanner;

class Client {
	private static Inventory inventory;
	private static Projection projection;
	
	public static void main(String[] args) throws IOException {
		
		// loop through:
		// ask user what they want to do
		// list out options
		// call function based on choice
		
		System.out.println("Welcome! Press <ENTER> to begin!");
		
		String line;
		Scanner scanner;
		BufferedReader lineReader;
		
		while(true) // loops until 'q' is entered
		{
			lineReader = new BufferedReader(new InputStreamReader(System.in));
			
			while((line = lineReader.readLine()) != null) // stops reading at end of line
			{
				scanner = new Scanner(line);
				
				char ch = 'z';
				if(scanner.hasNext())
					ch = scanner.next().charAt(0); // gets first character
				
				if(ch == 's') // input sales
					GetSalesFromPrevDay();
				else if(ch == 'l') // get shopping list
					GetShoppingList();
				else if(ch == 'i') // list inventory
					ListInventory();
				else if(ch == 'a') // display list
					AddToInventory();
				else if(ch == 'q') // quit program
					System.exit(0);
				
				System.out.println("Options:\n <s> - input sales\n <l> - get shopping list\n <i>"
						+ " - list inventory\n <a> - add to inventory\n <q> - quit program\n\n");
			}
		}
	}
	
	public static void GetSalesFromPrevDay() {
		// let user input burgers
		// >> Enter # of hamburgers sold
		// 7
		// create an instance of HamburgerFactory
		// createBurger(7);
		// for every burger type
	}

	public static void GetShoppingList() {
		Date now = new Date(0);
		Product[] p = inventory.GenerateShoppingList(projection, now);
	}
	
	public static void ListInventory() {
		inventory.ListInventory();
	}
	
	public static void AddToInventory() {
		// ask user what they want to add
		// ask for expiration date
		// ask for amount
		// make new product and call inventory.AddProduct()
	}
}
