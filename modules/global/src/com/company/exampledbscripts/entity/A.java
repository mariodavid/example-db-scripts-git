package com.company.exampledbscripts.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "EXAMPLEDBSCRIPTS_A")
@Entity(name = "exampledbscripts$A")
public class A extends StandardEntity {
    private static final long serialVersionUID = 7626553409394199025L;

    @Column(name = "D")
    protected String d;

    @Column(name = "B")
    protected String b;


    public void setD(String d) {
        this.d = d;
    }

    public String getD() {
        return d;
    }


    public void setB(String b) {
        this.b = b;
    }

    public String getB() {
        return b;
    }


}