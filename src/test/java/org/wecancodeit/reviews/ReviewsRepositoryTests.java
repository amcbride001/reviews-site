package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewsRepositoryTests {
	
	ReviewsRepository underTest;

	private long id = 1L;
	private Review review = new Review(id, "title", "category");
	
	private long date = 2L;
	private Review reviewDate = new Review(date, "title", "category");
	private Review secondReview = new Review(date, "title", "category");
	
	@Test 
	public void shouldFindAReview() {
		ReviewsRepository underTest = new ReviewsRepository();
		Review result = underTest.findOne(id);
		
	}
	@Test
	public void shouldFindAReviewByDate() {
		ReviewsRepository underTest = new ReviewsRepository();
		Review result = underTest.findOnce(reviewDate);
		
	}
	@Test
	public void shouldHaveContentInReview(){
		ReviewsRepository underTest = new ReviewsRepository();
		
		
	}
}
