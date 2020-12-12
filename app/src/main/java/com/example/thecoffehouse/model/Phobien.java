package com.example.thecoffehouse.model;

public class Phobien {
    private int image,id;
    private String ten,gia;

    public Phobien(int image, int id, String ten, String gia) {
        this.image = image;
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public Phobien() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
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
