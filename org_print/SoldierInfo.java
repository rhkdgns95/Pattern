package org.java.design_patterns.org_print;

import java.util.ArrayList;

public class SoldierInfo {
	private String name;
	private int periodMonths;
	
	private ArrayList<SoldierInfo> mySoldiers;
	
	public SoldierInfo(String name, int periodMonths) {
		this.name = name;
		this.periodMonths = periodMonths;
		this.mySoldiers = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPeriodMonths() {
		return periodMonths;
	}
	public void setPeriodMonths(int periodMonths) {
		this.periodMonths = periodMonths;
	}
	
	public ArrayList<SoldierInfo> getMySoldiers() {
		return mySoldiers;
	}
	public void addMySoldier(SoldierInfo soldier) {
		this.mySoldiers.add(soldier);
	}
	
	public void print() {
		System.out.println(this.getName());
	}
	
	//////추가
	public boolean hasMySoldiers() {
		return mySoldiers.size() == 0 ? false : true;
	}
}
