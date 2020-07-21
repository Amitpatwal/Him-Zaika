package com.online.himzaika.Model;

public class Tab_Model {

    private String Title,Mrp;
    private int Image;



    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getMrp() {
        return Mrp;
    }

    public void setMrp(String mrp) {
        Mrp = mrp;
    }

    public Tab_Model(String title, String mrp, int image) {
        Title = title;
        Mrp = mrp;
        Image=image;
    }
}
