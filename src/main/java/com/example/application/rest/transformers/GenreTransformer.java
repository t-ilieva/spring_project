package com.example.application.rest.transformers;

import com.example.application.data.entities.Genre;
import com.example.application.rest.request.GenreRequest;
import com.example.application.rest.response.GenreResponse;

public class GenreTransformer {

    public GenreResponse genreResponse(Genre genre){
        GenreResponse genreResponse = new GenreResponse();
        genreResponse.setId(genre.getId());
        genreResponse.setName(genre.getName());

        return genreResponse;
    }

    public Genre genre(GenreRequest genreRequest){
        Genre genre = new Genre();
        genre.setName(genreRequest.getName());

        return genre;
    }
}
