package strategyDesignPattern;

public class Context {
	
	private Sorter sorter;
	
	public Context(Sorter sorter) {
		this.sorter = sorter;
	}

	
	public void Sort(Produit[] array, String option) {
		sorter.sort(array, option);
	}
	

}
