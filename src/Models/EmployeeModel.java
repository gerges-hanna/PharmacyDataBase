/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class EmployeeModel {
    //Employee
    private int ID_E;
    private String EmName;
    private double Salary;
    private String DB;
    
    //Login
    private int ID_L;
    private String Email;
    private String Password;
    
    //Phone
    private int ID_P;
    private String Phone;

    public int getID_E() {
        return ID_E;
    }

    public void setID_E(int ID_E) {
        this.ID_E = ID_E;
    }

    public String getEmName() {
        return EmName;
    }

    public void setEmName(String EmName) {
        this.EmName = EmName;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getDB() {
        return DB;
    }

    public void setDB(String DB) {
        this.DB = DB;
    }

    public int getID_L() {
        return ID_L;
    }

    public void setID_L(int ID_L) {
        this.ID_L = ID_L;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getID_P() {
        return ID_P;
    }

    public void setID_P(int ID_P) {
        this.ID_P = ID_P;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    
    
}
