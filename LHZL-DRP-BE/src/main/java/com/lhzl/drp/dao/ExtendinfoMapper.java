package com.lhzl.drp.dao;

import com.lhzl.drp.model.Extendinfo;
import com.lhzl.drp.model.ExtendinfoWithBLOBs;

public interface ExtendinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int deleteByPrimaryKey(Long extendid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insert(ExtendinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insertSelective(ExtendinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    ExtendinfoWithBLOBs selectByPrimaryKey(Long extendid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeySelective(ExtendinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(ExtendinfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_extendinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKey(Extendinfo record);
}