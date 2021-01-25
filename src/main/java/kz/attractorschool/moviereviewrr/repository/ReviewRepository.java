package kz.attractorschool.moviereviewrr.repository;

import kz.attractorschool.moviereviewrr.model.Movie;
import kz.attractorschool.moviereviewrr.model.Review;
import kz.attractorschool.moviereviewrr.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.util.Optional;

@Repository
public interface ReviewRepository extends CrudRepository<Review, String> {
    Optional<Review> findByReviewerOrMovie(User reviewer, Movie movie);
    Optional<Review>findByMovie(Movie toMovie);
    boolean existsByReviewerAndMovie(User reviewer, Movie toMovie);
    Optional<Review>findAllByMovie(Movie movie);


}