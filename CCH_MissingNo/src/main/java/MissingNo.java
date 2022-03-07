
import java.util.Scanner;

public class MissingNo {
	
	public static void main(String arg[]) {
		System.out.println("Enter the series with missing number with space separation");
		Scanner scanner = new Scanner(System.in);
		String series = scanner.nextLine();
		
		
		String[] arrString = series.split(" ");
		int[] arr = new int[arrString.length];
		
		for(int i=0;i<arrString.length;i++) {
		arr[i] = Integer.parseInt(arrString[i])	; 			
		}
		
		
		MissingNo missingNo = new MissingNo();
		arr = missingNo.bubbleSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); 
			
	}
		missingNo.checkSeries(arr);
	}
	
		private int[] bubbleSort(int[] arr) {
    
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {        	
            for (int j = 0; j < n-i-1; j++) 
            {
            	if (arr[j] > arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr; 
    }
	
	
	public void checkSeries(int arr[]) {
	
		int missing = 0;
		int numberCount = 0;
		int temp = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(temp == arr[i]) {
				temp++;
			}
			else
			{
				missing = temp;
				numberCount++;
				temp = temp+2;
				
			}
			
		}
		if (numberCount==1) {
			System.out.println("the number in the missing series is " +missing);
		}else if(numberCount == 0) {
			System.out.println("the number in the missing series is " +(arr[arr.length-1]+1));
		}	
		else {
			System.out.println("series contain more than one missing number");
			
		}
		
		
		
		
		
		
	
}

	


}
