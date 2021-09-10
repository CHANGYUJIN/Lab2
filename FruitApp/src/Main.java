import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Create arraylist of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (orderd by name)");
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1); //adding Fruit class object
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2); //adding Fruit class object
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Mango", 2500));
		fl.add(new Fruit(105, "Banana", 3000));
		fl.add(new Fruit(106, "Dragonfruit", 3500));
		fl.add(new Fruit(107, "Grapefruit", 4000));
		fl.add(new Fruit(108, "Strawberry", 4500));
		fl.add(new Fruit(109, "Pineapple", 5000));
		fl.add(new Fruit(110, "Melon", 5500));
		
		Collections.sort(fl, new FruitComparator());
		//Traverse elements of arraylist (ordered)
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
	
		Collections.sort(fl, new FruitComparatorDesc());
		//Traverse elements of arraylist (reverse ordered)
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
		
	}

}
