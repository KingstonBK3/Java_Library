/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class History {
    private Date giveofDate;
    private Date returnofDate;
    private Book book;
    private Reader reader;
    
    public History(){
        
    }

    public History(Date giveofDate, Date returnofDate, Book book, Reader reader) {
        this.giveofDate = giveofDate;
        this.returnofDate = returnofDate;
        this.book = book;
        this.reader = reader;
    }

    @Override
    public String toString() {
        return "History{" + "giveofDate=" + giveofDate + ", returnofDate=" + returnofDate + ", book=" + book.getName() + ", "+ book.getAuthor() + "reader=" + reader.getName() + ", " + reader.getSurname() + '}';
    }

    public Date getGiveofDate() {
        return giveofDate;
    }

    public void setGiveofDate(Date giveofDate) {
        this.giveofDate = giveofDate;
    }

    public Date getReturnofDate() {
        return returnofDate;
    }

    public void setReturnofDate(Date returnofDate) {
        this.returnofDate = returnofDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.giveofDate);
        hash = 97 * hash + Objects.hashCode(this.returnofDate);
        hash = 97 * hash + Objects.hashCode(this.book);
        hash = 97 * hash + Objects.hashCode(this.reader);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (!Objects.equals(this.giveofDate, other.giveofDate)) {
            return false;
        }
        if (!Objects.equals(this.returnofDate, other.returnofDate)) {
            return false;
        }
        if (!Objects.equals(this.book, other.book)) {
            return false;
        }
        return Objects.equals(this.reader, other.reader);
    }

    public void setBook(ArrayList<Book> books) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setReader(ArrayList<Reader> readers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
