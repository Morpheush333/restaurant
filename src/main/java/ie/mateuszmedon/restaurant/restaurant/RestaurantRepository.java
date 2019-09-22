package ie.mateuszmedon.restaurant.restaurant;

import ie.mateuszmedon.restaurant.restaurant.entity.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
