package org.example.leetcode.twopointer;

import java.util.Arrays;

public class BoatToSave {
    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(boatTwoPointer(people,limit));
    }
    static int boat(int[] people,int limit){
        Arrays.sort(people);
        boolean singlePerson = false;
        int ans = 0 ;
        int i = 0 ;
        int len = people.length-1;
        while(i <= len){
            if(!singlePerson) {
                if(i == len){
                    ans++;
                    i++;
                }
                else if (people[i] + people[i + 1] <= limit) {
                    ans++;
                    i += 2;
                } else {
                    ans++;
                    singlePerson = true;
                }
            }
            else{
                ans += len-i;
                break;
            }
        }
        return ans;
    }
    /// 1 , 2 , 4 , 5 ;
    static int boatTwoPointer(int[] people, int limit){
        Arrays.sort(people);
        int ans = 0 ;
        int start = 0 ;
        int end = people.length - 1;
        while(start <= end){
            if(start == end){
                ans++;
                break;
            }
            if(people[start] + people[end] <= limit){
                ans++;
                start++;
                end--;
            }else if(people[start] + people[end] > limit){
                ans++;
                end--;
            }
        }
        return ans;
    }
}
