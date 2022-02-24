package shuhuai.javahomework.linelength;

public record Line(Point start, Point end) {
    public Line(Point start, Point end) {
        this.start = new Point(start.GetX(), start.GetY());
        this.end = new Point(end.GetX(), end.GetY());
    }

    public double GetLength() {
        return Math.sqrt(Math.pow(start.GetX() - end.GetX(), 2) + Math.pow(start.GetY() - end.GetY(), 2));
    }
}