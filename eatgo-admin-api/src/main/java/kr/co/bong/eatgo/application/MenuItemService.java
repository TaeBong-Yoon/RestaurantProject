package kr.co.bong.eatgo.application;

import kr.co.bong.eatgo.domain.MenuItem;
import kr.co.bong.eatgo.domain.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class MenuItemService {

    private MenuItemRepository menuItemRepository;
    @Autowired
    public MenuItemService(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    public void bulkUpdate(Long restaurantID, List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems){
            update(restaurantID, menuItem);
        }
    }

    private void update(Long restaurantID, MenuItem menuItem) {
        if(menuItem.isDestroy()) {
            menuItemRepository.deleteById(menuItem.getId());
            return;
        }
        menuItem.setRestaurantId(restaurantID);
        menuItemRepository.save(menuItem);
    }

    public List<MenuItem> getMenuItems(Long restaurantId) {
        return menuItemRepository.findAllByRestaurantId(restaurantId);
    }
}
