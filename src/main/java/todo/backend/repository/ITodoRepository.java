package todo.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import todo.backend.model.Todo;

@RepositoryRestResource(path = "todos")
@Repository
public interface ITodoRepository extends JpaRepository<Todo, Long> {
    
}
