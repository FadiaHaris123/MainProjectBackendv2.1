package com.experion.mainbackend.service;

import com.experion.mainbackend.entity.ChittyCategory;
import com.experion.mainbackend.entity.Manager;
import com.experion.mainbackend.repository.ChitCategoryRepository;
import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.repository.ManagerRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ChittyServiceImpl implements ChittyService{

    private ChitRepository chitRepository;
    private ManagerRepo managerRepo;
    private ChitCategoryRepository chitCategoryRepository;


    @Override
    public ChittyPost addChitty(ChittyPost request) {
        Chitty chitty = new Chitty();
        BeanUtils.copyProperties(request,chitty);
        chitty.setChitNumber(request.getChitNumber());
        chitty.setInstallment(request.getInstallment());
        chitty.setDuration(request.getDuration());
        Optional<ChittyCategory> chittyCategory = chitCategoryRepository.findById(request.getCategory());
        chitty.setCategory(chittyCategory.get());
        chitty.setNumberOfChittal(request.getNumberOfChittal());
        chitty.setTotalAmount(request.getTotalAmount());
        Optional<Manager> manager = managerRepo.findById(request.getManager());
        chitty.setManager(manager.get());
        chitty.setLaunchDate(request.getLaunchDate());
        chitty.setStartDate(request.getStartDate());
        chitRepository.save(chitty);
        return request;
    }



//    public ChittyServiceImpl(ChitRepository chitRepository){this.chitRepository=chitRepository;}


//    @Override
//    public ChittyPostResponse saveChitty(ChittyPost chittyPost) {
//
//        Chitty chitty=new Chitty();
//        chitty.setChitNumber(chittyPost.getChitNumber());
//        chitty.setInstallment(chittyPost.getInstallment());
//        chitty.setDuration(chittyPost.getDuration());
//        chitty.setManager(chittyPost.getManager());
//        chitty.setNumberOfChittal(chittyPost.getNumberOfChittal());
//        chitty.setCategory(chittyPost.getCategory());
//        chitty.setTotalAmount(chittyPost.getTotalAmount());
//        chitty.setLaunchDate(chittyPost.getLaunchDate());
//        chitty.setStartDate(chittyPost.getStartDate());
//
//
//        chitRepository.save(chitty);
//        return null;
//    }



//    @Override
//    public String updateChitty(ChittyPost chittyPost) {
//        return null;
//    }


}
