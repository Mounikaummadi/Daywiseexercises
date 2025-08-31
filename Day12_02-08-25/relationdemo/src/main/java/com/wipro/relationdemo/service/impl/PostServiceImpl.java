package com.wipro.relationdemo.service.impl;
import org.springframework.stereotype.Service;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.entity.Post;
import com.wipro.relationdemo.repo.PersonRepository;
import com.wipro.relationdemo.repo.PostRepository;
import com.wipro.relationdemo.service.PostService;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final PersonRepository personRepository;

    public PostServiceImpl(PostRepository postRepository, PersonRepository personRepository) {
        this.postRepository = postRepository;
        this.personRepository = personRepository;
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getPostsByPersonId(Long personId) {
        Person person = personRepository.findById(personId).orElse(null);
        return (person != null) ? person.getPosts() : List.of();
    }
}
