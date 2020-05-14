package com.lagou.controller;

import com.lagou.dao.ResumeDao;
import com.lagou.pojo.Resume;
import com.lagou.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private ResumeDao resumeDao;

    @RequestMapping("/index")
    public String index() {
        System.out.println("jjjjjj");
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String listAll(User user, Map<String, Object> map, HttpSession session) {
        if("zhangsan".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            List<Resume> all = resumeDao.findAll();
            map.put("listAll", all);
            session.setAttribute("token", user);
            return "list";
        }
        return "redirect:index";
    }

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        return "testInterceptor";
    }
}
