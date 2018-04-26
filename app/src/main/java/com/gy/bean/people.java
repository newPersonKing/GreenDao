package com.gy.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by emcc-pc on 2018/4/26.
 */
@Entity
public class people {

    @org.greenrobot.greendao.annotation.Id
    private String Id;
    private String Name;
    private String Sex;
    @Generated(hash = 1469816792)
    public people(String Id, String Name, String Sex) {
        this.Id = Id;
        this.Name = Name;
        this.Sex = Sex;
    }
    @Generated(hash = 1277389469)
    public people() {
    }
    public String getId() {
        return this.Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getSex() {
        return this.Sex;
    }
    public void setSex(String Sex) {
        this.Sex = Sex;
    }
}
