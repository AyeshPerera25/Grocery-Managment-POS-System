

/*
 * Copyright (c) All Right Reserved to Ayesh Perera
 */

package Model;

public class Item {

    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnStock ;

    public Item() {
    }

    public Item(String code, String description, double unitPrice, int qtyOnStock) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
        this.qtyOnStock = qtyOnStock;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnStock() {
        return qtyOnStock;
    }

    public void setQtyOnStock(int qtyOnStock) {
        this.qtyOnStock = qtyOnStock;
    }
}
