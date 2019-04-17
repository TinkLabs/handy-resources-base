package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;

/**
 * @description: domain info 集合数据
 * @author: dave.yan
 * @date: 2019年4月17日
 * @version: v.0.0.1
 * @copyright: hi inc
 */
public class DomainInfo implements Serializable {

    private Device device;
    private Zone zone;
    private Zone parentZone;

    public DomainInfo() {
    }

    public DomainInfo(Device device, Zone zone, Zone parentZone) {
        this.device = device;
        this.zone = zone;
        this.parentZone = parentZone;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Zone getParentZone() {
        return parentZone;
    }

    public void setParentZone(Zone parentZone) {
        this.parentZone = parentZone;
    }

}
