package shuhuai.javahomework.degreeawarding;

import java.text.SimpleDateFormat;

public class StudentDegree {
    public void printStudentInfo(Student student) {
        System.out.println("姓名　　　　：" + student.getName() + "；");
        System.out.println("性别　　　　：" + student.getGender() + "；");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("出生日期　　：" + simpleDateFormat.format(student.getBirthDay()) + "；");
        System.out.println("学校　　　　：" + student.getSchool() + "；");
        System.out.println("学号　　　　：" + student.getStuId() + "；");
        System.out.println("学生类别　　：" + student.getCategory() + "；");
        System.out.println("平均成绩　　：" + student.computeAverage() + "；");
        System.out.println("平均分　　　：" + student.computeAverage() + "。");
    }

    public void issueDegree(Student student) {
        System.out.println("学位授予情况：" + student.getDegree() + "。");
    }
}