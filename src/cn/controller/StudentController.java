package cn.controller;

import cn.pojo.Student;
import cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/aaa")
@Controller
public class StudentController {

    @Autowired
    private StudentService stsv;

    public StudentService getStsv() {
        return stsv;
    }

    public void setStsv(StudentService stsv) {
        this.stsv = stsv;
    }


    @ResponseBody
    @RequestMapping(value = "/bbb")
    public String hehe(@RequestBody Student st){
        System.out.println(st.getStudentname() + st.getStudentadress());
        return "成功";
    }
}
