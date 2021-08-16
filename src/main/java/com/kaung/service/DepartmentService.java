package com.kaung.service;

import com.kaung.pojo.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartmentList();
    public Department getDepartmentById(Integer id);
}
