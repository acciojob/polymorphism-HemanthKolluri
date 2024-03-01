package com.driver;

public class Main {
    public static void main(String [] args){
        Product p=new Product();
        int a=p.product(10,20);
        int b=p.product(1,2,3);
        double c=p.product(1.5,46.5);
        System.out.println(a+" "+b+" "+c);

    }
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }


    }
}
