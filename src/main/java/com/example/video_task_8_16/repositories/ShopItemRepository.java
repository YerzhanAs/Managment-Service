package com.example.video_task_8_16.repositories;

import com.example.video_task_8_16.entities.ShopItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ShopItemRepository extends JpaRepository<ShopItem, Long> {

    List<ShopItem> findAllByAmountGreaterThanOrderByPriceDesc(int amount);

    ShopItem findByIdAndAmountGreaterThan(Long id, int amount);



}
