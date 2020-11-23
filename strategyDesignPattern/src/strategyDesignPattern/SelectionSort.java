package strategyDesignPattern;

public class SelectionSort implements Sorter{

	@Override
	public void sort(Produit[] array, String option) {
		
		System.out.println("Welcome to selection sort, this is your sorted array:");
		
		int size = array.length;

	      for (int i = 0 ;i< size-1; i++){
	         int min = i;

	         for (int j = i+1; j<size; j++){
	            if (array[j].compareToProduct(array[min], option)==-1 ){
	            	min = j;
	            }
	         }
	         Produit temp = array[min];
	         array[min] = array[i];
	         array[i] = temp;
	      }

	      for (int i = 0 ;i< size; i++){
	    	  System.out.println(String.valueOf(i+1)+" "+array[i].name+" "+array[i].price+ " "+array[i].value);
	      }
		
	}

}
