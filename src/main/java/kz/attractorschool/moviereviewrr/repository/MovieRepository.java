package kz.attractorschool.moviereviewrr.repository;

import kz.attractorschool.moviereviewrr.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface MovieRepository extends PagingAndSortingRepository<Movie, String> {

    Optional<Movie> findByTitle(String title);

    Optional<Movie> findAllByReleaseYear(int releaseYear);

    Optional<Movie> findAllByActors(String actor);

    Optional<Movie> findAllByRating(double rating);

    Page<Movie> findAll(Pageable pageable);


}
