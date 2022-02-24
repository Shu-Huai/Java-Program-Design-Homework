package shuhuai.javahomework.computepower;

public class ComputePower {
    public static void compPower(double numberA, double numberB) {
        System.out.println("第一个参数平方为" + Math.pow(numberA, 2) + "，第二个参数平方为" + Math.pow(numberB, 2) + "。");
        System.out.println("第一个参数为" + numberA + "，第二个参数为" + numberB + "。");
    }

    public static void compPower(Parameter parameter) {
        System.out.println("第一个参数平方为" + Math.pow(parameter.getNumberA(), 2) + "，第二个参数平方为" + Math.pow(parameter.getNumberB(), 2) + "。");
        parameter.setNumberA(Math.pow(parameter.getNumberA(), 2) + Math.pow(parameter.getNumberB(), 2));
        System.out.println("第一个参数为" + parameter.getNumberA() + "，第二个参数为" + parameter.getNumberB() + "。");
    }
}