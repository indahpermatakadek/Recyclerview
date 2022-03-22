package com.example.recyclerview;

public class ItemModel {
    String name,year;
    int film;

    public ItemModel(String name, String year, int film) {
        this.name = name;
        this.year = year;
        this.film = film;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getFilm() {
        return film;
    }
}
