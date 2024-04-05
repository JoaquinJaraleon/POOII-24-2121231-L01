/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class OrderDetail {
    private int id;
    private String taxStatus;
    private ArrayList<Product> products;
    private final double IGV = 0.18;

    public OrderDetail(String taxStatus, int id) {
        this.taxStatus = taxStatus;
        this.id = id;
        this.products = new ArrayList<>();
    }

    public double CalcSubTotal() {
        double subtotal = 0.0;
        for (Product product : products) {
            subtotal += product.GetPrice();
        }
        return subtotal;
    }

    public double CalcWeight() {
        double totalWeight = 0.0;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        return totalWeight;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

