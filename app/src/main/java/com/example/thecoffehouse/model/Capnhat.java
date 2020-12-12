package com.example.thecoffehouse.model;

public class Capnhat {
    private String tencapnhat,motacapnhat;
    private int image;

    public Capnhat(String tencapnhat, String motacapnhat, int image) {
        this.tencapnhat = tencapnhat;
        this.motacapnhat = motacapnhat;
        this.image = image;
    }

    public String getTencapnhat() {
        return tencapnhat;
    }

    public void setTencapnhat(String tencapnhat) {
        this.tencapnhat = tencapnhat;
    }

    public String getMotacapnhat() {
        return motacapnhat;
    }

    public void setMotacapnhat(String motacapnhat) {
        this.motacapnhat = motacapnhat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
