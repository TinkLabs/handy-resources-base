package com.tinklabs.handy.soa.resources.base.bean;

import java.util.Date;

/**
 * @description
 * @author Landin
 * @date 2019-05-08
 */
public class DeviceModel extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 0L;

    private String code;

    private String name;

    private String brand;

    private String mapping;

    private Date created;

    private Date modified;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
