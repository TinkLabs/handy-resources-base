package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

public class Weather implements Serializable {

    private Zone zone;
    private Zone zoneParent;

    public Weather() {
    }
    public Weather(Zone zone, Zone zoneParent) {
        this.zone = zone;
        this.zoneParent = zoneParent;
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
}
