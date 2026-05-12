package com.social.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.social.model.Post;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        List<Post> posts = new ArrayList<>();

        posts.add(new Post(
                "Lộc",
                "Hôm nay học Spring MVC",
                120,
                "https://picsum.photos/500/300?random=1"));

        posts.add(new Post(
                "An",
                "Đang làm mạng xã hội",
                300,
                "https://picsum.photos/500/300?random=2"));

        posts.add(new Post(
                "Nam",
                "Java Web khá thú vị",
                90,
                "https://picsum.photos/500/300?random=3"));

        posts.sort(Comparator.comparing(Post::getLikes).reversed());

        model.addAttribute("posts", posts);

        return "home";
    }
}