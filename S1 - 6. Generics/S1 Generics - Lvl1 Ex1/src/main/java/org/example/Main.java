package org.example;

public class Main {
    public static void main(String[] args) {

        NoneGenericMethods ngm1 = new NoneGenericMethods("First", "Second", "Third");
        System.out.println("ngm1: " + ngm1.getObject1() + ", " + ngm1.getObject2() + ", " + ngm1.getObject3());

        NoneGenericMethods ngm2 = new NoneGenericMethods(1, 2, 3);
        System.out.println("ngm2: " + ngm2.getObject1() + ", " + ngm2.getObject2() + ", " + ngm2.getObject3());

        NoneGenericMethods ngm3 = new NoneGenericMethods(3.14, "Text", 100);
        System.out.println("ngm3: " + ngm3.getObject1() + ", " + ngm3.getObject2() + ", " + ngm3.getObject3());
    }
}