package com.logisticspro.dao.inter;

import com.logisticspro.pojo.MaxNo; /**
 * @Auther: 刘涵
 * @Date: 2020-01-13 10:49
 * @Description: 最大编号数据访问层Dao接口
 */
public interface MaxNoManagerDaoInter {

    /**
     * 查询最大编号表中的最大编号
     * @param maxNo 参数
     * @return MaxNo
     */
    MaxNo searchMaxNo(MaxNo maxNo);

    /**
     * 修改最大编号表的最大编号
     * @param maxNo 参数
     * @return int
     */
    int excuteUpdateMaxNo(MaxNo maxNo);

}
