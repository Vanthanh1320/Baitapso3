package com.example.thecoffehouse.model;

public class Tieude {

    private int image;
    private String ten;

    public Tieude(int image, String ten) {
        this.image = image;
        this.ten = ten;
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
}
