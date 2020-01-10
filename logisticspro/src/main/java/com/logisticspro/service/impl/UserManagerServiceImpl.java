package com.logisticspro.service.impl;

import com.logisticspro.dao.inter.UserManagerDaoInter;
import com.logisticspro.pojo.Authority;
import com.logisticspro.pojo.Employees;
import com.logisticspro.service.inter.UserManagerServiceInter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-06 08:26
 * @Description:
 */
@Service("userManagerServiceImpl")
public class UserManagerServiceImpl implements UserManagerServiceInter {

    @Resource(name = "userManagerDaoImpl")
    private UserManagerDaoInter userMangerDaoInter;

    public void setUserMangerDaoInter(UserManagerDaoInter userMangerDaoInter) {
        this.userMangerDaoInter = userMangerDaoInter;
    }

    @Override
    public Employees getEmplInfoByLoginInfo(Employees employee) {
        return null;
    }

    public List<Authority> searchFristMenu(Employees employees) {
        return null;
    }

    public List<Authority> searchSeconedMenu(Authority authority) {
        return null;
    }
}
