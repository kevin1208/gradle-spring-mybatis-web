package com.kevin.user.model;

import java.sql.Date;

public class UserDTO {
    private Integer userId;

    private String userName;

    private String passWord;

    private Integer age;

    private String sex;

    private Date birthday;

    private Date createdDate;

    private Date updatedDate;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", age=" + age
				+ ", sex=" + sex + ", birthday=" + birthday + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + "]";
	}
}