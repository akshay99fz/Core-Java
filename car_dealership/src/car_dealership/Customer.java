package car_dealership;

public class Customer {

	String name;
	String address;
	double cashOnHand;
	String vehicleName;

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public static void buyCar(Customer cust) {
		Employee e1 = new Employee();
		Vehicle v1 = new Vehicle();
		boolean res = cust.availability(cust.vehicleName, v1);
		if(res) {
			cust.purchaseCar(v1, e1, cust.cashOnHand);
		}
		else {System.out.println("The vehicle is not available");}
		
	}
	
	public boolean availability(String vehicleName, Vehicle vehicle) {
		String name = vehicle.getName();
		if(vehicleName.equals(name)) {
			return true;
		}
		else
			return false;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, double cash) {
		
	}

	public void customerHandle(Customer cust, Vehicle vehicle, boolean finance) {

	}
}
