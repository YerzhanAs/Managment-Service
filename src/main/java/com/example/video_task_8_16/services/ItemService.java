package com.example.video_task_8_16.services;

import com.example.video_task_8_16.entities.Categories;
import com.example.video_task_8_16.entities.Countries;
import com.example.video_task_8_16.entities.ShopItem;

import java.util.List;

public interface ItemService {

    ShopItem addItem(ShopItem shopItem);

    List<ShopItem> getAllItems();

    ShopItem getItem(Long id);

    void deleteItem(ShopItem item);

    ShopItem saveItem(ShopItem item);

    List<Countries> getAllCountries();
    Countries addCountry(Countries countries);
    Countries saveCountry(Countries countries);
    Countries getCountry(Long id);

    List<Categories> getAllCategories();

    Categories getCategory(Long id);

    Categories saveCategory(Categories category);

    Categories addCategory(Categories category);
}
