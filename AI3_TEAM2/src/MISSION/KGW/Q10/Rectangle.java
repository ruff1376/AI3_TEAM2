package MISSION.KGW.Q10;

public class Rectangle {
	double width;
	double height;
	
	
	
	public Rectangle() {
	}



	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return (width*height);
	}
	
	
}
