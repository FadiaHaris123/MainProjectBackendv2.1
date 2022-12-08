package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.dto.ChittyPostResponse;
import com.experion.mainbackend.service.ChittyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")

@RequestMapping("*/api/chitty")

public class ChitPostController {

    @Autowired
    private ChittyService chittyService;

    public ChitPostController(ChittyService chittyService)
    {
        this.chittyService=chittyService;
    }


    @PostMapping("/launch")
    public ChittyPostResponse saveChitty(@RequestBody ChittyPost chittyPost){
        ChittyPostResponse chittyPostResponse=chittyService.saveChitty(chittyPost);

            return chittyPostResponse;
    }
    @PutMapping("/updatedate")
    public void updateChitty(@RequestBody ChittyPost chittyPost){
        chittyService.updateChitty(chittyPost);
    }

}
