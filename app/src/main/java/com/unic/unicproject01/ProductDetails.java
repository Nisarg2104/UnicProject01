package com.unic.unicproject01;

public class ProductDetails {
    private String shopid,prodId,prodName,prodCategory,prodDesc,imagelink;
    private int price,qtyInStore;

    public ProductDetails(String prodId,String prodName,String prodCategory, String prodDesc,int price,int qtyInStore){
        this.shopid = null;
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCategory = prodCategory;
        this.prodDesc = prodDesc;
        this.price = price;
        this.qtyInStore = qtyInStore;
    }

    public String getProdId() {
        return prodId;
    }
}
