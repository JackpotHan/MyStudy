package com.jackpotHan.Demo;

import java.util.Date;

/**
 * @Author: hanjt
 * @Date: 2018/10/9 10:53
 * @Description:
 */
public class Student {
    private String studentNo;
    private String name;
    private String grade;
    private Integer age;
    /**0-男   1-女**/
    private Integer sex;
    private Double sorce;
    private Date gmtCreate;

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Double getSorce() {
        return sorce;
    }

    public void setSorce(Double sorce) {
        this.sorce = sorce;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo='" + studentNo + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", sorce=" + sorce +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
