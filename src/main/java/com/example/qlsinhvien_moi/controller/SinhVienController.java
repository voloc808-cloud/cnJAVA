package com.example.qlsinhvien_moi.controller;

import com.example.qlsinhvien_moi.entity.SinhVien;
import com.example.qlsinhvien_moi.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienRepository repo;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("sinhvien", new SinhVien());
        return "form";
    }

    @PostMapping("/save")
    public String save(SinhVien sv) {
        repo.save(sv);
        return "redirect:/form";
    }
}