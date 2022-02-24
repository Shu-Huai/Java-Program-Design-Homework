package shuhuai.javahomework.degreeawarding;

public interface Manageable {
    double computeAverage() throws UndergraduateException, MasterException;

    boolean getPass();

    void printInfo();
}