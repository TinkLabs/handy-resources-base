package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

public class HotelBanner implements Serializable {
    private HotelConfig hotelConfig;
    private Template template;

    public HotelBanner() {
    }

    public HotelBanner(HotelConfig hotelConfig, Template template) {
        this.hotelConfig = hotelConfig;
        this.template = template;
    }

    public HotelConfig getHotelConfig() {
        return hotelConfig;
    }

    public void setHotelConfig(HotelConfig hotelConfig) {
        this.hotelConfig = hotelConfig;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }
}
