package com.wad.firstmvc.domain;

public class Crystal {
    private Long id;
    private String name;
    private String subtitle;
    private String description;
    private String image;
    private String moreImage;
    private String detailTitle;
    private double price;
    private double detailPrice;
    private String color;
    private String dimensions;
    private String benefits;
    private String zodiacInfo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMoreImage() {
        return moreImage;
    }

    public void setMoreImage(String moreImage) {
        this.moreImage = moreImage;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(double detailPrice) {
        this.detailPrice = detailPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getZodiacInfo() {
        return zodiacInfo;
    }

    public void setZodiacInfo(String zodiacInfo) {
        this.zodiacInfo = zodiacInfo;
    }
}
