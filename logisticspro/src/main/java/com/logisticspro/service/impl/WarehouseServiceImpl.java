package com.logisticspro.service.impl;

import com.logisticspro.dao.inter.WarehouseDaoInter;
import com.logisticspro.pojo.*;
import com.logisticspro.service.inter.WarehouseServiceInter;
import com.logisticspro.util.CommandMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther:匡佩
 * @Date: 2019/11/28 0028 17:13
 * @Description:仓库管理业务逻辑实现类
 */
@Service(value = "warehouseServiceImpl")
public class WarehouseServiceImpl implements WarehouseServiceInter {
    @Autowired
    @Qualifier(value = "warehouseDaoImpl")
    //1、service依赖于数据访问的接口引用
    private WarehouseDaoInter warehouseDaoImpl;
    //2、提供setter方式进行注入
    public void setWarehouseDaoImpl(WarehouseDaoInter warehouseDaoImpl) {
        this.warehouseDaoImpl = warehouseDaoImpl;
    }

    @Resource(name = "commandMethod")
    //1、依赖于业务逻辑接口引用(最终注入的是由spring容器完成业务逻辑实现实例的注入)
    private CommandMethod commandMethod;
    //2、通过提供setter方式进行注入
    public void setCommandMethod(CommandMethod commandMethod) {
        this.commandMethod = commandMethod;
    }

    /**
     * 查询数据、分页查询
     * @param page
     * @return List<Warehouse>
     */
    @Transactional(readOnly = true)
    public List<Warehouse> searchWarehouse(Page page) {
        return warehouseDaoImpl.searchWarehouse(page);
    }

    /**
     * 查询总条数
     * @return int
     */
    @Transactional(readOnly = true)
    public int currentPageNumber() {
        return warehouseDaoImpl.currentPageNumber();
    }

    /**
     * 查询仓库负责人
     * @return List<Warehouse>
     */
    public List<Employees> searchwarehouseempName() {
        return warehouseDaoImpl.searchwarehouseempName();
    }

    /**
     * 新增数据
     * @param warehouse
     * @param maxNo
     * @return int
     */
    @Transactional(readOnly = true)
    public int insertWarehouse(Warehouse warehouse, MaxNo maxNo,Address address) {
        //获得地址的最大编号
        MaxNo maxNo1 = new MaxNo("address");
        String puMaxNo = commandMethod.getPuMaxNo(maxNo1);
        maxNo1.setManMaxNo(puMaxNo);

        //设置新增地址的主键
        address.setAddId(puMaxNo);

        //新增地址表信息
        int row1=warehouseDaoImpl. insertAddress(address);

        //修改最大编号表中的地址的最大编号和仓库的最大编号
        commandMethod.updateMax(maxNo1);
        commandMethod.updateMax(maxNo);

        //新增仓库的信息
        warehouse.setWarAddress(puMaxNo);
        return warehouseDaoImpl.insertWarehouse(warehouse);
    }

    /**
     * 删除数据
     * @param warID
     * @return int
     */
    @Transactional(readOnly = true)
    public int deleteWarehouse(String[] warID) {
        return warehouseDaoImpl.deleteWarehouse(warID);
    }

    /**
     * 编辑数据
     * @param warehouse
     * @return int
     */
    @Transactional(readOnly = true)
    public int updateWarehouse(Warehouse warehouse) {
        return warehouseDaoImpl.updateWarehouse(warehouse);
    }

    /**
     * 省
     * @return List<Province>
     */
    public List<ProArea> selectAllprovince() {
        return warehouseDaoImpl.selectAllprovince();
    }

    /**
     * 市
     * @param processId
     * @return List<City>
     */
    public List<ProArea> selectAllCity(String processId) {
        return warehouseDaoImpl.selectAllCity(processId);
    }

    /**
     * 区
     * @param cityIds
     * @return List<District>
     */
    public List<ProArea> selectAllArea(String cityIds) {
        return warehouseDaoImpl.selectAllArea(cityIds);
    }

}
