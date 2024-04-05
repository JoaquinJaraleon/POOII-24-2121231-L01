/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios01;

/**
 *
 * @author Joaquin
 */
public class Product {
    private int idProduct;
    private String description;
    private int quantity;
    private double weight;

    public Product() {
    }

    public Product(int idProduct, String description, int quantity, double weight) {
        this.idProduct = idProduct;
        this.description = description;
        this.quantity = quantity;
        this.weight = weight;
    }

    public double GetPrice() {
        double unitPrice = 4.00; // Precio unitario fijo
        return unitPrice * quantity;
    }

    public boolean InStock() {
        return quantity > 0;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                '}';
    }
}

