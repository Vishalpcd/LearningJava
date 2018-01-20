package compareToAndComparator;

public class Mobile /*implements Comparable<Mobile>*/ {
	private String brand;
	private double price;
	private int rom;
	public Mobile(String brand, double price, int rom) {
		super();
		this.brand = brand;
		this.price = price;
		this.rom = rom;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", rom=" + rom + "]";
	}
	/*@Override
	public int compareTo(Mobile mob2) {
		if(this.getRom()>mob2.getRom())
		{
			return -1;
		}
		else if(this.getRom()<mob2.getRom())
		{
			return +1;
		}
		else
		{
			return 0;
		}
		
	}*/
	

}
