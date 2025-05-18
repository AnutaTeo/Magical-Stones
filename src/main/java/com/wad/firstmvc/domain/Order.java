package com.wad.firstmvc.domain;

public class Order {
    private Long id;
    private String username;
    private String productName;
    private double price;
    private String status;

    public Order() {}

    public Order(Long id, String username, String productName, double price, String status) {
        this.id = id;
        this.username = username;
        this.productName = productName;
        this.price = price;
        this.status = status;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
