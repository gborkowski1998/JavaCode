package com.example.demo;

// POJO
public class UserEntity {
    private String name;
    private Integer age;
    private Integer userid;
    public UserEntity(String name, Integer age, Integer userid) {
        this.name = name;
        this.age = age;
        this.userid = userid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getUserid() {
        return userid;
    }
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userid +
                ", name='" + name + '\'' +
                '}';
    }
}