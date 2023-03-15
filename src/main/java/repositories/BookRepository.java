package repositories;

import domain.Book;
import domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
//    List<Book> findByTitle(String title);
//    Optional<Book> findByAuthor(String author);
//    Book findByISBNAndTitle(String isbn, String title);
//    List<Book> findFirst2By();
//
//    @Query("select c.author from Book c where c.title= :title")
//    String findAuthorByTitle(@Param("title") String title);
}
