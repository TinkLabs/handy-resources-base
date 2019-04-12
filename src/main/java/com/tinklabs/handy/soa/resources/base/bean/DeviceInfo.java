package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

/**
 * @description: device info 集合数据
 * @author: lyon.cao
 * @date: 2019年4月12日
 * @version: v.0.0.1
 * @copyright: hi inc
 */
public class DeviceInfo implements Serializable {

    /**
     * @description: TODO
     * @author: lyon.cao
     * @date: 2019年4月12日
     * @return: long
     */
    private static final long serialVersionUID = -920994018452638571L;

    private Device            device;

    private DeviceUser        deviceUser;

    private Hotel             hotel;

    private HotelConfig       hotelConfig;

    private Zone              zone;

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public DeviceUser getDeviceUser() {
        return deviceUser;
    }

    public void setDeviceUser(DeviceUser deviceUser) {
        this.deviceUser = deviceUser;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public HotelConfig getHotelConfig() {
        return hotelConfig;
    }

    public void setHotelConfig(HotelConfig hotelConfig) {
        this.hotelConfig = hotelConfig;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

}
