package com.fatec.team1.TeachingPlatform.application.http.controllers;

import com.fatec.team1.TeachingPlatform.application.repositories.CursoRepository;
import com.fatec.team1.TeachingPlatform.application.services.FileLocationService;
import com.fatec.team1.TeachingPlatform.domain.Curso;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin
@RestController
public class CursoController implements WebMvcConfigurer {

    private final CursoRepository repository;
    private final FileLocationService fileLocationService;

    public CursoController(CursoRepository repository, FileLocationService fileLocationService) {
        this.repository = repository;
        this.fileLocationService = fileLocationService;
    }

    @PostMapping("/curso/new")
    Curso newCurso(@RequestBody Curso curso, MultipartFile image) throws Exception {
        return repository.save(curso);
    }
}