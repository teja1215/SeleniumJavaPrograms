package SitesAutomation;

public class ShippingAddress {
	
	private String Streetanme;
    private Integer Doorname;
    
    
	public ShippingAddress(String streetanme, Integer doorname) {
		super();
		Streetanme = streetanme;
		Doorname = doorname;
	}
	public String getStreetanme() {
		return Streetanme;
	}
	public void setStreetanme(String streetanme) {
		Streetanme = streetanme;
	}
	public Integer getDoorname() {
		return Doorname;
	}
	public void setDoorname(Integer doorname) {
		Doorname = doorname;
	}
    

}
