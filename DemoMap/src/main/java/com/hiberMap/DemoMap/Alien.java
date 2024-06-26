package com.hiberMap.DemoMap;


import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Alien {
	@Id
	private int aid;
	private String aname;
	
	@OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
	private Collection<ALaptop> laps = new ArrayList<ALaptop>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Collection<ALaptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<ALaptop> laps) {
		this.laps = laps;
	}

	
	
}
