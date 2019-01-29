
public class BubbleSort {

	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }
	
	public static void main(String[] args) {
		BubbleSort obj= new BubbleSort();
		int m[]= {27,6,88,45,21,9,16};
		int l=m.length;
		System.out.println("Original array: ");
		obj.printArray(m);
		for(int i=0;i<l-1;i++) {
			for (int j=0;j<l-i-1;j++) {
				if(m[j]>m[j+1])
				{
					int temp=m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		obj.printArray(m);

	}

}
