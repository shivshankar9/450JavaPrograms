//Find the "Kth" max and min element of an array
package com.company;
import java.util.Arrays;
class fun{
    void smallestNum(int arr[], int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    void maxNum(int arr[],int k){
        Arrays.sort(arr);
        System.out.println("maxNum: "+arr[k+1]);
    }
}
class QuestionThree{
    public static void main(String[] args) {
        fun smallestN=new fun();
        //int arr[]={5,6,}
        int arr1[] = {7, 10, 4, 3, 20, 15};
       int k=3;
       smallestN.smallestNum(arr1,k);
       smallestN.maxNum(arr1,k);
        int arr2[] = {7, 10, 4, 3, 20, 15};
        int n=4;
        smallestN.smallestNum(arr2,n);
        smallestN.maxNum(arr2,n);

    }

}
