package com.experion.mainbackend.dto;

import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.ChittyCategory;
import com.experion.mainbackend.entity.Manager;
import lombok.Data;

import java.util.Date;

@Data
public class ChittyPost {

    private Long chitNumber;
    private Long installment;
    private Long duration;
    private Manager manager;
    private Integer numberOfChittal;
    private ChittyCategory category;
    private Long totalAmount;
    private Date launchDate;
    private Date startDate;
}
