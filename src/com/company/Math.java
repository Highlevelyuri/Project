package com.company;

public class Math {
     private double a1;
     private double a2;
     private double a3;



         void  Sew(){
        double r=(a1 + a2)*(a1+a3);
             System.out.println(r);
             System.out.println(1/r);
         }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }
}


