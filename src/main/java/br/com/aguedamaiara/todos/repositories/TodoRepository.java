package br.com.aguedamaiara.todos.repositories;

import br.com.aguedamaiara.todos.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {



}

