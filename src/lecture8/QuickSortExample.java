package lecture8;

public class QuickSortExample {

	public static void quickSort(int[] input, int beginIndex,int endIndex)
	{
		if(beginIndex >= endIndex)
			return;
		
		int pivotPos = partition(input,beginIndex,endIndex);
		quickSort(input, beginIndex, pivotPos-1);
		quickSort(input, pivotPos+1, endIndex);
	}
	
	public static int partition(int[] arr, int begin, int end)
	{
		int count = begin;
	
		int pivot = arr[begin];
		
		for(int i = begin+1; i <= end;i++)
		{
			if(arr[i] <= pivot)
				count++;
		}
		
		int temp = arr[count];
		arr[count] = pivot;
		arr[begin] = temp;
		
		int i = begin;
		int j = end;
		
		while(i< count && j>count)
		{	
			while(arr[i] <= pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
			
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int b[] = {2,2,2,-1,-4,4,4,0,0,0,0,-9};
		int a[] = {8,2,6,5,1,9,4,13};
		quickSort(a, 0, a.length-1);
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\n");
		
		quickSort(b, 0, b.length-1);
		for(int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}

}
