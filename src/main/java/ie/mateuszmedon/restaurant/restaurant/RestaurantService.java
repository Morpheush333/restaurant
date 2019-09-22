package ie.mateuszmedon.restaurant.restaurant;


import ie.mateuszmedon.restaurant.restaurant.entity.Restaurant;
import org.springframework.stereotype.Service;


@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Iterable<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }


    public Restaurant findById(Long id){
        if(id == null && id<=0){
            throw new IllegalArgumentException();
        }
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("invalid id: " + id));
//        TODO addon a pointer exception and make id work (controllerAdvice, ExceptionHandler)
    }



}
