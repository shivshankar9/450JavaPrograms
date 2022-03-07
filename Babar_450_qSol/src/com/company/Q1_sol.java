package com.company;
//Reverse the array

class Q1_fun{
    void reverseArray(int arr[],int start,int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

    }
    void printArray(int arr[],int size){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
public class Q1_sol {
    public static void main(String[] args) {
        Q1_fun questionOne=new Q1_fun();
        int arr[]={1,2,3,4,5,6};
        System.out.println("Before Reversed Array");
        questionOne.printArray(arr,6);
        System.out.println("\n After Reversed array");
        questionOne.reverseArray(arr,0,5);
        questionOne.printArray(arr,6);
    }


}
