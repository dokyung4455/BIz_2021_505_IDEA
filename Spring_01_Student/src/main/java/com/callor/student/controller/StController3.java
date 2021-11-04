package com.callor.student.controller;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService;

import java.util.List;

public class StController3 {


    public StController3(StService stService) {
        this.stService = stService;
    }

    // 인터페이스로 선언만 하기
    private final StService stService;


    public void list() {
        List<StudentVO> stList = stService.selectAll();
        for(StudentVO vo : stList) {
            vo.toString();
        }
    }
}
