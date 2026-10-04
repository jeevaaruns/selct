import java.util.Arrays;

public class Selectionsort{
    static void selectionsort(int[] arr){
        int n = arr.length;
        
        for(int i = 0 ; i < n - 1 ; i ++){
            int min_idx = i;
            
            for(int j = i + 1 ; j < n ; j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
                
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            
        }
    }
    
    static void printArray(int[] arr , int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr , index + 1);
    }
    
    static int findposition(int[] arr , int value){
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == value){
                return i;
            }
        }
        return - 1;
    }
    
    public static void main(String[] args){
        int[] arr = {75 , 68 , 34 , 25 , 27 , 13 , 4};
        int[] original = arr.clone();
        
        System.out.print("Original array : ");
        printArray(original , 0);
        
        selectionsort(arr);
        
        System.out.print("\n Sorted Array : ");
        printArray(arr , 0);
        
        System.out.print("\n\n Position changes : ");
        
        for(int i = 0 ; i < original.length ; i ++){
            int before = i;
            int after = findposition(arr , original[i]);
            
            System.out.println(original[i] + " : position " + before +" -> position " + after);
            
        }
    }    
    
    
}