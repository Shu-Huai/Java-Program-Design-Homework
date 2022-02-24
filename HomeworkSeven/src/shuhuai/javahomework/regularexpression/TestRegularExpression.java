package shuhuai.javahomework.regularexpression;

public class TestRegularExpression {

    public static String dealResult(boolean result, String type) {
        return (result ? "是" : "不是") + type;
    }

    public static void main(String[] args) {
        System.out.println("1" + dealResult(RegexChk.verifyInteger("1"), "整数"));
        System.out.println("0" + dealResult(RegexChk.verifyInteger("0"), "整数"));
        System.out.println("-1" + dealResult(RegexChk.verifyInteger("-1"), "整数"));
        System.out.println("1.1" + dealResult(RegexChk.verifyInteger("1.1"), "整数"));
        System.out.println("12345678901" + dealResult(RegexChk.verifyPhone("12345678901"), "手机号码"));
        System.out.println("1234567890" + dealResult(RegexChk.verifyPhone("1234567890"), "手机号码"));
        System.out.println("23456789012" + dealResult(RegexChk.verifyPhone("23456789012"), "手机号码"));
        System.out.println("123@a.b" + dealResult(RegexChk.verifyEmail("123@a.b"), "电子邮箱"));
        System.out.println("12@a.b" + dealResult(RegexChk.verifyEmail("12@a.b"), "电子邮箱"));
        System.out.println("123" + dealResult(RegexChk.verifyEmail("123"), "电子邮箱"));
        System.out.println("123@a.b.c.d" + dealResult(RegexChk.verifyEmail("123@a.b.c.d"), "电子邮箱"));
        System.out.println("123456" + dealResult(RegexChk.verifyPostcode("123456"), "邮政编码"));
        System.out.println("1234567" + dealResult(RegexChk.verifyPostcode("1234567"), "邮政编码"));
        System.out.println("123456789012345678" + dealResult(RegexChk.verifyID("123456789012345678"), "身份证号码"));
        System.out.println("12345678901234567a" + dealResult(RegexChk.verifyID("12345678901234567a"), "身份证号码"));
        System.out.println("12345678901234567r" + dealResult(RegexChk.verifyID("12345678901234567"), "身份证号码"));
    }
}