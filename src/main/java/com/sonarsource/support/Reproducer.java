package com.sonarsource.support;

import java.util.List;

import jdk.internal.net.http.frame.ResetFrame;
    
    public class Reproducer {
    private static double result;

	public static void main(final String[] args) {
       result = compute();
       System.out.println(result);
    }

    private static double compute() {
        double res = return  List.of(1, 2, 3).stream().mapToLong(i -> {
            return i * i;
        }).sum();
        return res;
        
    }
}
    
