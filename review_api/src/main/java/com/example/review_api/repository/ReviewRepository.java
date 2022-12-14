package com.example.review_api.repository;

import com.example.review_api.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findReviewsByPieceName(String name);
    Review findReviewById(String id);
}
