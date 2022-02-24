package shuhuai.javahomework.degreeawarding;

import java.util.Date;

public abstract class Student {
    String name;
    char gender;
    Date birthDay;
    String school;
    String stuId;
    String category;
    double[] score;
    boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        }
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String studentId) {
        stuId = studentId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setScore(double[] score) {
        this.score = new double[score.length];
        System.arraycopy(score, 0, this.score, 0, score.length);
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public abstract String getDegree();
}