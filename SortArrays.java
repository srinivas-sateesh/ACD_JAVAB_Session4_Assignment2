import java.util.*;
public class SortArrays {

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = reader.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements of array");
		for (int i = 0; i < size; i++)
		{
			arr[i] = reader.nextInt();			
		}
		for(int i = 0; i < size; i++)
			for(int j = i+1; j< size; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
	System.out.println("Sorted Array: " + Arrays.toString(arr));
	System.out.println("Enter another element");
	int insertnum = reader.nextInt();
	int[] newarray = new int[size+1];
	 for(int i = 0; i < size; i++)
		 newarray[i] = arr[i];
	 newarray[size] = insertnum;
	 Arrays.sort(newarray);
	 System.out.println("Sorted Array AFTER insertion: " + Arrays.toString(newarray));
	}
}
