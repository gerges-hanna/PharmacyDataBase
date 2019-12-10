/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Gerges hanna FCI-H
 */

public class ReviewModel {
    public static ArrayList<ReviewModel> listReview=new ArrayList<ReviewModel>();
    //Sell
    private int OP_ID;
    private String Parcode;
    private String Med_Name;
    private double price;
    private double Retail;
    private int Quantity_M;
    private int Emp_ID;
    private String Sell_Date;
    private String Sell_Time;
    private int ID_Med;

    public ReviewModel() {
    }

    public ReviewModel(int OP_ID, String Parcode, String Med_Name, double price, double Retail, int Quantity_M, int Emp_ID, String Sell_Date, String Sell_Time, int ID_Med) {
        this.OP_ID = OP_ID;
        this.Parcode = Parcode;
        this.Med_Name = Med_Name;
        this.price = price;
        this.Retail = Retail;
        this.Quantity_M = Quantity_M;
        this.Emp_ID = Emp_ID;
        this.Sell_Date = Sell_Date;
        this.Sell_Time = Sell_Time;
        this.ID_Med = ID_Med;
    }
    
    
    
    public int getOP_ID() {
        return OP_ID;
    }

    public void setOP_ID(int OP_ID) {
        this.OP_ID = OP_ID;
    }

    public String getParcode() {
        return Parcode;
    }

    public void setParcode(String Parcode) {
        this.Parcode = Parcode;
    }

    public String getMed_Name() {
        return Med_Name;
    }

    public void setMed_Name(String Med_Name) {
        this.Med_Name = Med_Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRetail() {
        return Retail;
    }

    public void setRetail(double Retail) {
        this.Retail = Retail;
    }

    public int getQuantity_M() {
        return Quantity_M;
    }

    public void setQuantity_M(int Quantity_M) {
        this.Quantity_M = Quantity_M;
    }

    public int getEmp_ID() {
        return Emp_ID;
    }

    public void setEmp_ID(int Emp_ID) {
        this.Emp_ID = Emp_ID;
    }

    public String getSell_Date() {
        return Sell_Date;
    }

    public void setSell_Date(String Sell_Date) {
        this.Sell_Date = Sell_Date;
    }

    public String getSell_Time() {
        return Sell_Time;
    }

    public void setSell_Time(String Sell_Time) {
        this.Sell_Time = Sell_Time;
    }

    public int getID_Med() {
        return ID_Med;
    }

    public void setID_Med(int ID_Med) {
        this.ID_Med = ID_Med;
    }
    
    
}
