import java.util.Comparator;

public class Fruit {
	int no;
	String name;
	int price;
	
	
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Student" + "[no=" + no + ", " + "name=" + name + ", " + "age=" + price + "]";
	}
	
	
	class FruitComparatorDesc implements Comparator<Fruit>{

		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
		
	}
}
