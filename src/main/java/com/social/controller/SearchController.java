package com.social.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.social.model.Post;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String search(
            @RequestParam("keyword") String keyword,
            Model model) {

        List<Post> allPosts = new ArrayList<>();

        allPosts.add(new Post(
                "Lộc",
                "Học Spring MVC mỗi ngày",
                120,
                "https://picsum.photos/500/300?random=1"));

        allPosts.add(new Post(
                "An",
                "Du lịch Đà Lạt cuối tuần",
                500,
                "https://picsum.photos/500/300?random=2"));

        allPosts.add(new Post(
                "Nam",
                "Java Web rất thú vị",
                300,
                "https://picsum.photos/500/300?random=3"));

        allPosts.add(new Post(
                "Huy",
                "Học lập trình Java",
                800,
                "https://picsum.photos/500/300?random=4"));

        allPosts.add(new Post(
                "Lan",
                "Spring Boot cực hay",
                1000,
                "https://picsum.photos/500/300?random=5"));

        List<Post> results = new ArrayList<>();

        for(Post p : allPosts) {

            if(p.getContent().toLowerCase()
                    .contains(keyword.toLowerCase())) {

                results.add(p);
            }
        }

        // Sắp xếp bài nhiều tim nhất lên đầu
        results.sort(
                Comparator.comparing(Post::getLikes)
                .reversed());

        model.addAttribute("results", results);
        model.addAttribute("keyword", keyword);

        return "search";
    }
}