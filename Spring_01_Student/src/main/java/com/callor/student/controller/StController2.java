package com.callor.student.controller;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService;
import com.callor.student.service.StService1;

import java.util.List;

public class StController2 {

    
    // 인터페이스로 선언만 하기
    private StService stService;

    // setter 통해서 객체를 주입받도록 하기
    public void setStService(StService stService) {
        this.stService = stService;
    }

    public void list() {
        List<StudentVO> stList = stService.selectAll();
        for(StudentVO vo : stList) {
            vo.toString();
        }
    }
}
