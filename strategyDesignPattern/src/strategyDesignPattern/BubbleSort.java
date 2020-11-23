package strategyDesignPattern;

public class BubbleSort implements Sorter{

	@Override
	public void sort(Produit[] array, String option) {
		System.out.println("Welcome to bubble sort, this is your sorted array:");
		int n = array.length;  
        Produit temp = null;  
         for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                 if(array[j-1].compareToProduct(array[j], option)==1){  
	                 temp = array[j-1];  
	                 array[j-1] = array[j];  
	                 array[j] = temp;  
                 }  
                          
             }  
         }
         for(int i = 0 ;i< n; i++){
	         System.out.println(String.valueOf(i+1)+" "+array[i].name+" "+array[i].price+ " "+array[i].value);
	      }
		
	}

}
