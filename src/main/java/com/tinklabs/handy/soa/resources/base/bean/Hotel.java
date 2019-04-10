package com.tinklabs.handy.soa.resources.base.bean;

import java.util.List;

public class Hotel extends BaseVO {

    /**
     * @fields
     */
    private static final long  serialVersionUID = 3301296904434353824L;

    private Integer            zone_id;

    private Integer            country_id;

    private Integer            region_id;

    private Integer            hotel_config_id;

    private String             name;

    private String             legal_name;

    private String             prefix_name;

    private String             mode;

    private Integer            integration;

    private String             express_checkout_email;

    private Integer            skip_choose_language;

    private String             default_locale;

    private String             pms_room_number_format;

    private Integer            pms_hide_guest_name;

    private Integer            rooms;

    private Integer            star;

    private Integer            hotel_home;

    private Integer            paid;

    private String             launch_date;

    private Integer            mock;

    private String             lat;

    private String             lng;

    private String             address1;

    private String             address2;

    private String             local_address1;

    private String             local_address2;

    private String             telephone;

    private Integer            voip;

    private Integer            pstn;

    private String             pstn_front_desk_number;

    private String             pstn_idd_prefix;

    private Integer            send_pstn_idd_prefix_method;

    private String             did;

    private Integer            did_pause;

    private String             ve_did;

    private String             hotel_did;

    private String             call_prefix;

    private Integer            call_block;

    private String             call_prefix_whitelist;

    private String             wifi_ssid;

    private String             wifi_security;

    private String             wifi_password;

    private Integer            show_phone_number;

    private Integer            show_room_call;

    private String             phone_mapping;

    private String             pbx_mapping;

    private String             non_active_callable_numbers;

    private String             rating_email;

    private Integer            rating_threshold;

    private String             tripadvisor_id;

    private String             ctrip_id;

    private String             alert;

    private String             facebook_id;

    private String             twitter_id;

    private String             salesforce_id;

    private String             activetype;

    private String             terms;

    private String             status;

    private String             pickup_day;

    private Integer            pickup_day_bak;

    private Integer            message_limit;

    private Integer            message_topup_limit;

    private Integer            message_limit_level;

    private String             message_limit_email;

    private String             share_voucher_to_hotel_email;

    private Integer            does_auto_clear_data;

    private Integer            disable_day_dream;

    private String             daydream_turn_on_time;

    private String             daydream_turn_off_time;

    private Integer            auto_clear_max_idle_time;

    private Integer            show_tripadvisor;

    private String             tripadvisor_widget_color;

    private String             order_form_email_list;

    private String             account_manager_email_list;

    private String             created;

    private String             modified;

    private String             phone_receiver_email;

    private String             phone_receiver_name;

    private String             super_user_name;

    private String             super_user_email;

    private Integer            currency_id;

    private String             original_tripadvisor_ranking;

    private String             original_tripadvisor_rating;

    private String             disable_on_findhandy;

    private String             findhandy_image_url;

    private String             featured_image_url;

    private String             is_featured;

    private String             booking_url;

    private Integer            star_rating;

    private String             contract_start_date;

    private String             contract_end_date;

    private String             tripadvisor_hotel_type;

    private String             dock_function_key;

    private String             dock_api;

    private String             website_url;

    private String             city;

    private String             country;

    private String             region;

    private String             clear_data_time;

    private String             clear_data_notification_second;

    private String             onboarding_status;

    private String             concierge_image_url;

    private Integer            cellular_throttle_uplink;

    private Integer            cellular_throttle_downlink;

    private String             enabled_maps;

    private String             handy_phone_voip_method;

    private String             handy_phone_voip_port;

    private String             stayplease_imei_url;

    private Integer            daily_ota_limit;

    private String             block_ota_start_date;

    private String             block_ota_end_date;

    private String             daydreams;

    private String             last_device_spare_warning_time;

    private Boolean            cellular_auto_connect;

    private List<HotelFeature> hotel_features;

    public Integer getZone_id() {
        return zone_id;
    }

    public void setZone_id(Integer zone_id) {
        this.zone_id = zone_id;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public Integer getHotel_config_id() {
        return hotel_config_id;
    }

    public void setHotel_config_id(Integer hotel_config_id) {
        this.hotel_config_id = hotel_config_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getPrefix_name() {
        return prefix_name;
    }

    public void setPrefix_name(String prefix_name) {
        this.prefix_name = prefix_name;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public String getExpress_checkout_email() {
        return express_checkout_email;
    }

    public void setExpress_checkout_email(String express_checkout_email) {
        this.express_checkout_email = express_checkout_email;
    }

    public Integer getSkip_choose_language() {
        return skip_choose_language;
    }

    public void setSkip_choose_language(Integer skip_choose_language) {
        this.skip_choose_language = skip_choose_language;
    }

    public String getDefault_locale() {
        return default_locale;
    }

    public void setDefault_locale(String default_locale) {
        this.default_locale = default_locale;
    }

    public String getPms_room_number_format() {
        return pms_room_number_format;
    }

    public void setPms_room_number_format(String pms_room_number_format) {
        this.pms_room_number_format = pms_room_number_format;
    }

    public Integer getPms_hide_guest_name() {
        return pms_hide_guest_name;
    }

    public void setPms_hide_guest_name(Integer pms_hide_guest_name) {
        this.pms_hide_guest_name = pms_hide_guest_name;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getHotel_home() {
        return hotel_home;
    }

    public void setHotel_home(Integer hotel_home) {
        this.hotel_home = hotel_home;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public Integer getMock() {
        return mock;
    }

    public void setMock(Integer mock) {
        this.mock = mock;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getLocal_address1() {
        return local_address1;
    }

    public void setLocal_address1(String local_address1) {
        this.local_address1 = local_address1;
    }

    public String getLocal_address2() {
        return local_address2;
    }

    public void setLocal_address2(String local_address2) {
        this.local_address2 = local_address2;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getVoip() {
        return voip;
    }

    public void setVoip(Integer voip) {
        this.voip = voip;
    }

    public Integer getPstn() {
        return pstn;
    }

    public void setPstn(Integer pstn) {
        this.pstn = pstn;
    }

    public String getPstn_front_desk_number() {
        return pstn_front_desk_number;
    }

    public void setPstn_front_desk_number(String pstn_front_desk_number) {
        this.pstn_front_desk_number = pstn_front_desk_number;
    }

    public String getPstn_idd_prefix() {
        return pstn_idd_prefix;
    }

    public void setPstn_idd_prefix(String pstn_idd_prefix) {
        this.pstn_idd_prefix = pstn_idd_prefix;
    }

    public Integer getSend_pstn_idd_prefix_method() {
        return send_pstn_idd_prefix_method;
    }

    public void setSend_pstn_idd_prefix_method(Integer send_pstn_idd_prefix_method) {
        this.send_pstn_idd_prefix_method = send_pstn_idd_prefix_method;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public Integer getDid_pause() {
        return did_pause;
    }

    public void setDid_pause(Integer did_pause) {
        this.did_pause = did_pause;
    }

    public String getVe_did() {
        return ve_did;
    }

    public void setVe_did(String ve_did) {
        this.ve_did = ve_did;
    }

    public String getHotel_did() {
        return hotel_did;
    }

    public void setHotel_did(String hotel_did) {
        this.hotel_did = hotel_did;
    }

    public String getCall_prefix() {
        return call_prefix;
    }

    public void setCall_prefix(String call_prefix) {
        this.call_prefix = call_prefix;
    }

    public Integer getCall_block() {
        return call_block;
    }

    public void setCall_block(Integer call_block) {
        this.call_block = call_block;
    }

    public String getCall_prefix_whitelist() {
        return call_prefix_whitelist;
    }

    public void setCall_prefix_whitelist(String call_prefix_whitelist) {
        this.call_prefix_whitelist = call_prefix_whitelist;
    }

    public String getWifi_ssid() {
        return wifi_ssid;
    }

    public void setWifi_ssid(String wifi_ssid) {
        this.wifi_ssid = wifi_ssid;
    }

    public String getWifi_security() {
        return wifi_security;
    }

    public void setWifi_security(String wifi_security) {
        this.wifi_security = wifi_security;
    }

    public String getWifi_password() {
        return wifi_password;
    }

    public void setWifi_password(String wifi_password) {
        this.wifi_password = wifi_password;
    }

    public Integer getShow_phone_number() {
        return show_phone_number;
    }

    public void setShow_phone_number(Integer show_phone_number) {
        this.show_phone_number = show_phone_number;
    }

    public Integer getShow_room_call() {
        return show_room_call;
    }

    public void setShow_room_call(Integer show_room_call) {
        this.show_room_call = show_room_call;
    }

    public String getPhone_mapping() {
        return phone_mapping;
    }

    public void setPhone_mapping(String phone_mapping) {
        this.phone_mapping = phone_mapping;
    }

    public String getPbx_mapping() {
        return pbx_mapping;
    }

    public void setPbx_mapping(String pbx_mapping) {
        this.pbx_mapping = pbx_mapping;
    }

    public String getNon_active_callable_numbers() {
        return non_active_callable_numbers;
    }

    public void setNon_active_callable_numbers(String non_active_callable_numbers) {
        this.non_active_callable_numbers = non_active_callable_numbers;
    }

    public String getRating_email() {
        return rating_email;
    }

    public void setRating_email(String rating_email) {
        this.rating_email = rating_email;
    }

    public Integer getRating_threshold() {
        return rating_threshold;
    }

    public void setRating_threshold(Integer rating_threshold) {
        this.rating_threshold = rating_threshold;
    }

    public String getTripadvisor_id() {
        return tripadvisor_id;
    }

    public void setTripadvisor_id(String tripadvisor_id) {
        this.tripadvisor_id = tripadvisor_id;
    }

    public String getCtrip_id() {
        return ctrip_id;
    }

    public void setCtrip_id(String ctrip_id) {
        this.ctrip_id = ctrip_id;
    }

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public String getFacebook_id() {
        return facebook_id;
    }

    public void setFacebook_id(String facebook_id) {
        this.facebook_id = facebook_id;
    }

    public String getTwitter_id() {
        return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
        this.twitter_id = twitter_id;
    }

    public String getSalesforce_id() {
        return salesforce_id;
    }

    public void setSalesforce_id(String salesforce_id) {
        this.salesforce_id = salesforce_id;
    }

    public String getActivetype() {
        return activetype;
    }

    public void setActivetype(String activetype) {
        this.activetype = activetype;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPickup_day() {
        return pickup_day;
    }

    public void setPickup_day(String pickup_day) {
        this.pickup_day = pickup_day;
    }

    public Integer getPickup_day_bak() {
        return pickup_day_bak;
    }

    public void setPickup_day_bak(Integer pickup_day_bak) {
        this.pickup_day_bak = pickup_day_bak;
    }

    public Integer getMessage_limit() {
        return message_limit;
    }

    public void setMessage_limit(Integer message_limit) {
        this.message_limit = message_limit;
    }

    public Integer getMessage_topup_limit() {
        return message_topup_limit;
    }

    public void setMessage_topup_limit(Integer message_topup_limit) {
        this.message_topup_limit = message_topup_limit;
    }

    public Integer getMessage_limit_level() {
        return message_limit_level;
    }

    public void setMessage_limit_level(Integer message_limit_level) {
        this.message_limit_level = message_limit_level;
    }

    public String getMessage_limit_email() {
        return message_limit_email;
    }

    public void setMessage_limit_email(String message_limit_email) {
        this.message_limit_email = message_limit_email;
    }

    public String getShare_voucher_to_hotel_email() {
        return share_voucher_to_hotel_email;
    }

    public void setShare_voucher_to_hotel_email(String share_voucher_to_hotel_email) {
        this.share_voucher_to_hotel_email = share_voucher_to_hotel_email;
    }

    public Integer getDoes_auto_clear_data() {
        return does_auto_clear_data;
    }

    public void setDoes_auto_clear_data(Integer does_auto_clear_data) {
        this.does_auto_clear_data = does_auto_clear_data;
    }

    public Integer getDisable_day_dream() {
        return disable_day_dream;
    }

    public void setDisable_day_dream(Integer disable_day_dream) {
        this.disable_day_dream = disable_day_dream;
    }

    public String getDaydream_turn_on_time() {
        return daydream_turn_on_time;
    }

    public void setDaydream_turn_on_time(String daydream_turn_on_time) {
        this.daydream_turn_on_time = daydream_turn_on_time;
    }

    public String getDaydream_turn_off_time() {
        return daydream_turn_off_time;
    }

    public void setDaydream_turn_off_time(String daydream_turn_off_time) {
        this.daydream_turn_off_time = daydream_turn_off_time;
    }

    public Integer getAuto_clear_max_idle_time() {
        return auto_clear_max_idle_time;
    }

    public void setAuto_clear_max_idle_time(Integer auto_clear_max_idle_time) {
        this.auto_clear_max_idle_time = auto_clear_max_idle_time;
    }

    public Integer getShow_tripadvisor() {
        return show_tripadvisor;
    }

    public void setShow_tripadvisor(Integer show_tripadvisor) {
        this.show_tripadvisor = show_tripadvisor;
    }

    public String getTripadvisor_widget_color() {
        return tripadvisor_widget_color;
    }

    public void setTripadvisor_widget_color(String tripadvisor_widget_color) {
        this.tripadvisor_widget_color = tripadvisor_widget_color;
    }

    public String getOrder_form_email_list() {
        return order_form_email_list;
    }

    public void setOrder_form_email_list(String order_form_email_list) {
        this.order_form_email_list = order_form_email_list;
    }

    public String getAccount_manager_email_list() {
        return account_manager_email_list;
    }

    public void setAccount_manager_email_list(String account_manager_email_list) {
        this.account_manager_email_list = account_manager_email_list;
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

    public String getPhone_receiver_email() {
        return phone_receiver_email;
    }

    public void setPhone_receiver_email(String phone_receiver_email) {
        this.phone_receiver_email = phone_receiver_email;
    }

    public String getPhone_receiver_name() {
        return phone_receiver_name;
    }

    public void setPhone_receiver_name(String phone_receiver_name) {
        this.phone_receiver_name = phone_receiver_name;
    }

    public String getSuper_user_name() {
        return super_user_name;
    }

    public void setSuper_user_name(String super_user_name) {
        this.super_user_name = super_user_name;
    }

    public String getSuper_user_email() {
        return super_user_email;
    }

    public void setSuper_user_email(String super_user_email) {
        this.super_user_email = super_user_email;
    }

    public Integer getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(Integer currency_id) {
        this.currency_id = currency_id;
    }

    public String getOriginal_tripadvisor_ranking() {
        return original_tripadvisor_ranking;
    }

    public void setOriginal_tripadvisor_ranking(String original_tripadvisor_ranking) {
        this.original_tripadvisor_ranking = original_tripadvisor_ranking;
    }

    public String getOriginal_tripadvisor_rating() {
        return original_tripadvisor_rating;
    }

    public void setOriginal_tripadvisor_rating(String original_tripadvisor_rating) {
        this.original_tripadvisor_rating = original_tripadvisor_rating;
    }

    public String getDisable_on_findhandy() {
        return disable_on_findhandy;
    }

    public void setDisable_on_findhandy(String disable_on_findhandy) {
        this.disable_on_findhandy = disable_on_findhandy;
    }

    public String getFindhandy_image_url() {
        return findhandy_image_url;
    }

    public void setFindhandy_image_url(String findhandy_image_url) {
        this.findhandy_image_url = findhandy_image_url;
    }

    public String getFeatured_image_url() {
        return featured_image_url;
    }

    public void setFeatured_image_url(String featured_image_url) {
        this.featured_image_url = featured_image_url;
    }

    public String getIs_featured() {
        return is_featured;
    }

    public void setIs_featured(String is_featured) {
        this.is_featured = is_featured;
    }

    public String getBooking_url() {
        return booking_url;
    }

    public void setBooking_url(String booking_url) {
        this.booking_url = booking_url;
    }

    public Integer getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(Integer star_rating) {
        this.star_rating = star_rating;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(String contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(String contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public String getTripadvisor_hotel_type() {
        return tripadvisor_hotel_type;
    }

    public void setTripadvisor_hotel_type(String tripadvisor_hotel_type) {
        this.tripadvisor_hotel_type = tripadvisor_hotel_type;
    }

    public String getDock_function_key() {
        return dock_function_key;
    }

    public void setDock_function_key(String dock_function_key) {
        this.dock_function_key = dock_function_key;
    }

    public String getDock_api() {
        return dock_api;
    }

    public void setDock_api(String dock_api) {
        this.dock_api = dock_api;
    }

    public String getWebsite_url() {
        return website_url;
    }

    public void setWebsite_url(String website_url) {
        this.website_url = website_url;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getClear_data_time() {
        return clear_data_time;
    }

    public void setClear_data_time(String clear_data_time) {
        this.clear_data_time = clear_data_time;
    }

    public String getClear_data_notification_second() {
        return clear_data_notification_second;
    }

    public void setClear_data_notification_second(String clear_data_notification_second) {
        this.clear_data_notification_second = clear_data_notification_second;
    }

    public String getOnboarding_status() {
        return onboarding_status;
    }

    public void setOnboarding_status(String onboarding_status) {
        this.onboarding_status = onboarding_status;
    }

    public String getConcierge_image_url() {
        return concierge_image_url;
    }

    public void setConcierge_image_url(String concierge_image_url) {
        this.concierge_image_url = concierge_image_url;
    }

    public Integer getCellular_throttle_uplink() {
        return cellular_throttle_uplink;
    }

    public void setCellular_throttle_uplink(Integer cellular_throttle_uplink) {
        this.cellular_throttle_uplink = cellular_throttle_uplink;
    }

    public Integer getCellular_throttle_downlink() {
        return cellular_throttle_downlink;
    }

    public void setCellular_throttle_downlink(Integer cellular_throttle_downlink) {
        this.cellular_throttle_downlink = cellular_throttle_downlink;
    }

    public String getEnabled_maps() {
        return enabled_maps;
    }

    public void setEnabled_maps(String enabled_maps) {
        this.enabled_maps = enabled_maps;
    }

    public String getHandy_phone_voip_method() {
        return handy_phone_voip_method;
    }

    public void setHandy_phone_voip_method(String handy_phone_voip_method) {
        this.handy_phone_voip_method = handy_phone_voip_method;
    }

    public String getHandy_phone_voip_port() {
        return handy_phone_voip_port;
    }

    public void setHandy_phone_voip_port(String handy_phone_voip_port) {
        this.handy_phone_voip_port = handy_phone_voip_port;
    }

    public String getStayplease_imei_url() {
        return stayplease_imei_url;
    }

    public void setStayplease_imei_url(String stayplease_imei_url) {
        this.stayplease_imei_url = stayplease_imei_url;
    }

    public Integer getDaily_ota_limit() {
        return daily_ota_limit;
    }

    public void setDaily_ota_limit(Integer daily_ota_limit) {
        this.daily_ota_limit = daily_ota_limit;
    }

    public String getBlock_ota_start_date() {
        return block_ota_start_date;
    }

    public void setBlock_ota_start_date(String block_ota_start_date) {
        this.block_ota_start_date = block_ota_start_date;
    }

    public String getBlock_ota_end_date() {
        return block_ota_end_date;
    }

    public void setBlock_ota_end_date(String block_ota_end_date) {
        this.block_ota_end_date = block_ota_end_date;
    }

    public String getDaydreams() {
        return daydreams;
    }

    public void setDaydreams(String daydreams) {
        this.daydreams = daydreams;
    }

    public String getLast_device_spare_warning_time() {
        return last_device_spare_warning_time;
    }

    public void setLast_device_spare_warning_time(String last_device_spare_warning_time) {
        this.last_device_spare_warning_time = last_device_spare_warning_time;
    }

    public Boolean getCellular_auto_connect() {
        return cellular_auto_connect;
    }

    public void setCellular_auto_connect(Boolean cellular_auto_connect) {
        this.cellular_auto_connect = cellular_auto_connect;
    }

    public List<HotelFeature> getHotel_features() {
        return hotel_features;
    }

    public void setHotel_features(List<HotelFeature> hotel_features) {
        this.hotel_features = hotel_features;
    }

}
