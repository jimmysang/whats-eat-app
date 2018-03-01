package main.dao;


import main.model.Food;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface FoodDao {

    public List<Food> getFoods(String tag);

    public List<Food> getAllFoods();
}
