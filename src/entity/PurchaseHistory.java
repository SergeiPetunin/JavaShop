/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author spetu
 */
public class PurchaseHistory {
    
    private Order order;
    private Buyer buyer;
    private Date purcheaseDate;

    public PurchaseHistory() {
    }
    
    public PurchaseHistory(Order order, Buyer buyer, Date purcheaseDate) {
        
        this.order = order;
        this.buyer = buyer;
        this.purcheaseDate = purcheaseDate;
    }

    public Order getOrder() {
        return order;
    }
    

    public void setOrder(Order order) {
        this.order = order;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Date getPurcheaseDate() {
        return purcheaseDate;
    }

    public void setPurcheaseDate(Date purchease) {
        this.purcheaseDate = purchease;
    }

    @Override
    public String toString() {
        return "Order{" 
                + "id=" + order.getOrderID()
                + ", buyer=" + buyer.getFirstname()+" "+buyer.getLastname()
                + ", purcheaseDate=" + purcheaseDate
                + '}';
    }
    
}
