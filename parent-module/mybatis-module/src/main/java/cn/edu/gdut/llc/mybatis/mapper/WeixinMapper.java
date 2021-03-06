package cn.edu.gdut.llc.mybatis.mapper;

import cn.edu.gdut.llc.mybatis.model.Weixin;
import cn.edu.gdut.llc.mybatis.model.WeixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeixinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int countByExample(WeixinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int deleteByExample(WeixinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int deleteByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int insert(Weixin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int insertSelective(Weixin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    List<Weixin> selectByExample(WeixinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    Weixin selectByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int updateByExampleSelective(@Param("record") Weixin record, @Param("example") WeixinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int updateByExample(@Param("record") Weixin record, @Param("example") WeixinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int updateByPrimaryKeySelective(Weixin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    int updateByPrimaryKey(Weixin record);
}