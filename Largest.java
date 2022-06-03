import java.util.Arrays;
 class largestno
 {
 public static void main(String args[])
	 {
		 int largest=0;
		 int secondLargest=0;
		 
		 int arr[]={22, 33, 11, 44};
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 if(arr[i]>largest)
			 {
				 secondLargest=largest;
				 largest=arr[i];
			 }
			 else if(arr[i]>secondLargest)
			 {
				secondLargest=arr[i];
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println("2nd Largest no :"+secondLargest);
	 }
 }