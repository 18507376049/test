package com.logisticspro.dao.inter;


import com.logisticspro.pojo.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:匡佩
 * @Date: 2019/11/28 0028 17:06
 * @Description:仓库管理数据访问层接口
 */
public interface WarehouseDaoInter {
    @Resource(name = "sql")
    /**
     * 分页查询
     * @param page
     * @return List<Warehouse>
     */
    List<Warehouse> searchWarehouse(Page page);
    /**
     * 查询总条数
     * @return int
     */
    int currentPageNumber();

    /**
     * 查询仓库负责人
     * @return List<Warehouse>
     */
    List<Employees> searchwarehouseempName();
    /**
     * 新增数据
     * @param warehouse
     * @return int
     */
    int insertWarehouse(Warehouse warehouse);

    /**
     * 删除数据
     * @param warID String[]
     * @return int
     */
    int deleteWarehouse(String[] warID);

    /**
     * 编辑数据
     * @param warehouse
     * @return int
     */
    int updateWarehouse(Warehouse warehouse);
    /**
     * 省
     * @return List<Province>
     */
    List<ProArea> selectAllprovince();

    /**
     * 市
     * @param processId
     * @return List<City>
     */
    List<ProArea> selectAllCity(String processId);

    /**
     * 区
     * @param cityIds
     * @return List<District>
     */
    List<ProArea> selectAllArea(String cityIds);


    /**
     * 插入地址信息
     * @param address
     * @return int
     */
    int insertAddress(Address address);
}
