package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

public class WelcomeDialog implements Serializable {

    private Device device;
    private DeviceUser deviceUser;
    private Hotel hotel;

    public WelcomeDialog() {
    }

    public WelcomeDialog(Device device, DeviceUser deviceUser, Hotel hotel) {
        this.device = device;
        this.deviceUser = deviceUser;
        this.hotel = hotel;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

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

}
