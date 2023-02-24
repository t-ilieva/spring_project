package com.example.application.rest.transformers;

import com.example.application.data.entities.Book;
import com.example.application.rest.request.BookRequest;
import com.example.application.rest.response.BookResponse;
import com.example.application.rest.response.DeactivationReasonResponse;

import java.text.SimpleDateFormat;

public class BookTransformer {

    private static final SimpleDateFormat DATE_TIME_FORMATTER = new SimpleDateFormat("yyyy-MM-dd");
    private DeactivationReasonTransformer deactivationReasonTransformer;

    public BookResponse bookResponse(Book book){
        BookResponse bookResponse = new BookResponse();
        bookResponse.setId(book.getId());
        bookResponse.setAmount(book.getAmount());
        bookResponse.setTitle(book.getTitle());
        bookResponse.setYear(book.getYear());
        bookResponse.setPublisher(book.getPublisher());
        bookResponse.setLanguage(book.getLanguage());
        bookResponse.setStatus(book.isStatus());
        bookResponse.setDeactivationDescription(book.getDeactivationDescription());
        bookResponse.setDateAdded(DATE_TIME_FORMATTER.format(book.getDateAdded()));
        bookResponse.setDeactivationDate(DATE_TIME_FORMATTER.format(book.getDeactivationDate()));

        DeactivationReasonResponse deactivationReasonResponse =
                deactivationReasonTransformer.deactivationReasonResponse(book.getDeactivationReason());

        bookResponse.setDeactivationReasonResponse(deactivationReasonResponse);

        return bookResponse;
    }

    public Book book(BookRequest bookRequest){
        Book book = new Book();

        return book;
    }
}
