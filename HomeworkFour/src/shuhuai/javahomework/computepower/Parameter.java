package shuhuai.javahomework.computepower;

public class Parameter {
    private double numberA;
    private double numberB;

    public Parameter(double numberA, double numberB) {
        setNumberA(numberA);
        setNumberB(numberB);
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}