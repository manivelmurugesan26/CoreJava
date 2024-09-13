package oops;

abstract class vehicle{
	void start() {
		System.out.println("vehicle starts ");
	}
	void stop() {
		System.out.println("vehicle stops ");
	}
	abstract void refuel();
}

class petrolvehicle extends vehicle{
	void refuel() {
		System.out.println("refuel with petrol ");
	}
}

class diesalvehicle  extends vehicle{
	void refuel() {
		System.out.println("refuel with diesal ");
	}
	
}
class electricvehicle extends  vehicle {
	void refuel() {
		System.out.println("refuel with electric ");
	}
}

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		petrolvehicle pv=new petrolvehicle();
		diesalvehicle dv=new diesalvehicle();
		electricvehicle ev=new electricvehicle();
		
		VehicleApp va=new VehicleApp();
		va.drive(pv);
		va.drive(dv);
		va.drive(ev);
		
		
		
	}
	public void drive(vehicle v) {
		v.start();
		v.stop();
		v.refuel();

	}

}
