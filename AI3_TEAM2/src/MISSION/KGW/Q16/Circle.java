package MISSION.KGW.Q16;

public class Circle extends Shape {
	double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, radius);
	}

	@Override
	double round() {
		return radius * 2 * Math.PI;
	}
	
	

}
