package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;
import java.util.Date;

public class Categories implements Serializable {
    private Integer id;

    private Integer parentId;

    private Integer hotelId;

    private Integer countryId;

    private String name;

    private Integer showFeatured;

    private Integer showSubcategories;

    private Integer generateImage;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getShowFeatured() {
        return showFeatured;
    }

    public void setShowFeatured(Integer showFeatured) {
        this.showFeatured = showFeatured;
    }

    public Integer getShowSubcategories() {
        return showSubcategories;
    }

    public void setShowSubcategories(Integer showSubcategories) {
        this.showSubcategories = showSubcategories;
    }

    public Integer getGenerateImage() {
        return generateImage;
    }

    public void setGenerateImage(Integer generateImage) {
        this.generateImage = generateImage;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}