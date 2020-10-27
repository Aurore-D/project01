package com.jxd.emp.service.impl;

import com.jxd.emp.mapper.IEmpMapper;
import com.jxd.emp.model.Emp;
import com.jxd.emp.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author WangYue
 * @Date 2020/10/23
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    public IEmpMapper empMapper;

    @Override
    public List<Emp> getAll() {
        return empMapper.getAll();
    }
}
