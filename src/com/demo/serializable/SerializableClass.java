package com.demo.serializable;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;

public class SerializableClass implements Serializable {
    private String empName;
    private int empId;
    private transient double salary;
    private String dept;
    private String orgName;

    public SerializableClass(String empName, int empId, double salary, String dept, String orgName) {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
        this.dept = dept;
        this.orgName = orgName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SerializableClass that = (SerializableClass) o;
        return this.empId == that.empId && Double.compare(that.salary, this.salary) == 0 && Objects.equals(this.empName, that.empName)
                && this.dept.equals(that.dept) && Objects.equals(this.orgName, that.orgName);
    }

    @Override
    public int hashCode() {
        int number = new Random().nextInt();
        return number + Objects.hash(empName, empId, salary, dept, orgName);
    }

    @Override public String toString() {
        return "SerializableClass{" + "empName='" + empName + '\'' + ", empId=" + empId + ", salary=" + salary
                + ", dept='" + dept + '\'' + ", orgName='" + orgName + '\'' + '}';
    }

    /*protected Object readResolve() {
        return instance;
    }*/
}
