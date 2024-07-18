package com.lgcns.mission.chinesefood.biz;

public interface IChineseRestaurantBiz {
	public void initializeOrder();
	public void printOrderList();
	public void printOrderDetail();
	public void insertOrder();
	public void cancelOrder();
	public void changeOrder();
	public void completeOrder();
	public int getOrderNumber();
}
