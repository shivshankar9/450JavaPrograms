
//Given an array which consists of only 0, 1 and 2.
  //Sort the array without using any sorting algo
package com.company;

import java.util.ArrayList;

class FunctionForQuestionFour{

    void sortArray(int arr[]){
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else {
                two++;
            }

        }
        for (int j=0;j< arr.length;j++){
            for (int i=0;i<zero;i++){
                arr[j]=0;
            }
            for (int k=0;k<one;k++){
                arr[j]=1;
            }
            for (int z=0;z<two;z++){
                arr[j]=2;
            }
        }

        }



    void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
public class QuestionFour {
    public static void main(String[] args) {
        FunctionForQuestionFour four=new FunctionForQuestionFour();
        int arr[]={2,2,2,2,2,0,0,0,1,1,1,1,};
        four.printArray(arr);
        four.sortArray(arr);

        System.out.println("\nAfter sorting fucking Array");
        four.printArray(arr);
    }

}
