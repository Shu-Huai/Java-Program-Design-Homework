package shuhuai.javahomework.gettersetter;

public class TestGetterSetter {
    public static void main(String[] args) {
        GetterSetter getterSetter = new GetterSetter();
        GetterSetter.setX(0.0);
        getterSetter.setY(1);
        GetterSetter newGetterSetter = new GetterSetter();
        GetterSetter.setX(2.0);
        newGetterSetter.setY(3);
        System.out.println("x的值为" + GetterSetter.getX() + "，y的值为" + getterSetter.getY() + "。");
        System.out.println("x的值为" + GetterSetter.getX() + "，y的值为" + newGetterSetter.getY() + "。");
    }
}