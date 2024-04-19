package com.springapi.springapi.API.model;

public class Order {
    private int OrderId;
    private String name,OrderDate,OrderItem,orderType;
    private double price;


    public Order(int OrderId,String name,String OrderDate,String OrderItem,double price,String orderType)
    {
        this.OrderId=OrderId;
        this.name=name;
        this.OrderDate=OrderDate;
        this.OrderItem=OrderItem;
        this.price=price;
        this.orderType=orderType;
    }


    public int getOrderId() {
        return OrderId;
    }


    public void setOrderId(int orderId) {
        OrderId = orderId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOrderDate() {
        return OrderDate;
    }


    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }


    public String getOrderItem() {
        return OrderItem;
    }


    public void setOrderItem(String orderItem) {
        OrderItem = orderItem;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public String getOrderType() {
        return orderType;
    }


    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    
}


