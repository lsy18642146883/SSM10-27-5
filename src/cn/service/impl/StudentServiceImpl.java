package cn.service.impl;

import cn.dao.StudentDao;
import cn.pojo.Student;
import cn.service.StudentService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao std;

    public StudentDao getStd() {
        return std;
    }

    public void setStd(StudentDao std) {
        this.std = std;
    }


    @Override
    public String getAll(){
        List<Student> stList = std.getAll();
        return JSON.toJSONString(stList);
    }
}
