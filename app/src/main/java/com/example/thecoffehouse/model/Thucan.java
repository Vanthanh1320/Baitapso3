package com.example.thecoffehouse.model;

public class Thucan {
    private int image,id;
    private String ten,gia;

    public Thucan(int image, String ten, String gia) {
        this.image = image;
        this.ten = ten;
        this.gia = gia;
    }

    public Thucan() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
