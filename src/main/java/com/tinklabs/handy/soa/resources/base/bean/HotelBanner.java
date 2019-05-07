package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

public class HotelBanner implements Serializable {

    public HotelBanner() {
    }

    public HotelBanner(Device device, HotelConfig hotelConfig, Template template) {
        this.device = device;
        this.hotelConfig = hotelConfig;
        this.template = template;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
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

    private Device device;
    private HotelConfig hotelConfig;
    private Template template;
}
