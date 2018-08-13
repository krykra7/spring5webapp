package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

/**
 * Created by Krystian Krawczyk on 8/13/2018.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
