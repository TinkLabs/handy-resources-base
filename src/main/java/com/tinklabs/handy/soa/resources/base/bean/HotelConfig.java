package com.tinklabs.handy.soa.resources.base.bean;

public class HotelConfig extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 8203130581238686542L;

    private Integer           hotel_id;

    private Integer           template_id;

    private String            name;

    private String            country_ids;

    private String            fixed_country_ids;

    private String            a2billing_cc_card_id;

    private Integer           wifi_hotspot;

    private Integer           wifi_hotspot_throttle;

    private Integer           wifi_hotspot_time_limit;

    private String            ota_package_ids;

    private String            removed_ota_package_ids;

    private String            lockscreen_ids;

    private String            shortcut_package_ids;

    private Integer           shows_checkout_calendar;

    private Integer           shows_checkout_calendar_skip;

    private Integer           shows_handy_login;

    private Integer           handy_login_skippable;

    private Integer           shows_questionnaire;

    private Integer           shows_questionnaire_skip;

    private String            config;

    private String            customization;

    private String            created;

    private String            modified;

    private String            greeting_style;

    private Integer           auto_accept_and_next;

    private Integer           show_tnc_checkbox;

    private Integer           shows_tutorial;

    private String            activation_v2_images;

    private String            logo_url;

    private String            brand_color;

    private String            welcome_screen_banner;

    private Integer           checkout_erase_data_time_minutes;

    private Integer           show_post_activation;

    private String            screensaver_images;

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(Integer template_id) {
        this.template_id = template_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_ids() {
        return country_ids;
    }

    public void setCountry_ids(String country_ids) {
        this.country_ids = country_ids;
    }

    public String getFixed_country_ids() {
        return fixed_country_ids;
    }

    public void setFixed_country_ids(String fixed_country_ids) {
        this.fixed_country_ids = fixed_country_ids;
    }

    public String getA2billing_cc_card_id() {
        return a2billing_cc_card_id;
    }

    public void setA2billing_cc_card_id(String a2billing_cc_card_id) {
        this.a2billing_cc_card_id = a2billing_cc_card_id;
    }

    public Integer getWifi_hotspot() {
        return wifi_hotspot;
    }

    public void setWifi_hotspot(Integer wifi_hotspot) {
        this.wifi_hotspot = wifi_hotspot;
    }

    public Integer getWifi_hotspot_throttle() {
        return wifi_hotspot_throttle;
    }

    public void setWifi_hotspot_throttle(Integer wifi_hotspot_throttle) {
        this.wifi_hotspot_throttle = wifi_hotspot_throttle;
    }

    public Integer getWifi_hotspot_time_limit() {
        return wifi_hotspot_time_limit;
    }

    public void setWifi_hotspot_time_limit(Integer wifi_hotspot_time_limit) {
        this.wifi_hotspot_time_limit = wifi_hotspot_time_limit;
    }

    public String getOta_package_ids() {
        return ota_package_ids;
    }

    public void setOta_package_ids(String ota_package_ids) {
        this.ota_package_ids = ota_package_ids;
    }

    public String getRemoved_ota_package_ids() {
        return removed_ota_package_ids;
    }

    public void setRemoved_ota_package_ids(String removed_ota_package_ids) {
        this.removed_ota_package_ids = removed_ota_package_ids;
    }

    public String getLockscreen_ids() {
        return lockscreen_ids;
    }

    public void setLockscreen_ids(String lockscreen_ids) {
        this.lockscreen_ids = lockscreen_ids;
    }

    public String getShortcut_package_ids() {
        return shortcut_package_ids;
    }

    public void setShortcut_package_ids(String shortcut_package_ids) {
        this.shortcut_package_ids = shortcut_package_ids;
    }

    public Integer getShows_checkout_calendar() {
        return shows_checkout_calendar;
    }

    public void setShows_checkout_calendar(Integer shows_checkout_calendar) {
        this.shows_checkout_calendar = shows_checkout_calendar;
    }

    public Integer getShows_checkout_calendar_skip() {
        return shows_checkout_calendar_skip;
    }

    public void setShows_checkout_calendar_skip(Integer shows_checkout_calendar_skip) {
        this.shows_checkout_calendar_skip = shows_checkout_calendar_skip;
    }

    public Integer getShows_handy_login() {
        return shows_handy_login;
    }

    public void setShows_handy_login(Integer shows_handy_login) {
        this.shows_handy_login = shows_handy_login;
    }

    public Integer getHandy_login_skippable() {
        return handy_login_skippable;
    }

    public void setHandy_login_skippable(Integer handy_login_skippable) {
        this.handy_login_skippable = handy_login_skippable;
    }

    public Integer getShows_questionnaire() {
        return shows_questionnaire;
    }

    public void setShows_questionnaire(Integer shows_questionnaire) {
        this.shows_questionnaire = shows_questionnaire;
    }

    public Integer getShows_questionnaire_skip() {
        return shows_questionnaire_skip;
    }

    public void setShows_questionnaire_skip(Integer shows_questionnaire_skip) {
        this.shows_questionnaire_skip = shows_questionnaire_skip;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getCustomization() {
        return customization;
    }

    public void setCustomization(String customization) {
        this.customization = customization;
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

    public String getGreeting_style() {
        return greeting_style;
    }

    public void setGreeting_style(String greeting_style) {
        this.greeting_style = greeting_style;
    }

    public Integer getAuto_accept_and_next() {
        return auto_accept_and_next;
    }

    public void setAuto_accept_and_next(Integer auto_accept_and_next) {
        this.auto_accept_and_next = auto_accept_and_next;
    }

    public Integer getShow_tnc_checkbox() {
        return show_tnc_checkbox;
    }

    public void setShow_tnc_checkbox(Integer show_tnc_checkbox) {
        this.show_tnc_checkbox = show_tnc_checkbox;
    }

    public Integer getShows_tutorial() {
        return shows_tutorial;
    }

    public void setShows_tutorial(Integer shows_tutorial) {
        this.shows_tutorial = shows_tutorial;
    }

    public String getActivation_v2_images() {
        return activation_v2_images;
    }

    public void setActivation_v2_images(String activation_v2_images) {
        this.activation_v2_images = activation_v2_images;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getBrand_color() {
        return brand_color;
    }

    public void setBrand_color(String brand_color) {
        this.brand_color = brand_color;
    }

    public String getWelcome_screen_banner() {
        return welcome_screen_banner;
    }

    public void setWelcome_screen_banner(String welcome_screen_banner) {
        this.welcome_screen_banner = welcome_screen_banner;
    }

    public Integer getCheckout_erase_data_time_minutes() {
        return checkout_erase_data_time_minutes;
    }

    public void setCheckout_erase_data_time_minutes(Integer checkout_erase_data_time_minutes) {
        this.checkout_erase_data_time_minutes = checkout_erase_data_time_minutes;
    }

    public Integer getShow_post_activation() {
        return show_post_activation;
    }

    public void setShow_post_activation(Integer show_post_activation) {
        this.show_post_activation = show_post_activation;
    }

    public String getScreensaver_images() {
        return screensaver_images;
    }

    public void setScreensaver_images(String screensaver_images) {
        this.screensaver_images = screensaver_images;
    }

}
