package shuhuai.javahomework.degreeawarding;

public class Undergraduate extends Student {
    double aver;

    @Override
    public boolean getPass() {
        computeAverage();
        status = aver >= 60;
        return status;
    }

    @Override
    public double computeAverage() {
        double sum = 0;
        for (double item : score) {
            sum += item;
        }
        aver = sum / score.length;
        return aver;
    }

    @Override
    public String getDegree() {
        status = getPass();
        return status ? Constants.ISSUE_UNDERGRADUATE_DEGREE : Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
    }
}