package com.example.video_task_8_16.services.impl;

import com.example.video_task_8_16.entities.Categories;
import com.example.video_task_8_16.entities.Countries;
import com.example.video_task_8_16.entities.ShopItem;
import com.example.video_task_8_16.repositories.CategoryRepository;
import com.example.video_task_8_16.repositories.CountryRepository;
import com.example.video_task_8_16.repositories.ShopItemRepository;
import com.example.video_task_8_16.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl  implements ItemService {


    private ShopItemRepository shopItemRepository;
    private CountryRepository countryRepository;

    private CategoryRepository categoryRepository;

    @Autowired
    public ItemServiceImpl(ShopItemRepository shopItemRepository, CountryRepository countryRepository, CategoryRepository categoryRepository) {
        this.shopItemRepository = shopItemRepository;
        this.countryRepository = countryRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public ShopItem addItem(ShopItem shopItem) {
        return shopItemRepository.save(shopItem);
    }

    @Override
    public List<ShopItem> getAllItems() {
        return shopItemRepository.findAllByAmountGreaterThanOrderByPriceDesc(0);
    }

    @Override
    public ShopItem getItem(Long id) {
        return shopItemRepository.findByIdAndAmountGreaterThan(id, 0);
    }

    @Override
    public void deleteItem(ShopItem item) {
      shopItemRepository.delete(item);
    }

    @Override
    public ShopItem saveItem(ShopItem item) {
        return shopItemRepository.save(item);
    }

    @Override
    public List<Countries> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Countries addCountry(Countries countries) {
        return countryRepository.save(countries);
    }

    @Override
    public Countries saveCountry(Countries countries) {
        return countryRepository.save(countries);
    }

    @Override
    public Countries getCountry(Long id) {
        return countryRepository.getOne(id);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Categories getCategory(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public Categories saveCategory(Categories category) {
        return categoryRepository.save(category);
    }

    @Override
    public Categories addCategory(Categories category) {
        return null;
    }
}
