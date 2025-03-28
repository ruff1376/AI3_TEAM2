package MISSION.HJY.Q16;

public class Triangle extends Shape {

	double width, height;

	public Triangle() {
		this(0.0, 0.0);
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		return width * height / 2;
	}

	// 삼각형을 밑변이 width, 높이가 height인 직각삼각형이라고 가정
	@Override
	double round() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
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
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
