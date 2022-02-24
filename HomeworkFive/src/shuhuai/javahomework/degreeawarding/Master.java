package shuhuai.javahomework.degreeawarding;

public class Master extends Student {
    double aver;
    char thesisLevel;

    public void setThesisLevel(char thesisLevel) {
        this.thesisLevel = thesisLevel;
    }

    @Override
    public boolean getPass() {
        computeAverage();
        status = aver >= 80 && (thesisLevel == 'C' || thesisLevel == 'B' || thesisLevel == 'A');
        return status;
    }

    @Override
    public double computeAverage() {
        double times = 1;
        for (double item : score) {
            times *= item;
        }
        aver = Math.pow(times, 1.0 / score.length);
        return aver;
    }

    @Override
    public String getDegree() {
        status = getPass();
        return status ? Constants.ISSUE_MASTER_DEGREE : Constants.UNSATISFACTORY_ISSUE_MASTER_DEGREE;
    }
}