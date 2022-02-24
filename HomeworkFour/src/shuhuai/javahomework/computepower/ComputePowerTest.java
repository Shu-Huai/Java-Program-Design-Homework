package shuhuai.javahomework.computepower;

public class ComputePowerTest {
    public static void main(String[] args) {
        double numberA = 3.0;
        double numberB = 4.0;
        ComputePower.compPower(numberA, numberB);
        System.out.println("第一个参数为" + numberA + "，第二个参数为" + numberB + "。");
        Parameter parameter = new Parameter(numberA, numberB);
        ComputePower.compPower(parameter);
        System.out.println("第一个参数为" + parameter.getNumberA() + "，第二个参数为" + parameter.getNumberB() + "。");
    }
}