/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author alumno
 */
public class Account {
    private double balance;
    private String number;
    
    public Account(double balance, String number){
        this.balance= balance;
        this.number= number;
    }
    public Account(){
        this(0.00,"UnNumero");
    }
    
    public double getBalance(){
       return this.balance; 
    }
    public void setBalance(){
        this.balance = balance;
    }
    public String getNumber(){
        return this.number;
    }
    public void setNumer(){
        this.number = number;
    }
    public void deposit(double amount){
        this.balance += amount; //balance = balance + amount
    }
    public boolean withDrawal(double amount){
        //this.balance -= amount; //balance = balance - amount;
        if (balance >= amount){
            this.balance -= amount;
            return true;
        }else{
            System.out.println("Insufficient founds");
            return false;
        }
    }

    void withdrawal(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
