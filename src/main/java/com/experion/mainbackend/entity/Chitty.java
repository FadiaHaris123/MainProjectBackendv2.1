package com.experion.mainbackend.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "chitty")
@Data
public class Chitty {

    @Id
    @Column(name = "chit_number")
    private Long chitNumber;

    @Column(name = "installment")
    private Long installment;

    @Column(name = "duration")
    private Long duration;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",nullable = false)
    @JsonIgnore
    private ChittyCategory category;

    @Column(name = "number_of_chittals")
    private int numberOfChittal;

    @Column(name = "total_amount")
    private Long totalAmount;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_emp_id",nullable = false)
    @JsonIgnore
    private Manager manager;

    @Column(name="launch_date")
    private Date launchDate;

    @Column(name="start_date")
    private Date startDate;

    public Chitty(Long chitNumber, Long installment, Long duration, ChittyCategory category, int numberOfChittal, Long totalAmount, Manager manager, Date launchDate, Date startDate) {
        this.chitNumber = chitNumber;
        this.installment = installment;
        this.duration = duration;
        this.category = category;
        this.numberOfChittal = numberOfChittal;
        this.totalAmount = totalAmount;
        this.manager = manager;
        this.launchDate = launchDate;
        this.startDate = startDate;
    }

    public Chitty() {
    }

}
