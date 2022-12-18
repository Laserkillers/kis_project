package com.example.kis_dop_proj.controller;

import com.example.kis_dop_proj.model.DataStorage;
import com.example.kis_dop_proj.model.TmObjects;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kis")
public class MainController {
    @Autowired
    DataStorage dataStorage;

    @Operation(summary = "Список вагонов",
    description = "Сервис возвращает список актуальных объектов")
    @GetMapping(value = "/objects", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TmObjects> getTmObjects() {
        return dataStorage.getTmObjectsList();
    }

}
