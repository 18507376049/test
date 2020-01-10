package com.logisticspro.service.inter;

import com.logisticspro.pojo.Employees; /**
 * @Auther: 刘涵
 * @Date: 2020-01-06 08:26
 * @Description:
 */
public interface UserManagerServiceInter {
    Employees getEmplInfoByLoginInfo(Employees employee);
}
