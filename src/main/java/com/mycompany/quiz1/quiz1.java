package com.mycompany.quiz1;

public class quiz1 
{
    public static class CubingClass implements MyMath 
    {
        @Override
        public int getCube(int a){
         return a*a*a;   
        }
                
    }
    public static void main(String[] args){
        CubingClass cc = new CubingClass();
        int n = 3;
        System.out.println("The number cubed is " + cc.getCube(n));
    }
}
