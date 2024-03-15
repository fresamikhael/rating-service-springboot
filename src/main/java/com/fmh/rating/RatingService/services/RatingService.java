package com.fmh.rating.RatingService.services;

import com.fmh.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    //Create
    Rating create(Rating rating);


    //Get All Ratings
    List<Rating> getRatings();

    //Get All by UserId
    List<Rating> getRatingByUserId(String userId);

    //Get All by Hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
