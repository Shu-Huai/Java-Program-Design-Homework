package shuhuai.javahomework.gettersetter;

public class GetterSetter {
    private static double x;
    private int y;

    public GetterSetter() {
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        GetterSetter.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}