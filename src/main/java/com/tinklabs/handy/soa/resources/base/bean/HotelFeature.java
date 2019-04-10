package com.tinklabs.handy.soa.resources.base.bean;

public class HotelFeature extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 2007244525166960846L;

    private Integer           hotel_id;

    private String            feature_key;

    private Boolean           enabled;

    private String            created;

    private String            modified;

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getFeature_key() {
        return feature_key;
    }

    public void setFeature_key(String feature_key) {
        this.feature_key = feature_key;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

}
