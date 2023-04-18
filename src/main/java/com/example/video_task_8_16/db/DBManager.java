package com.example.video_task_8_16.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Items> items=new ArrayList<>();

    static {
        items.add(new Items(1L, "Iphone 11 Pro", 310000));
        items.add(new Items(2L, "Iphone X ", 220000));
        items.add(new Items(3L, "Xiaomi Redmi note", 120000));
        items.add(new Items(4L, "Iphone 14 Pro", 430000));
    }

    private static Long id=5L;

    public static ArrayList<Items> getItems(){
        return items;
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static  Items getItem(Long id){
        for (Items item : items) {
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
}
