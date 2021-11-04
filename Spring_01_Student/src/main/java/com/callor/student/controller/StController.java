package com.callor.student.controller;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService1;

import java.util.List;

public class StController {

    private StService1 stService = new StService1();

    public void list() {
        List<StudentVO> stList = stService.selectAll();
        for(StudentVO vo : stList) {
            vo.toString();
        }
    }
}
