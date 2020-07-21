package com.online.himzaika.Model;

public class Menu_model {


    public Menu_model(String title, int image) {
        Title = title;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    private String Title;
    private int Image;






}