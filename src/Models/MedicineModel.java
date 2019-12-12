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

public class MedicineModel{
   
    public static ArrayList<MedicineModel> dataofmedicine =new ArrayList<MedicineModel>();
    public static ArrayList<MedicineModel> buydata =new ArrayList<MedicineModel>();
    private int ID_M;
    private String Parcode;
    private String Med_Name;
    private double price;
    private double Retail;
    private int Quantity_M;
    private String EXP;

    public MedicineModel() {
    }

    public MedicineModel(String Parcode, String Med_Name, double price, double Retail, int Quantity_M, String EXP) {
        this.Parcode = Parcode;
        this.Med_Name = Med_Name;
        this.price = price;
        this.Retail = Retail;
        this.Quantity_M = Quantity_M;
        this.EXP = EXP;
    }

    public MedicineModel(int ID_M, String Parcode, String Med_Name, double price, double Retail, int Quantity_M, String EXP) {
        this.ID_M = ID_M;
        this.Parcode = Parcode;
        this.Med_Name = Med_Name;
        this.price = price;
        this.Retail = Retail;
        this.Quantity_M = Quantity_M;
        this.EXP = EXP;
    }
    

    

    public int getID_M() {
        return ID_M;
    }

    public void setID_M(int ID_M) {
        this.ID_M = ID_M;
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

    public String getEXP() {
        return EXP;
    }

    public void setEXP(String EXP) {
        this.EXP = EXP;
    }

   
    
    
}