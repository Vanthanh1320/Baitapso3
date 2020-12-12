package com.example.thecoffehouse.model;

public class Coffee {

    private String tencoffee,motacoffee;
    private int image;

    public Coffee(String tencoffee, String motacoffee, int image) {
        this.tencoffee = tencoffee;
        this.motacoffee = motacoffee;
        this.image = image;
    }

    public String getTencoffee() {
        return tencoffee;
    }

    public void setTencoffee(String tencoffee) {
        this.tencoffee = tencoffee;
    }

    public String getMotacoffee() {
        return motacoffee;
    }

    public void setMotacoffee(String motacoffee) {
        this.motacoffee = motacoffee;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
