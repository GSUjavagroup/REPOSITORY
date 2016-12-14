package polymorphObj;

public class Flight {
	//does not extend, no child classes 
	private int flightID;
	private String flightNum;
	private String departure;
	private String arrival;
	private int depTime;
	private int arrTime;
	private int duration;
	private String gate;
	private int capacity;
	private int cost;
	
	//generate getters and setters 
	
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getFlightNum() {
		return flightNum;
	}
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public int getDepTime() {
		return depTime;
	}
	public void setDepTime(int depTime) {
		this.depTime = depTime;
	}
	public int getArrTime() {
		return arrTime;
	}
	public void setArrTime(int arrTime) {
		this.arrTime = arrTime;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	//constructors
	
	public Flight(int flightID, String flightNum, String departure, String arrival, int depTime, int arrTime, int duration, String gate, int capacity, int cost){
		
		setFlightID(flightID);
		setFlightNum(flightNum);
		setDeparture(departure);
		setArrival(arrival);
		setDepTime(depTime);
		setArrTime(arrTime);
		setDuration(duration);
		setGate(gate);
		setCapacity(capacity);
		setCost(cost);
		
		
	}
		


}
