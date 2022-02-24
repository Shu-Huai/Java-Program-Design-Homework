package shuhuai.javahomework.degreeawarding;

public class StudentDegree {
    public void issueDegree(Manageable manage) {
        manage.printInfo();
        try {
            System.out.println("平均分：" + manage.computeAverage() + "。");
        } catch (UndergraduateException error) {
            error.warnMess();
        } catch (MasterException error) {
            error.warnMess();
        }
    }
}