package com.example.qthjen.recyclerview;

public class MyData {

    private int image;
    private String title;

    public MyData(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public int getImage() {

        return image;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTitle() {

        return title;
    }

}
