package hw13A;


public class Snack extends Product implements Comparable, Cloneable{
	private int gramsOfFat;
	
	public Snack(String desc, double price, int fat) {
		super(desc, price);
		gramsOfFat = fat;
	}
	public int getGramsOfFat() {
		return gramsOfFat;
	}
	public boolean isHealthier(Snack other) {
		if(gramsOfFat < other.gramsOfFat)
			return true;
		else {
			return false; 
		}
	}
	public String toString() {
		String temp = super.toString();
		temp += "[gramsOfFat=" + gramsOfFat + "]";
		return temp;
	}
	public boolean equals(Object otherObject) {
		if(!(otherObject instanceof Snack)) {
			return false;
		}
		if(!super.equals(otherObject)) {
			return false;
		}
		Snack other = (Snack) otherObject;
		if(gramsOfFat == other.gramsOfFat) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int compareTo(Object o) {
		Snack other = (Snack) o;
		int compare =0;
		if(gramsOfFat == other.gramsOfFat) {
			if(this.getPrice() == other.getPrice()) {
				compare = this.getDescription().compareTo(other.getDescription());
			}
			else {
				compare = Double.compare(this.getPrice(), other.getPrice());
			}
		}
		else {
			compare = gramsOfFat - other.gramsOfFat;
		}
		return compare;
	}
	
	public Object clone() {
		return new Snack(this.getDescription(), this.getPrice(), gramsOfFat);
	}
}
