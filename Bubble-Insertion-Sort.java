/******************************************************************************

                            VINAYAKA MUDRADI
*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void selectionSort(String[] arr){
        String minVal = arr[0];
        int index = -1;
        int j = 0;
        for(j=0; j<arr.length; j++){
            minVal = arr[j];
            index = j;
            for(int i=j+1; i<arr.length; i++){
                if(arr[i].compareTo(minVal) < 0){
                    minVal = arr[i];
                    index = i;
                }
            }
            String temp = arr[j];
            arr[j] = minVal;
            arr[index] = temp;
            
        }
        System.out.println("\n\nArray After Selection Sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(String[] arr){
        for(int j=0; j<arr.length; j++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i].compareTo(arr[i+1]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("\n\nArray After Bubble Sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
	    String[] arr;
	    int size = 0;
	    Scanner scan = new Scanner(System.in);
	    while(true){
	        System.out.println("Enter the Size of the Array:");
	        size = scan.nextInt();
	        if(size < 1){
	            System.out.println("Sorry.! Cannot create array of size "+size);
	        }
	        else{
	            break;
	        }
	    }
	    
	    arr = new String[size];
	    System.out.println("New Empty Array Has Got Created..!");
	    System.out.println("Enter the elements of the array:");
	    for(int i=0; i<arr.length; i++){
	        arr[i] = scan.next();
	    }
	    System.out.println("New Array Got Populated.!");
	    selectionSort(arr);
	    bubbleSort(arr);
		
	}
}

