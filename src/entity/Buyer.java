/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author spetu
 */
public class Buyer {
    
    private int buyerID;
    private String firstname;
    private String lastname;
    private String phone;

    public Buyer() {
    }
    
    public Buyer(int buyerID, String firstname, String lastname, String phone) {
        this.buyerID = buyerID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Buyer{" 
                + "buyerID" + buyerID
                + "firstname=" + firstname 
                + ", lastname=" + lastname 
                + ", phone=" + phone 
                + '}';
    }
}
