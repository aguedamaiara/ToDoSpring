package br.com.aguedamaiara.todos.controllers;

import br.com.aguedamaiara.todos.models.Todo;
import br.com.aguedamaiara.todos.repositories.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @GetMapping("/")
    public ModelAndView list() {
        return new ModelAndView(
                "todo/list",
                Map.of("todos", todoRepository.findAll(Sort.by("deadline")))
        );
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("todo/form", Map.of("todo", new Todo()));
    }

    @PostMapping("/create")
    public String create(@Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo/form";
        }
        todoRepository.save(todo);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        var todo = todoRepository.findById(id);
        if (todo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return new ModelAndView("todo/form", Map.of("todo", todo.get()));
    }

    @PostMapping("/edit/{id}")
    public String edit(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

}