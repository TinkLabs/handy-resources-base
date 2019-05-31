package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

public class Weather implements Serializable {

    private Zone zone;
    private Zone zoneParent;
    private DeviceUser deviceUser;

    public Weather() {
    }

    public Weather(Zone zone, Zone zoneParent, DeviceUser deviceUser) {
        this.zone = zone;
        this.zoneParent = zoneParent;
        this.deviceUser = deviceUser;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Zone getZoneParent() {
        return zoneParent;
    }

    public void setZoneParent(Zone zoneParent) {
        this.zoneParent = zoneParent;
    }

    public DeviceUser getDeviceUser() {
        return deviceUser;
    }

    public void setDeviceUser(DeviceUser deviceUser) {
        this.deviceUser = deviceUser;
    }
}
