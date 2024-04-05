/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

/**
 *
 * @author Joaquin
 */
import java.util.Date;

public class Order {
    private int id;
    private Date date;
    private String status;
    private OrderDetail[] details;

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
        this.status = "Pending";
    }

    public double calcSubTotalOrder() {
        double subtotal = 0.0;
        for (OrderDetail detail : details) {
            subtotal += detail.CalcSubTotal();
        }
        return subtotal;
    }

    public double calcTax() {
        return calcSubTotalOrder() * 0.18; // Impuesto fijo del 18%
    }

    public double calcTotal() {
        return calcSubTotalOrder() + calcTax();
    }

    public double calcTotalWeight() {
        double totalWeight = 0.0;
        for (OrderDetail detail : details) {
            totalWeight += detail.CalcWeight();
        }
        return totalWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetail[] getDetails() {
        return details;
    }

    public void setDetails(OrderDetail[] details) {
        this.details = details;
    }
}
