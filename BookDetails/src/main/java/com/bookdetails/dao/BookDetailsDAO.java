package com.bookdetails.dao;

import com.bookdetails.model.BookDetails;

import java.util.HashMap;
import java.util.Map;

public class BookDetailsDAO {

    private static final Map<Integer, BookDetails> bdtlsMap = new HashMap<Integer, BookDetails>();

    static {
        initBookDtls();
    }

    private static void initBookDtls(){
        BookDetails bdtls1=new BookDetails(1001,"Let us C","wsm","S.N.Martyn",503.02);
        BookDetails bdtls2=new BookDetails(1002,"C++","xtr","Welly",384.26);
        BookDetails bdtls3=new BookDetails(1003,"java","bsyn","james",749.74);

        bdtlsMap.put(bdtls1.getBook_id(),bdtls1);
        bdtlsMap.put(bdtls2.getBook_id(),bdtls2);
        bdtlsMap.put(bdtls3.getBook_id(),bdtls3);
    }
    public static BookDetails getEmployee(int book_id) {
        return bdtlsMap.get(book_id);
    }

    public static String addEmployee(BookDetails bookDetails) {
        bdtlsMap.put(bookDetails.getBook_id(), bookDetails);
        return "Book Added Successfully with"+bookDetails.getBook_id()+" Book_Id";
    }
}
