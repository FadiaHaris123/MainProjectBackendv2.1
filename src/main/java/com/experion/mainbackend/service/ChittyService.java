package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.dto.ChittyPostResponse;

public interface ChittyService {

    ChittyPostResponse saveChitty(ChittyPost chittyPost);

    String updateChitty(ChittyPost chittyPost);
}
