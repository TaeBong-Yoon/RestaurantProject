package kr.co.bong.eatgo.interfaces;

import kr.co.bong.eatgo.domain.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {

    Review save(Review review);

    List<Review> findAllByRestaurantId(Long restaurantId);

    List<Review> findAll();

}
