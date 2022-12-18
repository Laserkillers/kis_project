package com.example.kis_dop_proj.service;

import com.example.kis_dop_proj.mapper.TmObjectsMapper;
import com.example.kis_dop_proj.model.DataStorage;
import com.example.kis_dop_proj.model.TmObjects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunWorkDbService {

    @Autowired
    TmObjectsMapper tmObjectsMapper;

    @Autowired
    DataStorage dataStorage;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<TmObjects> tmObjectsList = tmObjectsMapper.selectAll();
        dataStorage.getTmObjectsList().addAll(tmObjectsList);
    }
}
