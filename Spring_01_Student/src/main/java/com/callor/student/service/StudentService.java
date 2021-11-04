package com.callor.student.service;

import com.callor.student.model.StudentVO;

import java.util.List;

public interface StudentService {

    public List<StudentVO> selectAll();
    public StudentVO findByNum(String st_num);

    public List<StudentVO> findByName(String st_name);
    public List<StudentVO> findByTel(String st_tel);
    public List<StudentVO> findByDept(String st_dept);
    public List<StudentVO> findByGrade(String st_grade);

    public StudentVO insert();

    public void insert(StudentVO stVO);
}
