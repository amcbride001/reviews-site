package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewsRepositoryTests {
	
	ReviewsRepository underTest;

	private long id = 1L;
	private Review review = new Review(id, "location", "imageUrl", "category", "content" );
	
	private long date = 2L;
	private Review reviewDate = new Review(id, "location", "imageUrl", "category", "content");
	private Review secondReview = new Review(id, "location", "imageUrl", "category", "content");
	
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
