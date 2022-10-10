/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Arrays;

/**
 *
 * @author spetu
 */
public class Order {
    
    private int orderID;
    private Product[] products;
    
    public Order() {
    }
    
    public Order(int orderID, Product[] products) {
        this.orderID = orderID;
        this.products = products;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    @Override
    public String toString() {
        return "Products{" + Arrays.toString(getProducts()) + '}';
    }
}
