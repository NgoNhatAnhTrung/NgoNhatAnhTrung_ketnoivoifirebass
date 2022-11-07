package com.example.bt10_ketnoivoi_firebase;

public class StudentModel {
    String name, gia , img;

    StudentModel(){

    }

    public StudentModel(String name, String gia, String img) {
        this.name = name;
        this.gia = gia;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
