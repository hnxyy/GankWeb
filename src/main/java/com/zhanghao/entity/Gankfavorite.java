package com.zhanghao.entity;

public class Gankfavorite {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gankfavorite.userId
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gankfavorite.resUrl
     *
     * @mbggenerated
     */
    private String resurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gankfavorite.userId
     *
     * @return the value of gankfavorite.userId
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gankfavorite.userId
     *
     * @param userid the value for gankfavorite.userId
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gankfavorite.resUrl
     *
     * @return the value of gankfavorite.resUrl
     *
     * @mbggenerated
     */
    public String getResurl() {
        return resurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gankfavorite.resUrl
     *
     * @param resurl the value for gankfavorite.resUrl
     *
     * @mbggenerated
     */
    public void setResurl(String resurl) {
        this.resurl = resurl == null ? null : resurl.trim();
    }
}