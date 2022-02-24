package shuhuai.javahomework.degreeawarding;

public class UndergraduateException extends Exception {
    String message;

    public UndergraduateException(double score) {
        message = "成绩是" + score + "，范围错误。";
    }

    public String warnMess() {
        return message;
    }
}