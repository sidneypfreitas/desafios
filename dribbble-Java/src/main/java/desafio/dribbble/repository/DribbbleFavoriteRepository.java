package desafio.dribbble.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import desafio.dribbble.domain.Favorite;

@RepositoryRestResource
public interface DribbbleFavoriteRepository extends CrudRepository<Favorite, Long>
{
}
