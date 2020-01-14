package com.logisticspro.service.inter;

import com.logisticspro.pojo.*;

import java.util.List;
/**
 * @Auther:匡佩
 * @Date: 2019/11/28 0028 17:13
 * @Description:仓库管理业务逻辑接口
 */
public interface WarehouseServiceInter {
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
     * @param maxNo
     * @param address
     * @return int
     */
    int insertWarehouse(Warehouse warehouse, MaxNo maxNo, Address address);

    /**
     * 删除数据
     * @param warID
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
     * @return List<ProArea>
     */
    List<ProArea> selectAllprovince();

    /**
     * 市
     * @param processId
     * @return List<ProArea>
     */
    List<ProArea> selectAllCity(String processId);

    /**
     * 区
     * @param cityIds
     * @return List<ProArea>
     */
    List<ProArea> selectAllArea(String cityIds);


}
