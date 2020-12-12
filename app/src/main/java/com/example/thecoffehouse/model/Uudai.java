package com.example.thecoffehouse.model;

public class Uudai {

    private String ten,mota;
    private int image;

    public Uudai(String ten, String mota, int image) {
        this.ten = ten;
        this.mota = mota;
        this.image = image;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
