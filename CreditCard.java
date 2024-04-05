/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class CreditCard extends Payment {
    private String name;
    private String type;
    private Date expDate;
    private boolean authorized;

    public CreditCard(String name, String type, Date expDate, boolean authorized, float amount) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
        this.authorized = authorized;
    }

    @Override
    public float calculateTotalAmount() {
        return getAmount();
    }

    @Override
    public String toString() {
        String authorizedStatus = authorized ? "Authorized" : "Not Authorized";
        return "CreditCard{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", expDate=" + expDate +
                ", authorized=" + authorized +
                '}';
    }
}
