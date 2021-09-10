import java.lang.reflect.Array;
import java.util.ArrayList;
public class array {
    public static void main(String[] args){
        /**int[]arr = new int [10];
        for(int i = 0;i < args.length;i++){
            arr[i] = Integer.parseInt(args[i]);
        }
        int max = arr[0],c1 = 0,max2 = 0,sum = 0;
        int min = arr[0];
        for(int j = 0;j < arr.length;j++) {
            if (arr[j] > max) {
                max = arr[j];
                c1 = j;
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }**/
        /**for(int k=0; k < arr.length; k ++){
            if (arr[k] == arr[c1] || arr[k] == arr[c2]){
                continue;
            }
            else{
                if(arr[k] > max2){
                    max2 = arr[k];
                }
                if(arr[k] < min2){
                    min2 = arr[k];
                }
            }
        }
        System.out.println(max2);
        System.out.println(min2);**/

        //2
        /**for(int k = 0;k < arr.length; k++){
            if(arr[k] == min){
                continue;
            }
            else{
                sum = sum + arr[k];
            }
        }
        System.out.println(sum);**/

        //3
        /**int[]arr2 = {1,4,34,56,7};
        int n = 56;
        int i = 0;
        boolean x = false;
        for(int k = 0;k < arr2.length;k++){
            if (arr2[k] == n){
                x = true;
                i += k;
            }
        }
        if(x == true){
            System.out.println(i+1);
        }
        else{
            System.out.println(-1);
        }**/

        //4
       /** int temp = 0;
        for(int j = 0;j < arr.length;j++){
            for(int k = j+1; k < arr.length;k++){
                if(arr[j] > arr[k]){
                    temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int l = 0;l < arr.length;l++){
            System.out.println(arr[l]);
        }**/

       //5
       /**int[]arr = {1,6,2,7,1,6,3,4,7,6,6,7,7};
        int indsix = 0,indsev = 0,sum = 0;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] == 6){
                indsix = i;
            }
            if(arr[i] == 7) {
                indsev = i;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(j >= indsix && j <= indsev){
               arr[j] = 0;
            }
            else{
                sum += arr[j];
                System.out.println(arr[j]);
            }
        }
        System.out.println(sum);**/

       // 3
        /**int arr[] = new int[]{1,2,3,4,5};
        int n = 5, ind = 2;
        for(int i = 0; i < arr.length; i++){
            if(i == ind){
                arr[i] = n;
            }
            System.out.println(arr[i]);**/
        /**int[]arr = {1,6,2,7,1,6,3,4,7,6,6,7,7};
        boolean flag = false;
        int ignoredsum = 0;
        int totalsum = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == 6){
                flag = true;
            }
            if(flag == true){
                ignoredsum += arr[i];
            }
            if(arr[i] == 7){
                flag = false;
            }
        }
        System.out.println(ignoredsum);**/
        
        /**int arr[] = {1, 2, 3, 4, 5, 6,7, 8, 9, 0};
        int ind = 3, val = 10;
        int exs = arr[ind];
        arr[ind] = val;
        arr[arr.length - 1] = exs;
        for(int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }
        for (int i = arr.length - 1;i >= ind;i --){
            arr[i] = arr[i - 1];
        }
        arr[ind] = val;
        for(int j = 0; j < arr.length ; j++){
            System.out.println(arr[j]);
        }**/

        /**int arr[] = {12, 34, 12, 45, 67, 89};
        int pos = 0;
        for(int i =0; i< arr.length;i ++){
            for(int j = 1; j < arr.length; j++){
                if(arr[i] == arr[j]) {
                   arr[j] = 0;
                   pos = j;
                }
            }
            break;
        }
        for(int k = pos+1;k < arr.length; k++){
            arr[k - 1] = arr[k];
        }
        for(int l = 0; l < arr.length; l++){
            System.out.println(arr[l]);
        }**/
    }
}

