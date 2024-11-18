package org.example;

public class Generic {

    public <T extends Smartphone> void methodOnlyPhone(T Phone){
        Phone.call();
    }

    public <T extends Smartphone> void methodOnlySmartphone(T Smartphone){
        Smartphone.call();
        Smartphone.takePhoto();
    }

}