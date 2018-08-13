package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Publisher;

/**
 * Created by Krystian Krawczyk on 8/13/2018.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
