package com.callor.student.service.impl;

import com.callor.student.model.StudentVO;
import com.callor.student.repository.StDao;
import com.callor.student.repository.StDaoImpl;
import com.callor.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplV1 implements StudentService {

    private StDao stDao ;

    public StudentServiceImplV1() {
        stDao = new StDaoImpl();
    }

    public StudentServiceImplV1(StDao stDao) {
        this.stDao = stDao;
    }

    @Override
    public List<StudentVO> selectAll() {
        List<StudentVO> stList = stDao.selectAll();
        return stList;
    }

    @Override
    public StudentVO findByNum(String st_num) {
        return null;
    }

    @Override
    public List<StudentVO> findByName(String st_name) {
        return null;
    }

    @Override
    public List<StudentVO> findByTel(String st_tel) {
        return null;
    }

    @Override
    public List<StudentVO> findByDept(String st_dept) {
        return null;
    }

    @Override
    public List<StudentVO> findByGrade(String st_grade) {
        return null;
    }

    @Override
    public StudentVO insert() {
        return null;
    }

    @Override
    public void insert(StudentVO stVO) {

    }
}
