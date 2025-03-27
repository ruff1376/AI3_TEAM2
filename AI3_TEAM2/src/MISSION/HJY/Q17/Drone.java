package MISSION.HJY.Q17;

public class Drone implements RemoteControl {
	
	final double INITIAL_BATTERY_CAPACITY = 700;		// 드론 초기 배터리 용량 : 700
	private double battery;
	private double speed;
	private boolean isOn;

	public Drone() {
		battery = INITIAL_BATTERY_CAPACITY;
		speed = 0;
	}

	@Override
	public void on() {
		System.out.println("드론 전원 ON");
		isOn = true;
	}

	@Override
	public void off() {
		speed = 0;
		System.out.println("드론 전원 OFF");
		isOn = false;
	}
	
	public double getBattery() {
		return battery;
	}
	
	public double getSpeed() {
		if (battery <= 0) speed = 0;
		return speed;
	}

	@Override
	public void setSpeed(double speed) {
		// 전원이 꺼진 상태에서는 속력 설정 X
		if (!isOn) {
			System.out.println("드론 전원을 켜주세요.");
		}
		else {
			// 배터리 잔량이 없는 상태에서는 속력 설정 X
			if (battery <= 0) {
				System.out.println("드론 배터리를 교체해주세요.");
				this.speed = 0;
			}
			else {
				if (speed > RemoteControl.MAX_SPEED) {
					this.speed = RemoteControl.MAX_SPEED;
					System.out.println("드론 최고 속력은 " + RemoteControl.MAX_SPEED + "입니다.");
				}
				else if (speed < RemoteControl.MIN_SPEED) {
					this.speed = RemoteControl.MIN_SPEED;
					System.out.println("드론 최저 속력은 " + RemoteControl.MIN_SPEED + "입니다.");
				}
				else {
					this.speed = speed;
				}
				// 배터리 잔량보다 속력이 더 높은 경우 배터리 잔량만큼 속력 감소
				if (this.speed > battery) {
					this.speed = battery;
					System.out.println("배터리 부족으로 드론 속력이 감소하였습니다.");
				}
				System.out.println("드론 속력 : " + this.speed);
				// 속도를 설정할 때마다 속도 값만큼 배터리가 줄어들도록 설정
				battery -= this.speed;
				// 배터리 소진 시 전원 OFF
				if (battery <= 0) {
					off();
				}
			}
		}
	}

	@Override
	public void changeBattery() {
		// 전원이 켜져있는 상태에서 배터리 교체 시 전원 OFF
		if (isOn) off();
		System.out.println("드론 배터리 교체");
		// 새 배터리 교체
		battery = INITIAL_BATTERY_CAPACITY;
	}

	@Override
	public String toString() {
		return "Drone [battery=" + battery + ", speed=" + speed + ", isOn=" + isOn + "]";
	}

}
