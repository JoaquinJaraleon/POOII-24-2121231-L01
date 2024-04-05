/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

/**
 *
 * @author Joaquin
 */
public class Cash extends Payment {
    private double cashAmount;
    private double deduction;

    public Cash(double cashAmount, double deduction) {
        super((float) (cashAmount - deduction)); // El monto real es el monto de efectivo menos la deducción
        this.cashAmount = cashAmount;
        this.deduction = deduction;
    }

    @Override
    public float calculateTotalAmount() {
        return getAmount();
    }

    @Override
    public String toString() {
        return "Cash{" +
                "cashAmount=" + cashAmount +
                ", deduction=" + deduction +
                '}';
    }
}
