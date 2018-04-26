package com.gy.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by emcc-pc on 2018/4/26.
 */
@Entity
public class Product {
    @org.greenrobot.greendao.annotation.Id
    private String Id;
    private String Name;
    @Generated(hash = 536689391)
    public Product(String Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }
    @Generated(hash = 1890278724)
    public Product() {
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
}
