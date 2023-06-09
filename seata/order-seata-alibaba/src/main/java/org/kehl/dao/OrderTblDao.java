package org.kehl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.kehl.entity.OrderTbl;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface OrderTblDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderTbl queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<OrderTbl> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<OrderTbl> queryAll();

    /**
     * 新增数据
     *
     * @param orderTbl 实例对象
     * @return 影响行数
     */
    int insert(OrderTbl orderTbl);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderTbl> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OrderTbl> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OrderTbl> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<OrderTbl> entities);

    /**
     * 修改数据
     *
     * @param orderTbl 实例对象
     * @return 影响行数
     */
    int update(OrderTbl orderTbl);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<OrderTbl> selectAllOrderByUserId(@Param("userId") String userId);
}

