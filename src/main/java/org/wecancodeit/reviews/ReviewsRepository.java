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
				"Breathless Resort in lovely Punta Cana. An amazing time in an amazing place. "
				+ "I highly recommend a the foam pool party and the mojito bar. "
				+ "There are a great many excursions to do. I recommend a "
				+ "trip to Saona Island. I'm sure you will love it.");
		Review miami = new Review(2L, "Miami", "sagamore.jpg", "Domestic With A Latin Flavor",
				"The Sagamore Hotel is located in chic South Beach Miami Florida. Very nice."
				+ "views and very even better food. "
				+ "In South Beach there's always great food, great music, and always a chance for a good time.\""); 
		Review vegas = new Review(3L, "Las Vegas", "venetian.jpg","It's Vegas Need I Say More?!?", 
				"One of the nicest places to stay on the strip. I would recommend the Bella Suites.");
		
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
