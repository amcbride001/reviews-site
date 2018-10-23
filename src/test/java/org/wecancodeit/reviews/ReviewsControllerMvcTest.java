package org.wecancodeit.reviews;

import javax.annotation.Resource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@RunWith(SpringRunner.class)
@WebMvcTest(ReviewsController.class)
public class ReviewsControllerMvcTest {

	@Mock
	private Review review1;

	@Mock
	private Review review2;

	@MockBean
	private ReviewsRepository reviewsRepo;

	@Resource
	private MockMvc mvc;

	@Test
	public void shouldBeOkForAllReviews() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
	}

	@Test
	public void shouldRouteToAllReviews() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(view().name(is("reviews")));
	}
	@Test
	public void shouldBeOkForSingleReview() throws Exception {
		mvc.perform(get("/review?id=1")).andExpect(status().isOk());
	}
	
//@Test
//public void shouldPutAllReviewsIntoModel() throws Exception {
	//Collection<Review> allReviews = asList(review1, review2);
	//when(reviewsRepo.findAll()).thenReturn(allReviews);
	//mvc.perform(get("/show-reviews")).andExpect(model().attribute("reviews", is(allReviews)));


@Test
public void shouldRouteToSingleReview() throws Exception {
	mvc.perform(get("/review?id=1")).andExpect(view().name(is("review")));
}

@Test
public void shouldPutAReviewIntoModel() throws Exception {
	when(reviewsRepo.findOne(1L)).thenReturn(review1);
	mvc.perform(get("/review?id=1")).andExpect(model().attribute("reviews",is(review1)));
}

}