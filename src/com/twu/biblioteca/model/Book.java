package com.twu.biblioteca.model;
import com.twu.biblioteca.db.DataSources;

import java.util.ArrayList;

/**
 * @author:xiaoq
 * @date:2019/8/9 12:40
 */
public class Book {
    private Integer bookId;
    private String name;
    private String authors;
    private String publishedYear;
    private Boolean checkStatus = false;

    public Boolean getCheckStatus() {
        return this.checkStatus;
    }

    private void setCheckStatus(Boolean checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getName() {
        return name;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public Book(Integer id, String name, String authors, String publishedYear) {
        this.bookId = id;
        this.name = name;
        this.authors = authors;
        this.publishedYear = publishedYear;
    }

    public String getTotalInfo() {
        return name + "|" + authors + "|" + publishedYear;
    }

    public void checkout(User user) {
        if (isChecked()) {
            showCheckoutFailedNotes();
        } else {
            setCheckStatus(true);
            user.addCheckedOutBooksID(this.bookId);
            showCheckoutSuccessNotes();
        }
    }

    public void returnBook(User user) {
        if (isBelongToLibrary() && isChecked()) {
            setCheckStatus(false);
            user.removeCheckedOutBooksID(this.bookId);
            showReturnSuccessNotes();
        } else {
            showReturnFailedNotes();
        }
    }

    private boolean isBelongToLibrary() {
        for (Book book : DataSources.BOOKS) {
            if (book.getName().equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isChecked() {
        return getCheckStatus();
    }

    private void showCheckoutSuccessNotes() {
        System.out.println(DataSources.CHECKOUTBOOKSUCCESSFULNOTES);
    }

    private void showCheckoutFailedNotes() {
        System.out.println(DataSources.CHECKOUTBOOKUNSUCCESSFULNOTES);
    }

    private void showReturnSuccessNotes() {
        System.out.println(DataSources.RETURNSUCCESSFULNOTES);
    }

    private void showReturnFailedNotes() {
        System.out.println(DataSources.RETURNFAILEDNOTES);
    }

    public static Book getBookByName(String name, ArrayList<Book> books) {
        for (Book book : books) {
            if (isNameEqual(name, book)) return book;
        }
        return null;
    }

    private static boolean isNameEqual(String name, Book book) {
        return book.getName().equals(name);
    }

    public static Book getBookById(Integer id, ArrayList<Book> books) {
        for (Book book : books) {
            if (id == book.bookId) return book;
        }
        return null;
    }

}
