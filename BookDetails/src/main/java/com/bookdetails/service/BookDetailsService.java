package com.bookdetails.service;

import com.bookdetails.dao.BookDetailsDAO;
import com.bookdetails.model.BookDetails;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/books")
public class BookDetailsService {

    @GET
    @Path("/{book_id}")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public BookDetails getBookDetails(@PathParam("book_id") int book_id){
        return BookDetailsDAO.getEmployee(book_id);
    }

    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public String addBookDetails(BookDetails bookDetails){
        return  BookDetailsDAO.addEmployee(bookDetails);
    }
}
