package tests;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * Created by aborkar on 7/24/2017.
 */


public class Trial {

    public static double sqrt(int number) {
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
            System.out.println(squareRoot);
        } while ((t - squareRoot) != 0);

        System.out.println("The answer is: " + squareRoot);
        return squareRoot;
    }

    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++)
            f[i] = f[i >> 1] + (i & 1);
        return f;
    }

    public static void main(String[] args){
        int x = 2>>1;
        System.out.println("x = "+ x);
        x <<=1;
        System.out.println("x = "+ x);
        x=3>>1;
        System.out.println("x = "+ x);
        x<<=1;
        System.out.println("x = "+ x);
        //System.out.println(Arrays.<Integer>asList(2,4).getClass());
        //System.out.print(1<<('c'-'a'));
        //System.out.print(new Trial().countBits(5));
        System.out.println(Integer.toBinaryString(~5&Integer.highestOneBit(5)-1));
        System.out.println(Integer.toBinaryString(Integer.highestOneBit(5)));
        System.out.println(Integer.toBinaryString(Integer.highestOneBit(5)-1));
        System.out.println(Trial.sqrt(16));
        System.out.println(Integer.bitCount(1|4));
        System.out.println(-32>>1);
        System.out.println(Integer.toBinaryString(-32>>1));
        System.out.println(-32>>>1);
        System.out.println(Integer.toBinaryString(-32>>>1));
        //System.out.println(Integer.toBinaryString(32));
        //System.out.println("lR".split("L"));
        String[] tokenz = "LLR".split("");

        String[] tokens = "x+y-z".split("\\+|-");
        
        for (String token:tokens
             ) {
            System.out.println(token + " ");
        }

    }
}
