package no.mesan.clouddevops.rest;

import no.mesan.clouddevops.annotation.Log;
import no.mesan.clouddevops.domain.Todo;
import no.mesan.clouddevops.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/todos")
public class TodoRestController {

    @Autowired
    private TodoService todoService;

    @Log
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Todo> getAll() {
        return todoService.getAll();
    }

    @Log
    @RequestMapping(method = RequestMethod.POST)
    public Todo create(@RequestBody final Todo todo) {
        return todoService.create(todo);
    }

    @Log
    @RequestMapping(method = RequestMethod.PUT)
    public Todo update(@RequestBody final Todo todo) {
        return todoService.update(todo);
    }

    @Log
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable final Long id) {
        todoService.delete(id);
    }


}
