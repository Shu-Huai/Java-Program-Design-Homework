package shuhuai.javahomework.degreeawarding;

public class MasterException extends Exception {
    String message;

    public MasterException(char thesisLevel) {
        message = "论文等级是" + thesisLevel + "，范围错误。";
    }

    public String warnMess() {
        return message;
    }
}