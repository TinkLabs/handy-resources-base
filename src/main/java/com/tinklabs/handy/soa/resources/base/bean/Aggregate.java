package com.tinklabs.handy.soa.resources.base.bean;

/**
 * @description: device 与 devcie info的组合信息
 * @author: lyon.cao
 * @date: Apr 17, 2019
 * @version: v.0.0.1
 * @copyright: hi inc
 */
public class Aggregate {

    private Integer hotel_id;

    private Integer hotel_room_number;

    private String  device_env;

    public Aggregate() {
        super();
    }

    public Aggregate(Integer hotel_id, Integer hotel_room_number, String device_env) {
        super();
        this.hotel_id = hotel_id;
        this.hotel_room_number = hotel_room_number;
        this.device_env = device_env;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getHotel_room_number() {
        return hotel_room_number;
    }

    public void setHotel_room_number(Integer hotel_room_number) {
        this.hotel_room_number = hotel_room_number;
    }

    public String getDevice_env() {
        return device_env;
    }

    public void setDevice_env(String device_env) {
        this.device_env = device_env;
    }

}
