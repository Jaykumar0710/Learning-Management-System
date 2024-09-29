package com.jay.role_based_authentication.service;

import com.jay.role_based_authentication.model.LiveLecture;
import com.jay.role_based_authentication.repository.LiveLectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveLectureService {

    @Autowired
    private LiveLectureRepository liveLectureRepository;

    public List<LiveLecture> getAllLecture(){
        return liveLectureRepository.findAll();
    }

    public LiveLecture getLectureById(Long id){
        return liveLectureRepository.findById(id).orElse(null);
    }

    public LiveLecture saveLecture(LiveLecture liveLecture){
        return liveLectureRepository.save(liveLecture);
    }

    public void deleteLecture(Long id){
        liveLectureRepository.deleteById(id);
    }
}
