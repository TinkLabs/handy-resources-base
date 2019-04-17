package com.tinklabs.handy.soa.resources.base.bean;

/**
 * @description: ota package 表的映射
 * @author: lyon.cao
 * @date: 2019年4月16日
 * @version: v.0.0.1
 * @copyright: hi inc
 */
public class OtaPackage {

    private Integer id;

    private String  name;

    private String  package_name;

    private Integer hotel_selectable;

    private String  created;

    private String  modified;

    private Boolean show_in_app_store;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public Integer getHotel_selectable() {
        return hotel_selectable;
    }

    public void setHotel_selectable(Integer hotel_selectable) {
        this.hotel_selectable = hotel_selectable;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Boolean getShow_in_app_store() {
        return show_in_app_store;
    }

    public void setShow_in_app_store(Boolean show_in_app_store) {
        this.show_in_app_store = show_in_app_store;
    }

}
