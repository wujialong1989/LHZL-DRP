package com.lhzl.drp.dao;

import com.lhzl.drp.model.Rolepmsninfo;

public interface RolepmsninfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int deleteByPrimaryKey(Long oprlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insert(Rolepmsninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insertSelective(Rolepmsninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    Rolepmsninfo selectByPrimaryKey(Long oprlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeySelective(Rolepmsninfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_rolepmsninfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKey(Rolepmsninfo record);
}