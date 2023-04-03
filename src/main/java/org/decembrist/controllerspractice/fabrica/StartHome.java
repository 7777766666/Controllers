package org.decembrist.controllerspractice.fabrica;

import java.util.Arrays;

public class StartHome {

    public static void main(String[] args) {

        Home anyHome = new HomeFactory().createHome(200);
        Home anyHome2 = new HomeFactory().createHome(11);
        System.out.println(anyHome.getClass());
        System.out.println(anyHome2.getClass());
        anyHome.say();
        anyHome2.say();

//        double[] yyy = new double[1000];
//        for (int i = 0; i < yyy.length; i++) {
//            yyy[i] = i;
//        }
//        double sum = 0;
//        for (double xxx : yyy) {
//            sum += xxx;
//        }
//        double sum2 = Arrays.stream(yyy).sum();


    }
}
