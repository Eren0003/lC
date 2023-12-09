package org.example.subset;

public class merge {
    public static void main(String[] args) {
        int[] array = {9,3,4,5,1,2,6,7,8};
        mergeS(array);
    }
    static void mergeS(int[] array){
        int length = array.length;
        if(length <= 0) return;
        int middle = length/2;
        int[]leftArray = new int[middle];
        int[]rightArray = new int[length-middle];
        int i = 0 ;
        int j = 0 ;
        for (;i < length ; i++){
            if(i<middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[j];
                j++;
            }
        }
        mergeS(leftArray);
        mergeS(rightArray);
        merge(leftArray,rightArray,array);

    }
    static void merge(int[]leftArray , int[]rightArray , int[] array){
        int leftSize = leftArray.length ;
        int rightSize = rightArray.length ;
    }
}
