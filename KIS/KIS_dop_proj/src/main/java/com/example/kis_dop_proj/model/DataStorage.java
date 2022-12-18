package com.example.kis_dop_proj.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataStorage {

    private final List<TmObjects> tmObjectsList = new ArrayList<>();

    public List<TmObjects> getTmObjectsList() {
        return tmObjectsList;
    }
}
