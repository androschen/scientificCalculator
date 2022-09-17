package com.andros.scientificcalculator;

public class CalculateFactorial {
    int result[] = new int[1001];
    int resSize;

    CalculateFactorial(){
        resSize=1;
    }

    public int getSize(){
        return resSize;
    }

    public int[] factorial(int n){
        result[0]=1;

        for(int i=2;i<=n;i++){
            resSize= multiply(i,resSize);
        }

        return result;
    }

    private int multiply(int x, int size){
        int carry=0;

        for(int i=0;i<size;i++){
            int prod=result[i]*x + carry;
            result[i]= prod%10;
            carry=prod/10;
        }

        while(carry!=0){
            result[size]=carry%10;
            carry/=10;
            size++;
        }

        return size;
    }


}
