package com.lhzl.drp.dao;

import com.lhzl.drp.model.Touristinfo;

public interface TouristinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int deleteByPrimaryKey(Long touristid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insert(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int insertSelective(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    Touristinfo selectByPrimaryKey(Long touristid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKeySelective(Touristinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_touristinfo
     *
     * @mbggenerated Thu Mar 24 14:57:45 CST 2016
     */
    int updateByPrimaryKey(Touristinfo record);
}