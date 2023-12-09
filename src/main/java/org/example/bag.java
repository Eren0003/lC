package org.example;

public class bag {
    public static void main(String[] args) {
        int n = 13304;
        int[] array = {1,2,3,4,5,6,7,10};
        int target = 10;
        int index = 0 ;
        String s = "baacgcae";String string = "abstringcd";String a = "";

        System.out.println(skipString(string,a));
//        System.out.println(aaRemover(s,a));
//        System.out.println(aRemover(s,0,a));
//        System.out.println(linearSearch(array,target,index));
//        System.out.println(sortedArray(array,index));
//        System.out.println(reverseNum(n,0));
    }
    static int productOfDigit (int n){
      if(n < 10){
          return n ;
      }
      else{
          return  (n%10) * productOfDigit(n/10);
      }
    }
    static int reverseNum (int n ,int sum){

        if(n%10 == n){
            return sum + n;
        }
        else{
            int rem = n%10;
            sum = (sum + rem)*10;
            n = n / 10;
            return reverseNum(n,sum);
        }
    }
    static boolean sortedArray(int[] array,int index){
        boolean flag = true;
        if(index != array.length-1) {
            if (array[index] <= array[index + 1]) {
                return sortedArray(array, index + 1);
            } else {
                flag = false;
            }
        }
        return flag;
    }
    int index = 0;
    static int linearSearch(int[] arr ,int target,int index){
        int ans = -1;
        if(index > arr.length-1){
            return ans;
        }
        if(arr[index] == target){
            ans = index;
            return ans;
        }
        else{
            index = index+1;
            linearSearch(arr,target,index);
        }
        return ans;
    }
    static String aRemover(String s , int start,String a){

        if(start == s.length() ){
            return a ;
        }
        if(start < s.length()) {
            if (s.charAt(start) != 'a') {
                a = a + s.charAt(start);
            }
        }
        return aRemover(s, start + 1, a);
    }
    static String aaRemover (String s ,String a ){
        if(s.isEmpty()){
            return a;
        }
        if(s.charAt(0) != 'a'){
            a = a + s.charAt(0);
            return aaRemover(s.substring(1,s.length()),a);
        }
        else{
            return aaRemover (s.substring(1,s.length()),a);
        }
    }
    static String skipString(String string , String a){
        if(string.isEmpty()){
            return a;
        }
        if(string.startsWith("string")){
            return skipString(string.substring(6),a);
        }else{
            a = a + string.charAt(0);
            return skipString(string.substring(1,string.length()),a);
        }
    }


}

