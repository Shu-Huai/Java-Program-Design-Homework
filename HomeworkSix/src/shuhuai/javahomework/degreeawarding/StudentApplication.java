package shuhuai.javahomework.degreeawarding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentApplication {
    public static Date getDate(String stringDate) {
        Date date = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = simpleDateFormat.parse(stringDate);
        } catch (ParseException error) {
            error.printStackTrace();
        }
        return date;
    }

    public static void main(String[] args) {
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setName("王小二");
        undergraduate.setGender('男');
        undergraduate.setBirthDay(getDate("2001-06-01"));
        undergraduate.setSchool("上海大学");
        undergraduate.setStuId("11128981");
        undergraduate.setCategory(Constants.UNDERGRADUATE);
        undergraduate.setScore(new double[]{89.5, 82, 87, 73});
        undergraduate.setStatus(false);
        Master master = new Master();
        master.setName("李燕");
        master.setGender('女');
        master.setBirthDay(getDate("1997-06-12"));
        master.setSchool("上海大学");
        master.setStuId("10306");
        master.setCategory(Constants.MASTER);
        master.setScore(new double[]{70, 52.5, 95, 88, 89, 91});
        master.setThesisLevel('B');
        master.setStatus(false);
        StudentDegree studentDegree = new StudentDegree();
        studentDegree.issueDegree(undergraduate);
        studentDegree.issueDegree(master);
    }
}
