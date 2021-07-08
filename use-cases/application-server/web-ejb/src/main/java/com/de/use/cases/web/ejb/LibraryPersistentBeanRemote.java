package com.de.use.cases.web.ejb;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface LibraryPersistentBeanRemote {

    void addBook(Book bookName);

    List<Book> getBooks();

}
