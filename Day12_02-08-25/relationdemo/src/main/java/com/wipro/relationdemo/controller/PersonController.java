package com.wipro.relationdemo.controller;

import org.springframework.web.bind.annotation.*;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.entity.Post;
import com.wipro.relationdemo.service.PersonService;
import com.wipro.relationdemo.service.PostService;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;
    private final PostService postService;

    public PersonController(PersonService personService, PostService postService) {
        this.personService = personService;
        this.postService = postService;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }

    @PostMapping("/{id}/posts")
    public Post addPostToPerson(@PathVariable Long id, @RequestBody Post post) {
        Person person = personService.getPersonById(id);
        if (person != null) {
            post.setPerson(person);
            return postService.savePost(post);
        }
        return null;
    }

    @GetMapping("/{id}/posts")
    public List<Post> getPostsByPerson(@PathVariable Long id) {
        return postService.getPostsByPersonId(id);
    }
}