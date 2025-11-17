package com.java.employ.model;

public class Employ {
    private int employ_id;
    private String name;
    private String dept;
    private Gender gender;
    private double basic;
    private String desig;

    public int getEmploy_id() {
        return employ_id;
    }

    public void setEmploy_id(int employ_id) {
        this.employ_id = employ_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Employ() {}

    public Employ(int employ_id, String name, String dept, Gender gender, double basic, String desig) {
        this.employ_id = employ_id;
        this.name = name;
        this.dept = dept;
        this.gender = gender;
        this.basic = basic;
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "employ_id=" + employ_id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", gender=" + gender +
                ", basic=" + basic +
                ", desig='" + desig + '\'' +
                '}';
    }
}
