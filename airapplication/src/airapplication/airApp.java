			package airapplication;

class Pilot{
	String name;
	Pilot(String name){
		this.name=name;
	}			
	void fly() {
		System.out.println(name+"is flying ");
	}
}
class airline{
	String brand;
	Pilot pilot;
	airline(String brand, Pilot pilot){
		this.brand=brand;
		this.pilot=pilot;
	}
	void operation() {
		System.out.println( brand+"operations");
		pilot.fly();
	}
}
public class airApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilot p=new Pilot("john");
		airline a=new airline("kodair",p);
		a.operation();
		a=null;
		//a.operation();
		p.fly();
		
		
		
		
	}

}
