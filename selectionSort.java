/*edited by Christian Cyr 6/3/2022
 This program is a simple selection sort of an array given
 It sorts from smallest to largest when selectSort is called then
 it prints out each sorted value on its own line.
*/
//somethin
public class selectionSort{
    public static void main(String[] args){
        int [] array = {1,5,7,2,3,4,9};
        //call to sort array passed in param
        selectSort(array);
        //for loop prints array int by int after sorted
        for(int i = 0; i < array.length-1;i++){
            System.out.println(array[i]);
        }
    
        
    }
    //pre: given an array
    //post: end up with a sorted array from smallest to largest
    public static void selectSort(int[]arr){
        int  minPointer, minVal;
        //for loop from 0 to second to last position
        for(int startScan = 0; startScan<arr.length-1;startScan++){
            //minPointer initially assigned to 0 then after for loop it is incremented by 1
            minPointer=startScan;
            //minVal assigned to number at current index value
            minVal = arr[startScan];
            //find the smallest then the next smallest then next smallest until sorted
            for(int i = startScan+1; i < arr.length; i++){
            //check to see if arr at positon i is less than the min val  
                if(arr[i]<minVal){
                    //if arr at the i pos is less than current min val
                    //then assign it to min value
                    minVal = arr[i];
                    //set minPointer to i then go back to for loop if less than arr.length
                    minPointer = i;
                }
            }
           
            //the arr at [minPointer] gets arr at[startScan]
            arr[minPointer] = arr[startScan];
            //assign minVal to arr[startScan]
            arr[startScan] = minVal;
        }
    }
    
}
