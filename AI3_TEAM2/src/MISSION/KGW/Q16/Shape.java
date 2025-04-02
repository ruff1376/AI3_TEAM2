package MISSION.KGW.Q16;

public abstract class Shape {

    Point point;

    abstract double area();
    abstract double round();


    public Point getPoint() {
        return this.point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }


}
