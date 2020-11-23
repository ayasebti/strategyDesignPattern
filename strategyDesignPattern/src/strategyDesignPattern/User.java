package strategyDesignPattern;


public class User {

	public static void main(String[] args) {
	
		
		Produit p1=new Produit("banane", 15, 100);
		Produit p2=new Produit("pomme", 10, 40);
		Produit p3=new Produit("kiwi", 25, 60);
		Produit p4=new Produit("ananas", 50, 110);
		Produit p5=new Produit("fraise", 13, 55);
		
		Produit[] array = new Produit[]{p1, p2, p3, p4, p5};
				
		new Context(new QuickSort()).Sort(array, "price");
		System.out.println("\n");
		new Context(new BubbleSort()).Sort(array,"name");
		System.out.println("\n");
		new Context(new SelectionSort()).Sort(array, "value");
		
		

	}

}
