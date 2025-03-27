package MISSION.HJY.Q17;

public class Driver {

	public static void main(String[] args) {
		
		RemoteControl rcCar = new RcCar();
		rcCar.on();
		rcCar.setSpeed(100);
		rcCar.setSpeed(250);			//	RC카 최대 속력 : 200
		System.out.println(rcCar.getSpeed());
		rcCar.off();
		rcCar.setSpeed(150);			// 전원 OFF 상태에서는 속력 설정 X
		rcCar.on();
		rcCar.setSpeed(150);
		System.out.println(rcCar.getBattery());
		rcCar.setSpeed(100);			// 배터리 부족으로 속력 감소 및 전원 OFF
		rcCar.changeBattery();			// 배터리 교체 시 전원 OFF
		System.out.println(rcCar.getBattery());
		
		System.out.println("----------------------------------------------------");
		
		RemoteControl drone = new Drone();
		drone.on();
		drone.setSpeed(150);
		System.out.println(drone);
		drone.setSpeed(350);			// 드론 최대 속력 : 200
		System.out.println(drone.getSpeed());
		drone.off();
		drone.setSpeed(180);			// 전원 OFF 상태에서는 속력 설정 X
		drone.on();
		drone.setSpeed(180);
		System.out.println(drone.getBattery());
		drone.changeBattery();			// 배터리 교체 시 전원 OFF
		System.out.println(drone.getBattery());
		drone.setSpeed(100);			// 전원 OFF 상태에서는 속력 설정 X
		drone.on();
		drone.setSpeed(200);
		drone.setSpeed(200);
		drone.setSpeed(200);
		drone.setSpeed(200);			// 배터리 부족으로 속력 감소 및 전원 OFF
		System.out.println(drone.getBattery());
		
	}
	
}
