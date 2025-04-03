package MISSION.KGW.Q16;

public class Triangle extends Shape {
    
    double width;
    double height;


    public Triangle() {
        this(0, 0);
    }


    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double width) {
        this.height = (Math.sqrt(3) / 2) * width;
    }


    @Override
    public String toString() {
        return "Triangle " + "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
    }



    @Override
    double area() {
        return (width*height)/2;
    }
    @Override
    double round() {
        return width*3;
    }


}
