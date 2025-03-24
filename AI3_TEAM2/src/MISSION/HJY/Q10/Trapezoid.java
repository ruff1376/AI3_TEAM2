package MISSION.HJY.Q10;

public class Trapezoid {

	private double top;
	private double bottom;
	private double height;
	
	public Trapezoid() {
		this(0.0, 0.0, 0.0);
	}
	
	public Trapezoid(double top, double bottom, double height) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	public double getTop() {
		return top;
	}
	
	public void setTop(double top) {
		this.top = top;
	}
	
	public double getBottom() {
		return bottom;
	}
	
	public void setBottom(double bottom) {
		this.bottom = bottom;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return (top + bottom) * height / 2;
	}
	
	@Override
	public String toString() {
		return "Trapezoid [top=" + top + ", bottom=" + bottom + ", height=" + height + "]";
	}
	
}
