package com.org.net;

public class Emp {
	private int id;
	private String name;
	private String mode;
	private int amount;
	
	public Emp() {
		super();
	}
	public Emp(int id, String name, String mode, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.mode = mode;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", mode=" + mode + ", amount=" + amount + "]";
	}
	
}
