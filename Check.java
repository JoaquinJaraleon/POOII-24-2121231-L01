/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

/**
 *
 * @author Joaquin
 */
public class Check extends Payment {
    private String name;
    private String bankID;

    public Check(String name, String bankID, float amount) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    @Override
    public float calculateTotalAmount() {
        return getAmount();
    }

    @Override
    public String toString() {
        return "Check{" +
                "name='" + name + '\'' +
                ", bankID='" + bankID + '\'' +
                '}';
    }
}
