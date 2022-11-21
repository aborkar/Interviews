package tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by aborkar on 10/18/2022.
 */

public class MathTests {

    public static void main(String[] args){
        List<Double> arr =  new ArrayList<>();

        double[] arr1  = {15.0,4.2,35.0,56.5,43.0,2.2,59.0,36.2};

        double[] returns1 = new double[arr1.length-1];

        for (int i = 1; i < arr1.length; i++) {
            returns1[i-1] = Math.log(1+ (arr1[i] - arr1[i-1])/arr1[i]);
        }

        double mean1 = Arrays.stream(returns1).average().getAsDouble();

        double var1 = (Arrays.stream(returns1).map(a->(Math.pow(a-mean1,2.0))).sum())/arr1.length-1;



        double[] arr2  = {1.0,2.2,1.0,2.5,19.0,7.2,5.0,6.2};

        double[] returns2 = new double[arr2.length-1];

        for (int i = 1; i < arr2.length; i++) {
            returns2[i-1] = Math.log(1+ (arr2[i] - arr2[i-1])/arr2[i]);
        }

        double mean2 = Arrays.stream(returns2).average().getAsDouble();




    }
}
