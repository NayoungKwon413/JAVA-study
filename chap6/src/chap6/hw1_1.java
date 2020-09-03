package chap6;

public class hw1_1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		  for(int i = 0; i<arr.length; i++) {
		   arr[i] = (int)(Math.random()*100)+1;
		  }
		  
		  for(int i = 0; i<arr.length; i++) {
		   for(int j = 0; j<arr.length-1-i; j++) {
		    if(arr[j]>arr[j+1]) {
		     int tmp = arr[j];
		     arr[j] = arr[j+1];
		     arr[j+1] = tmp;
		    }
		   }
		  }
		  
		  for(int a : arr) {
		   System.out.print(a + " ");
		  }

	}

}
