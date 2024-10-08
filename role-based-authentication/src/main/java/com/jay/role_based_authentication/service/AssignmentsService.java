package com.jay.role_based_authentication.service;

import com.jay.role_based_authentication.model.Assignments;
import com.jay.role_based_authentication.repository.AssignmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentsService {
    @Autowired
    private AssignmentsRepository assignmentsRepository;


    public List<Assignments>getAllAssignments(){
        return assignmentsRepository.findAll();
    }

    public Assignments getAssignmentsById(Long id){
        return assignmentsRepository.findById(id).orElse(null);
    }

    public Assignments saveAssignments(Assignments assignments){
        return assignmentsRepository.save(assignments);
    }

    public void deleteAssignments(Long id){
        assignmentsRepository.deleteById(id);
    }
}
