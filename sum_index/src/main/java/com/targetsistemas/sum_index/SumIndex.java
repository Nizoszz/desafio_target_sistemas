package com.targetsistemas.sum_index;

public class SumIndex {
    public void execute(){
        int index = 13;
        int sum = 0;
        int k = 0;

        while (k < index){
            k = k + 1;
            sum = sum + k;
        }
        System.out.println("Total value result: " + sum);
    }
}
