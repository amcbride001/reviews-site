package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewsRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	public ReviewsRepository() {
		//database...build out your reviews
		Review puntaCana = new Review(1L, "Punta Cana", "breathless.jpg", "Caribbean Fun",
				"A");
		Review miami = new Review(2L, "Miami", "sagamore.jpg", "Domestic With A Latin Flavor",
				"B");
		Review vegas = new Review(3L, "Las Vegas", "venetian.jpg","It's Vegas Need I Say More?!?", 
				"C");
		
		reviewList.put(puntaCana.getId(), puntaCana);
		reviewList.put(miami.getId(), miami);
		reviewList.put(vegas.getId(), vegas);
	}

	public ReviewsRepository(Review...reviews) {
		for (Review review :reviews) {
			reviewList.put(review.getId(), review);
		}
	}
	
	public Review findOne(long id) {
		// 
		return reviewList.get(id);
	}

	public Review findOnce(Review reviewDate) {
		// 
		return null;
	}
public Collection< Review> findAll() {
	
	return reviewList.values();
}

}
