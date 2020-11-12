package com.liyang.sems.model;

import java.util.Date;
import javax.persistence.*;

public class Student {
    /**
     * 学号
     */
    @Id
    @Column(name = "stu_id")
    private Integer stuId;

    /**
     * 名字
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 民族
     */
    private String nation;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 政治面貌
     */
    @Column(name = "political_status")
    private String politicalStatus;

    /**
     * 身份证号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 独生子女
     */
    @Column(name = "only_child")
    private String onlyChild;

    /**
     * 电话号码
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * qq号码
     */
    @Column(name = "qq_number")
    private String qqNumber;

    /**
     * 辅导员id
     */
    @Column(name = "counselor_id")
    private Integer counselorId;

    /**
     * 学籍信息id
     */
    @Column(name = "student_status_id")
    private Integer studentStatusId;

    /**
     * 户口id
     */
    @Column(name = "hukou_id")
    private Integer hukouId;

    /**
     * 密码
     */
    private String password;

    /**
     * 获取学号
     *
     * @return stu_id - 学号
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * 设置学号
     *
     * @param stuId 学号
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取政治面貌
     *
     * @return political_status - 政治面貌
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 设置政治面貌
     *
     * @param politicalStatus 政治面貌
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    /**
     * 获取身份证号
     *
     * @return id_number - 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * 获取独生子女
     *
     * @return only_child - 独生子女
     */
    public String getOnlyChild() {
        return onlyChild;
    }

    /**
     * 设置独生子女
     *
     * @param onlyChild 独生子女
     */
    public void setOnlyChild(String onlyChild) {
        this.onlyChild = onlyChild;
    }

    /**
     * 获取电话号码
     *
     * @return phone_number - 电话号码
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置电话号码
     *
     * @param phoneNumber 电话号码
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取电子邮件
     *
     * @return email - 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮件
     *
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取qq号码
     *
     * @return qq_number - qq号码
     */
    public String getQqNumber() {
        return qqNumber;
    }

    /**
     * 设置qq号码
     *
     * @param qqNumber qq号码
     */
    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    /**
     * 获取辅导员id
     *
     * @return counselor_id - 辅导员id
     */
    public Integer getCounselorId() {
        return counselorId;
    }

    /**
     * 设置辅导员id
     *
     * @param counselorId 辅导员id
     */
    public void setCounselorId(Integer counselorId) {
        this.counselorId = counselorId;
    }

    /**
     * 获取学籍信息id
     *
     * @return student_status_id - 学籍信息id
     */
    public Integer getStudentStatusId() {
        return studentStatusId;
    }

    /**
     * 设置学籍信息id
     *
     * @param studentStatusId 学籍信息id
     */
    public void setStudentStatusId(Integer studentStatusId) {
        this.studentStatusId = studentStatusId;
    }

    /**
     * 获取户口id
     *
     * @return hukou_id - 户口id
     */
    public Integer getHukouId() {
        return hukouId;
    }

    /**
     * 设置户口id
     *
     * @param hukouId 户口id
     */
    public void setHukouId(Integer hukouId) {
        this.hukouId = hukouId;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}