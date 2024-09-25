package com.example.rocket;

public class Circle extends Shape{
    private int circumference;
    private int area;

    public Circle(int circumference) {
        this.circumference = circumference;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getCircumference(int circumference) {
        return this.circumference;
    }



}
