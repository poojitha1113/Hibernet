package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Leaveofemployee")
public class Leave {
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
}
