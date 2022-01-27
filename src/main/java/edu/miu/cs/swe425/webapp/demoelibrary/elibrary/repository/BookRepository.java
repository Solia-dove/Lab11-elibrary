package edu.miu.cs.swe425.webapp.demoelibrary.elibrary.repository;

import edu.miu.cs.swe425.webapp.demoelibrary.elibrary.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.

    /**
     * Search queries
     */
    //List<Book> findBooksByTitleContainsOrIsbnContainsOrOverdueFeeContainsOrPublisherContainsOrDatePublishedContainsOrderByTitle(String searchString);
    List<Book> findAllByIsbnContainingOrTitleContainingOrPublisherContainingOrderByTitle(String isbn,
                                                                                         String title, String pub);
    List<Book> findAllByOverdueFeeEquals(Double overdueFee);
    List<Book> findAllByDatePublishedEquals(LocalDate datePublished);

    // More queries
    List<Book> findBooksByDatePublishedIsStartingWith(String str);
}
