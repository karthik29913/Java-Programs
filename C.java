/**
class C { 
    public static void main(String[] args) 
    { 
        int array[] = new int[args.length]; 
        int max=0; 
for(int i=0; i<args.length; i++) 
{ 
    array[i]=Integer.parseInt(args[i]); 
    if(max<array[i]) 
    { 
        max=array[i]; 
    } 
} 
boolean array1[] = new boolean[max+1]; 
for(int i=0; i<args.length; i++) 
{ 
    if(array1[array[i]]==false) 
    { 
        System.out.print(array[i]+" "); 
        array1[array[i]]=true; 
    } 
} 
    }}
**/
/**
class  C{
public static void main(String[] args) {
int [][] x = new int[3][];	
x[0] = new int[3]; 
x[1] = new int[2];
x[2] = new int[5];
for(int i=0;  i < x.length; i++) {	
   for (int j=0; j < x[i].length; j++) {  
		x[i][j] = i;  System.out.print(x[i][j]);
 	}
	System.out.println();
	}
     }
}
**/
//Java program to find the most frequent element
//in an array
import java.util.*;

class GFG {
	
	static int mostFrequent(int arr[], int n)
	{
		
		// Sort the array
		Arrays.sort(arr);
		
		// find the max frequency using linear
		// traversal
		int max_count = 1, res = arr[0];
		int curr_count = 1;
		
		for (int i = 1; i < n; i++)
		{
			if (arr[i] == arr[i - 1])
				curr_count++;
			else
			{
				if (curr_count > max_count)
				{
					max_count = curr_count;
					res = arr[i - 1];
				}
				curr_count = 1;
			}
		}
	
		// If last element is most frequent
		if (curr_count > max_count)
		{
			max_count = curr_count;
			res = arr[n - 1];
		}
	
		return res;
	}
	
	// Driver program
	public static void main (String[] args) {
		
		int arr[] = {1, 5, 2, 1, 3, 2, 1};
		int n = arr.length;
		
		System.out.println(mostFrequent(arr,n));
		
	}
}

// This code is contributed by Akash Singh.
