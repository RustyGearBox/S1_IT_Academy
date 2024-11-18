package org.example;

public class IntegerComparison {

    private  Integer value_1;
    private  Integer value_2;

    public IntegerComparison(Integer value_1, Integer value_2) {
        this.value_1 = value_1;
        this.value_2 = value_2;
    }

    public Integer getValue_1() {
        return value_1;
    }

    public void setValue_1(Integer value_1) {
        this.value_1 = value_1;
    }

    public Integer getValue_2() {
        return value_2;
    }

    public void setValue_2(Integer value_2) {
        this.value_2 = value_2;
    }

    public boolean areEqual() {
        return value_1.equals(value_2);
    }

}
