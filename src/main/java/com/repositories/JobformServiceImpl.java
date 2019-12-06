package com.repositories;

import com.Models.JobformService;
import com.entities.JobForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobformServiceImpl implements JobformService {
    @Autowired
    private JobformRepository jobformRepository;

    @Override
    @Transactional
    public void addJobForm(JobForm jobForm) {
        jobformRepository.save(jobForm);


    }

    @Override
    @Transactional
    public List<JobForm> listJobForm() {
        return (List<JobForm>) jobformRepository.findAll();

    }

    @Override
    @Transactional
    public void removeJobForm(long id) {
        jobformRepository.deleteById(id);
    }

    @Override
    public List<JobForm> getAllById(String id) {
        return  jobformRepository.getAllById();
    }

    @Override
    public String getStatistics() {
        return jobformRepository.getStatistics();
    }


}