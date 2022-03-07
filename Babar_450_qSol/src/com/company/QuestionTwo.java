
//Find the maximum and minimum element in an array
package com.company;
class Question2Fun{
    void getMaxMIn(int arr[]){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];

            }else {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum: "+min);
    }
}

public class QuestionTwo {
    public static void main(String[] args) {
        Question2Fun questionTwo=new Question2Fun();
        int arr[]={500,600,7522,6,555,56666};
        questionTwo.getMaxMIn(arr);
    }
}
