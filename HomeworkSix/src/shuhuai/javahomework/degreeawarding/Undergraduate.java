package shuhuai.javahomework.degreeawarding;

import java.text.SimpleDateFormat;

public class Undergraduate extends Student implements Manageable {
    double aver;

    @Override
    public double computeAverage() throws UndergraduateException {
        aver = 0;
        for (double item : score) {
            if (item < 0 || item > 100) {
                throw new UndergraduateException(item);
            }
            aver += item;
        }
        aver /= score.length;
        return aver;
    }

    @Override
    public boolean getPass() {
        try {
            computeAverage();
        } catch (UndergraduateException error) {
            System.out.println(error.warnMess());
        }
        status = aver >= 60;
        return status;
    }

    @Override
    public void printInfo() {
        System.out.println("姓名　　　　：" + getName() + "；");
        System.out.println("性别　　　　：" + getGender() + "；");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("出生日期　　：" + simpleDateFormat.format(getBirthDay()) + "；");
        System.out.println("学校　　　　：" + getSchool() + "；");
        System.out.println("学号　　　　：" + getStuId() + "；");
        System.out.println("学生类别　　：" + getCategory() + "；");
        System.out.print("各门课程成绩　：");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + (i == score.length - 1 ? "；" : "，"));
        }
        System.out.println("颁发学位状况：" + getDegree() + "。");
    }

    @Override
    public String getDegree() {
        return getPass() ? Constants.ISSUE_UNDERGRADUATE_DEGREE : Constants.UNSATISFACTORY_ISSUE_UNDERGRADUATE_DEGREE;
    }
}