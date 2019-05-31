package com.tinklabs.handy.soa.resources.base.bean;

public class Zone extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 7834833740138886049L;

    private Integer           lft;

    private Integer           parent_id;

    private Integer           rght;

    private Integer           level;

    private String            name;

    private String            host;

    private String            mqtt_host;

    private String            voip_host;

    private String            voip_password;

    private Integer           hotel_config_id;

    private String            ota_config;

    private String            locale;

    private String            input_method;

    private String            config;

    private String            timezone;

    private Integer           timezone_offset;

    private Integer           timezone_override;

    private String            order_email;

    private String            accuweather_location_key;

    private String            created;

    private String            updated;

    private String            oon_city_guide_hero_image;

    private Integer           enable_device_delivery;

    private Integer           pickup_date_required;

    private Integer           from_currency_id;

    private Integer           to_currency_id;

    private Integer           show_post_activation;

    private String            zone_type;

    private Integer           country_id;

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Integer getRght() {
        return rght;
    }

    public void setRght(Integer rght) {
        this.rght = rght;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getMqtt_host() {
        return mqtt_host;
    }

    public void setMqtt_host(String mqtt_host) {
        this.mqtt_host = mqtt_host;
    }

    public String getVoip_host() {
        return voip_host;
    }

    public void setVoip_host(String voip_host) {
        this.voip_host = voip_host;
    }

    public String getVoip_password() {
        return voip_password;
    }

    public void setVoip_password(String voip_password) {
        this.voip_password = voip_password;
    }

    public Integer getHotel_config_id() {
        return hotel_config_id;
    }

    public void setHotel_config_id(Integer hotel_config_id) {
        this.hotel_config_id = hotel_config_id;
    }

    public String getOta_config() {
        return ota_config;
    }

    public void setOta_config(String ota_config) {
        this.ota_config = ota_config;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getInput_method() {
        return input_method;
    }

    public void setInput_method(String input_method) {
        this.input_method = input_method;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public Integer getTimezone_offset() {
        return timezone_offset;
    }

    public void setTimezone_offset(Integer timezone_offset) {
        this.timezone_offset = timezone_offset;
    }

    public Integer getTimezone_override() {
        return timezone_override;
    }

    public void setTimezone_override(Integer timezone_override) {
        this.timezone_override = timezone_override;
    }

    public String getOrder_email() {
        return order_email;
    }

    public void setOrder_email(String order_email) {
        this.order_email = order_email;
    }

    public String getAccuweather_location_key() {
        return accuweather_location_key;
    }

    public void setAccuweather_location_key(String accuweather_location_key) {
        this.accuweather_location_key = accuweather_location_key;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getOon_city_guide_hero_image() {
        return oon_city_guide_hero_image;
    }

    public void setOon_city_guide_hero_image(String oon_city_guide_hero_image) {
        this.oon_city_guide_hero_image = oon_city_guide_hero_image;
    }

    public Integer getEnable_device_delivery() {
        return enable_device_delivery;
    }

    public void setEnable_device_delivery(Integer enable_device_delivery) {
        this.enable_device_delivery = enable_device_delivery;
    }

    public Integer getPickup_date_required() {
        return pickup_date_required;
    }

    public void setPickup_date_required(Integer pickup_date_required) {
        this.pickup_date_required = pickup_date_required;
    }

    public Integer getFrom_currency_id() {
        return from_currency_id;
    }

    public void setFrom_currency_id(Integer from_currency_id) {
        this.from_currency_id = from_currency_id;
    }

    public Integer getTo_currency_id() {
        return to_currency_id;
    }

    public void setTo_currency_id(Integer to_currency_id) {
        this.to_currency_id = to_currency_id;
    }

    public Integer getShow_post_activation() {
        return show_post_activation;
    }

    public void setShow_post_activation(Integer show_post_activation) {
        this.show_post_activation = show_post_activation;
    }

    public String getZone_type() {
        return zone_type;
    }

    public void setZone_type(String zone_type) {
        this.zone_type = zone_type;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
