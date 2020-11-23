package strategyDesignPattern;

public class QuickSort implements Sorter{
	

	@Override
	public void sort(Produit[] array, String option) {
		
		System.out.println("Welcome to quick sort, this is your sorted array:");
		
		int size = array.length;
		
		int low = 0;
		int high = size-1;
		
		sorter(array, low, high, option);
		for (int i = 0 ;i< size; i++){
			System.out.println(String.valueOf(i+1)+" "+array[i].name+" "+array[i].price+ " "+array[i].value);
	      }
		
	}
	

	 int partition(Produit array[], int low, int high, String option) { 
	     Produit pivot = array[high];  
	     int i = (low-1);
	     for (int j=low; j<high; j++) { 
	         if (array[j].compareToProduct(pivot, option)==-1 ) { 
	             i++; 
	             Produit temp = array[i]; 
	             array[i] = array[j]; 
	             array[j] = temp; 
	         } 
	     } 
	
	     Produit temp = array[i+1]; 
	     array[i+1] = array[high]; 
	     array[high] = temp; 
	
	     return i+1; 
	 } 
	
	 void sorter(Produit array[], int low, int high, String option) { 
	     if (low < high) { 
	         int pi = partition(array, low, high, option); 
	         sorter(array, low, pi-1, option); 
	         sorter(array, pi+1, high, option); 
	     } 
	 }

}
