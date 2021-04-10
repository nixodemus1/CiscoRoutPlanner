package hackNetAT;

/**
 * @author nchow
 *
 */
public class Customer {
	
	private String name;
	private int priority;
	private String location;
	
	public void setName(String userName) {
		name = userName;
	}
	
	public void setPriority(int userPriority) {
		priority = userPriority;
	}
	
	public void setLocation(String userLocation) {
		location = userLocation;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return this.name + " priority: " + this.priority;
	}

}
