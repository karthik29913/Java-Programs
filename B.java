/**
class B 
{
 
public static void main(String[] args) {

   int[] my_array = {1,2,3,4,5,6,7,8,9};
   int Index_position = 4;
   int newValue    = 10;

  System.out.println("Original Array : "+Arrays.toString(my_array));     
   
  for(int i=my_array.length-1; i > Index_position; i--){
    my_array[i] = my_array[i-1];
   }                                                                                                   
   my_array[Index_position] = newValue;
   System.out.println("New Array: "+Arrays.toString(my_array));
 }
 }
**/

class B{
public static int removeDuplicates(int array[], int n){
if(n==0 || n==1){
return n;
}
int j = 0;//for next element
for (int i=0; i < n-1; i++){
if (array[i] != array[i+1]){
array[j++] = array[i];
}
}
array[j++] = array[n-1];
return j;
}

public static void main (String[] args) {
int array[] = {12,34,12,45,67,89};
int length = array.length;
length = removeDuplicates(array, length);
//printing array elements
for(int i=0; i<length; i++)
System.out.print(array[i]+" ");
}
}


/**
class  B{
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


