package com.kaung.mapper;

import com.kaung.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    public List<Department> getDepartmentList();
    public Department getDepartmentById(Integer id);
}
