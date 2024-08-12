package com.test;

import javax.persistence.*;

@Entity
@Table(name="Emp")
public class Employee {
    @Id
    private int eid;
    @Column
    private String ename;
    @Column
    private String leavesavalible;
    @Column
    private int no_of_leaves;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getLeavesavalible() {
        return leavesavalible;
    }

    public void setLeavesavalible(String leavesavalible) {
        this.leavesavalible = leavesavalible;
    }

    public int getNo_of_leaves() {

        return no_of_leaves;
    }

    public void setNo_of_leaves(int no_of_leaves) {

        this.no_of_leaves = no_of_leaves;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", leavesavalible='" + leavesavalible + '\'' +
                ", no_of_leaves='" + no_of_leaves + '\'' +
                '}';
    }
}
