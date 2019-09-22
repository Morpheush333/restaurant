package ie.mateuszmedon.restaurant.restaurant;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.ManyToOne;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {

    private RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping
    public ModelAndView allRestaurants(){
        ModelAndView modelAndView = new ModelAndView("restaurants/allRestaurants");
        modelAndView.addObject("restaurants", restaurantService.findAll());
        return modelAndView;
    }

    @GetMapping("/{restaurantId}")
    public ModelAndView findById (@PathVariable("restaurantId") Long id) {
        ModelAndView modelAndView = new ModelAndView("restaurant/restaurant-view");
        modelAndView.addObject("restaurant", restaurantService.findById(id));
        return modelAndView;

    }
}
