package MISSION.KGW.Q17;

public class RcCar implements RemoteControl {

	double battery;
	double speed;
	
	public RcCar() {
		this(0, 0);
	}

	public RcCar(double battery, double speed) {
		this.battery = battery;
		this.speed = speed;
	}

	public double getBattery() {
		return battery;
	}

	public void setBattery(double battery) {
		this.battery = battery;
	}

	public double getSpeed() {
		return speed;
	}


	@Override
	public void on() {
		System.out.println("RcCar전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("RcCar전원을 끕니다");
		setSpeed(MIN_SPEED);
	}

	@Override
	public void setSpeed(int speed) {
		if (speed > MAX_SPEED) {
			System.err.println("너무 빠릅니다.");
			this.speed = MAX_SPEED;
		}
		else if (speed < MIN_SPEED) {
			System.err.println("속도는 음수가 될수없습니다.");
			this.speed = MIN_SPEED;
		}
		else this.speed = speed;
		System.out.println("현재 속도 : " + this.speed);
	}
	
	
}
