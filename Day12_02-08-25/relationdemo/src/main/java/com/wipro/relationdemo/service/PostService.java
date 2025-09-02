package com.wipro.relationdemo.service;
import java.util.List;

import com.wipro.relationdemo.entity.Post;

public interface PostService {
    Post savePost(Post post);
    List<Post> getPostsByPersonId(Long personId);
}
