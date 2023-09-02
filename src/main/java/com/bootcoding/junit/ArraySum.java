package com.bootcoding.junit;

public class ArraySum {
    public int getSum(int num[]){
        int sum = 0;
        for (int n : num){
            sum += n;
        }
        return sum;
    }
    public int getMax(int num[]){
        int max = num[0];
        int i;
        for (i = 0; i< num.length; i++){
            if(num[i]> max){
                max = num[i];

            }
        }

        return max;
    }
}
