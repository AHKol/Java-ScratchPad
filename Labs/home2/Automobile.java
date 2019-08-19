/** Automobile
 * Practice2
 * Adam Kolodko 
 * 10/19/2017
 * */

public class Automobile {
	private String carName;
	private Wheel frontWheel;
	private Wheel rearWheel;
	private Wheel extra;
	
	private class Wheel {
		private String hubcapType;
		private float radius;
		
		Wheel(){
			hubcapType = "Normal";
			radius = 40.1f;
		}
	}
	
	public Wheel thirdWheel(Automobile car) {
		return car.extra;
	}
	
	Automobile(String name) {
		carName = name;
		frontWheel = new Wheel();
		rearWheel = new Wheel();
		extra = new Wheel();
	}
	
    public static void main(String[] args) {

        Automobile myCar = new Automobile("Honda");
        Automobile yourCar = new Automobile("VW");
        myCar.extra = myCar.thirdWheel(yourCar);
        System.out.println(myCar.extra.radius);
    }

}