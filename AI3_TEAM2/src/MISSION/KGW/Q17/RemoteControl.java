package MISSION.KGW.Q17;

public interface RemoteControl {

	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	void on();
	void off();
	
	public void setSpeed(int speed);
	
	public static void changeBattery() {
		System.out.println("배터리를 교체하였습니다.");
	}
	
	
}
