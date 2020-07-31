package kr.co.bong.eatgo.application;

import kr.co.bong.eatgo.domain.Review;
import kr.co.bong.eatgo.domain.ReviewRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ReviewServiceTests {

    private ReviewService reviewService;
    @Mock
    private ReviewRepository reviewRepository;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        reviewService = new ReviewService(reviewRepository);
    }

    @Test
    public void addReview(){
        Review review = Review.builder()
                .name("user")
                .score(3)
                .description("Good")
                .build();
        reviewService.addReview(1004L,review);

        verify(reviewRepository).save(any());
    }

}