package MISSION.HJY.Q17;

public interface RemoteControl {

	double MAX_SPEED = 200;
	double MIN_SPEED = 0;
	
	void on();
	void off();
	double getBattery();
	double getSpeed();
	void setSpeed(double speed);
	void changeBattery();
	
}
