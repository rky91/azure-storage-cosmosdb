package com.rky.dev.entity;

public class Order {
	
	private Long id;
	private String itemName;
	private String status;
	
	public Order(Long id, String itemName, String status) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.status = status;
	}
	public Order() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", itemName=" + itemName + ", status=" + status + "]";
	}
	
}
