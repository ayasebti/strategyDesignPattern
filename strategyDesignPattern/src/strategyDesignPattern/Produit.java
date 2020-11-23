package strategyDesignPattern;

public class Produit {
	String name;
	float price;
	float value;
	
	public Produit(String name, float price, float value){
		this.name=name;
		this.price=price;
		this.value=value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	public int compareToProduct(Produit p, String option) {
		switch(option){
		case "name":
			int result=this.name.compareTo(p.name);
			if (result>0) return 1;
			else if (result<0) return -1;
			else return 0;
			
		case "price":
			if (this.price>p.price) return 1;
			else if (this.price<p.price) return -1;
			else return 0;
			
		case "value":
			if (this.value>p.value) return 1;
			else if (this.value<p.value) return -1;
			else return 0;
			
		default:
			return 99;	

		}
	}
	

}
