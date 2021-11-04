package com.callor.student.controller;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StService stService;


    @ResponseBody
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<StudentVO> list(Model model) {

        List<StudentVO> stList = stService.selectAll();
        model.addAttribute("STLIST", stList);
//        return "student/list";
        return stList;
    }

}
