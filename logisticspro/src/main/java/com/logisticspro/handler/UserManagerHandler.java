package com.logisticspro.handler;

import com.logisticspro.pojo.Authority;
import com.logisticspro.pojo.Employees;
import com.logisticspro.service.inter.UserManagerServiceInter;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 刘涵
 * @Date: 2019-12-02 08:35
 * @Description:用户认证授权管理
 */
@Controller("userManagerHandle")
@RequestMapping("/userManager")
public class UserManagerHandler {
    @Resource(name = "userManagerServiceImpl")
    private UserManagerServiceInter userManagerServiceInter = null;

    public void setUserManagerServiceInter(UserManagerServiceInter userManagerServiceInter) {
        this.userManagerServiceInter = userManagerServiceInter;
    }

    /**
     * 用户信息验证
     * @param empUserName 用户名
     * @param empUserPass 密码
     * @param request
     * @return String
     */
    @RequestMapping("/excuteLogin.action")
    public String excuteLogin(String empUserName, String empUserPass, HttpServletRequest request){

        //判断参数不为null
        if(null != empUserName && null != empUserPass){

            //存至UsernamePasswordToken中
            UsernamePasswordToken token = new UsernamePasswordToken(empUserName, empUserPass);
            Subject currentUser = SecurityUtils.getSubject();
            try {
                //登录，验证
                currentUser.login(token);
            } catch (AuthenticationException e) {
                //验证异常
                e.getMessage();
                e.printStackTrace();
                System.out.println("登录失败");

                //登录失败返回登录页面
                return "redirect:/login.html";
            }

            //登录成功，返回index.html首页
            return "redirect:/index.html";
        }else {
            //参数为null返回登录页面
            return "redirect:/login.html";
        }
    }

    /**
     * 获得菜单信息
     * @return  String
     */
    @RequestMapping("/excuteSearchMunu.action")
    @ResponseBody
    public Map<String,Authority> excuteSearchMunu(HttpServletRequest request){

        //将数据从Request中取 Employees_Info
        Employees employees = (Employees)request.getSession().getAttribute("Employees_Info");

        //获得菜单信息，通过员工信息查询
        Map<String,Authority> map = userManagerServiceInter.excuteSearchMunu(employees);

        //返回map
        return map;
    }
    /**
     * 获得登录名
     * @return String
     */
    @RequestMapping(value="/searchLoginName.action")
    @ResponseBody
    public String searchLoginName(HttpServletRequest request, HttpServletResponse response){

        //将数据从Request中取 Employees_Info
        Employees employees = (Employees)request.getSession().getAttribute("Employees_Info");

        //返回员工名字
        return employees.getEmpName();
    }

}
