package com.ujiuye.entity;

public class Student {
    private int sid;
    private String sname;
    private int sage;
    private String sphone;

    public Student() {
    }

    public Student(int sid, String sname, int sage) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }

    public Student(int sid, String sname, int sage, String sphone) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.sphone = sphone;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }
}

