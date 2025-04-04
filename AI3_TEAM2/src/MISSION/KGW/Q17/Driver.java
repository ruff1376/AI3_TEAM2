package MISSION.KGW.Q17;

public class Driver {
	public static void main(String[] args) {
		
		RemoteControl car = new RcCar();
		car.on();
		car.setSpeed(-30);
		car.setSpeed(60);
		car.off();
		RemoteControl.changeBattery();
		System.out.println("------------------");
		
		RemoteControl drone = new Drone();
		
		drone.on();
		drone.setSpeed(240);
		drone.setSpeed(60);
		drone.off();
		
		
		
	}

}
