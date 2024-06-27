package com.hiberMap.DemoMap;

import javax.persistence.Cacheable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@javax.persistence.Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien {
	@javax.persistence.Id
	private int aid;
	private String aname;
	private String color;
	
//	@OneToMany(mappedBy = "alien",fetch = FetchType.EAGER)
//	private Collection<ALaptop> laps = new ArrayList<ALaptop>();

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

//	public Collection<ALaptop> getLaps() {
//		return laps;
//	}
//
//	public void setLaps(Collection<ALaptop> laps) {
//		this.laps = laps;
//	}

	
	
}
