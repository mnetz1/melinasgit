package a1;

import a2.InvalidCostumerException;

public class Costumer {
	
	private Profile profile;
	
	private int id;

	public Costumer(Profile profile, int id) throws InvalidCostumerException{
		setProfile(profile);
		setId(id); //kein setter, id soll nicht von außen zu verändern sein
		//this.id = id;
	}

	//a2
	public void setProfile(Profile profile)  throws InvalidCostumerException{
		if (profile == null) {
			throw new InvalidCostumerException("Profile is missing!");
		}
		this.profile = profile;
	}
	
	public Profile getProfile() {
		return profile;
	}

	public int getId() {
		return id;
	}
	
	//a2
	public void setId(int id) throws InvalidCostumerException {
		if(id < 0) {
			throw new InvalidCostumerException("ID is negative!");
		}
		this.id = id;
	}

}
