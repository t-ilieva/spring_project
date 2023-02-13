package com.example.application.rest.response;

import com.example.application.data.entities.Author;
import com.example.application.rest.request.AuthorRequest;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthorResponse {
    @PutMapping(value = {"/details/{authorId}",}, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<Author> author(@PathVariable int authorId,
                                       @Valid @RequestBody AuthorRequest request){

        Author author = authorService.author(authorId, request.getFirstName(), request.getLastName());
        return new BaseResponse<>(author);
    }
}
