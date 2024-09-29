package com.jay.role_based_authentication.service;

import com.jay.role_based_authentication.model.StudyMaterials;
import com.jay.role_based_authentication.repository.StudyMaterialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyMaterialsService {

    @Autowired
    private StudyMaterialsRepository studyMaterialsRepository;

    public List<StudyMaterials> getAllMaterial(){
        return studyMaterialsRepository.findAll();
    }

    public StudyMaterials getMaterialById(Long id){
        return studyMaterialsRepository.findById(id).orElse(null);
    }

    public StudyMaterials saveMaterial(StudyMaterials studyMaterials){
        return studyMaterialsRepository.save(studyMaterials);
    }

    public void deleteMaterial(Long id){
        studyMaterialsRepository.deleteById(id);
    }
}
