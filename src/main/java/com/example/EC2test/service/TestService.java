package com.example.EC2test.service;


import com.example.EC2test.entity.Test;
import com.example.EC2test.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    public String findName(Long id) {
        return testRepository.findById(id).get().getName();
    }
    public Test insertName(String name) {
        Test test = new Test(null, name);
        return testRepository.save(test);
    }
}
