package org.decembrist.controllerspractice.fabrica;

public class HomeFactory {
//    public int size;
//    public HomeFactory(int size){
//        this.size = size;
//    }


    public Home createHome(int x) {
        if (x > 150) {
            return new House();
        }
        return new Flat();
    }


}
