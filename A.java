/**
class A {    
    public static void main(String[] args) {        
     
        int [] arr = new int [] {9,4,2,6,7,1,5,3,2,8};     
        int temp = 0;    
                
   
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
  
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}
**/
class A {    
    public static void main(String[] args) {  
int sum=0,i;
    boolean add = true;
    int[] array = new int[]{6,7,6,1,2,4,5,6,7};
    for(i=0; i<array.length;i++)
    {

        if(array[i] != 6 && add==true)
            sum = sum+array[i];
        else if(array[i] == 6){
            if((i+1) == array.length)
                sum = sum+array[i];
            else
                add = false;
        }
        else if(array[i] == 7)
            add = true;

    }
    System.out.println(sum);
}
}

  