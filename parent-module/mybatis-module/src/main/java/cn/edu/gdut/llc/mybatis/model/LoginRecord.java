package cn.edu.gdut.llc.mybatis.model;

import java.util.Date;

public class LoginRecord {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_record.id
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_record.username
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_record.login_time
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    private Date loginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login_record.ip_add
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    private String ipAdd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_record.id
     *
     * @return the value of login_record.id
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_record.id
     *
     * @param id the value for login_record.id
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_record.username
     *
     * @return the value of login_record.username
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_record.username
     *
     * @param username the value for login_record.username
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_record.login_time
     *
     * @return the value of login_record.login_time
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_record.login_time
     *
     * @param loginTime the value for login_record.login_time
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login_record.ip_add
     *
     * @return the value of login_record.ip_add
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public String getIpAdd() {
        return ipAdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login_record.ip_add
     *
     * @param ipAdd the value for login_record.ip_add
     *
     * @mbggenerated Wed Jul 27 09:29:22 CST 2016
     */
    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd == null ? null : ipAdd.trim();
    }
}