package com.lhzl.drp.dao;

import com.lhzl.drp.model.Lineinfo;

public interface LineinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int deleteByPrimaryKey(Long lineid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insert(Lineinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insertSelective(Lineinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    Lineinfo selectByPrimaryKey(Long lineid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeySelective(Lineinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Lineinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_lineinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKey(Lineinfo record);
}