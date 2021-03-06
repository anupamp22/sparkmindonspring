package com.sparkmind.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.annotation.Scope;

public class ShoppingCartItemList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String deliveryinstructions;
	private List<ShoppingCartItem> shoppingCartItems;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDeliveryinstructions() {
		return deliveryinstructions;
	}
	public void setDeliveryinstructions(String deliveryinstructions) {
		this.deliveryinstructions = deliveryinstructions;
	}
	public List<ShoppingCartItem> getShoppingCartItems() {
		return shoppingCartItems;
	}
	public void setShoppingCartItems(List<ShoppingCartItem> shoppingCartItems) {
		this.shoppingCartItems = shoppingCartItems;
	}

}
