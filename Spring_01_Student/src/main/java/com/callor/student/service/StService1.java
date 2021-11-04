package com.callor.student.service;

import com.callor.student.repository.StDaoImpl;
import com.callor.student.model.StudentVO;
import com.callor.student.repository.StDao;

import java.util.Collections;
import java.util.List;

/**
 * StDao 형 객체를 생성하고 인스턴스가 만들어 지는 순간
 * StDao, StDaoImpl, StService 는 상당히 끈끈한 관계가 이루어 진다
 * 결합이 발생했다
 *
 * StDaoImpl 클래스의 변화(변경, 업데이트)가 발생하면
 * StService 에게 영향이 미치게 된다.
 *
 * 아래의 stDao 객체는 StService 와의 결합도를 고민해야 한다
 * 1번 코드는 stDaoImpl 클래스로 선언하고 클래스로 직접 객체 생성
 * 2번 코드는 StDao 클래스로 선언하고 클래스로 간접 객체 생성
 */
public class StService1 implements StService {

    // interface 로 선언하고 상속받은 class 로 초기화(생성) 하기
    // stDaoImpl 클래스를 사용하여 stDao 형(type)의 stDao 객체 생성
    // 클래스의 생성자를 호출하여 객체를 생성하면
    // 이 객체는 StDao 형 인스턴스가 된다
    // private StDaoImpl stDao = new StDaoImpl() // 1번
    private StDao stDao = new StDaoImpl(); // 2번번
    public List<StudentVO> selectAll() {
        List<StudentVO> stList = stDao.selectAll();

        return stList;
    }



}
