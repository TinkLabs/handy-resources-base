package com.tinklabs.handy.soa.resources.base.bean;

/**
 * @description: device_users 表实体映射
 * @copyright: Copyright (c) 2019
 * @company: tinklabs
 * @author: 曹友安
 * @version: 1.0
 * @date: 2019 Mar 22, 2019 3:22:55 PM
 */
public class DeviceUser extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 4694028846275074286L;

    private Integer           device_id;

    private Integer           member_id;

    private Integer           hotel_id;

    private String            hotel_room_number;

    private String            hotel_group_code;

    private String            hotel_vip_code;

    private String            hotel_guest_id;

    private String            hotel_guest_name_id;

    private String            hotel_guest_group_id;

    private String            hotel_guest_checkin_date;

    private String            hotel_guest_checkout_date;

    private String            hotel_guest_express_checkout_datetime;

    private String            hotel_guest_integration_data;

    private String            activation_datetime;

    private String            return_datetime;

    private String            scheduled_return_datetime;

    private String            first_name;

    private String            last_name;

    private String            salutation;

    private String            language;

    private String            stripe_customer_id;

    private String            paydollar_member_id;

    private String            last_payment;

    private String            cc_type;

    private String            cc_name;

    private String            cc_number;

    private String            cc_fingerprint;

    private String            cc_expiry;

    private String            email;

    private String            ui_states;

    private Integer           outside_hotel;

    private Integer           dnd;

    private String            created;

    private String            modified;

    private String            is_paying;

    private String            payment_token;

    private String            remarks;

    private Integer           gdpr_accepted;

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_room_number() {
        return hotel_room_number;
    }

    public void setHotel_room_number(String hotel_room_number) {
        this.hotel_room_number = hotel_room_number;
    }

    public String getHotel_group_code() {
        return hotel_group_code;
    }

    public void setHotel_group_code(String hotel_group_code) {
        this.hotel_group_code = hotel_group_code;
    }

    public String getHotel_vip_code() {
        return hotel_vip_code;
    }

    public void setHotel_vip_code(String hotel_vip_code) {
        this.hotel_vip_code = hotel_vip_code;
    }

    public String getHotel_guest_id() {
        return hotel_guest_id;
    }

    public void setHotel_guest_id(String hotel_guest_id) {
        this.hotel_guest_id = hotel_guest_id;
    }

    public String getHotel_guest_name_id() {
        return hotel_guest_name_id;
    }

    public void setHotel_guest_name_id(String hotel_guest_name_id) {
        this.hotel_guest_name_id = hotel_guest_name_id;
    }

    public String getHotel_guest_group_id() {
        return hotel_guest_group_id;
    }

    public void setHotel_guest_group_id(String hotel_guest_group_id) {
        this.hotel_guest_group_id = hotel_guest_group_id;
    }

    public String getHotel_guest_checkin_date() {
        return hotel_guest_checkin_date;
    }

    public void setHotel_guest_checkin_date(String hotel_guest_checkin_date) {
        this.hotel_guest_checkin_date = hotel_guest_checkin_date;
    }

    public String getHotel_guest_checkout_date() {
        return hotel_guest_checkout_date;
    }

    public void setHotel_guest_checkout_date(String hotel_guest_checkout_date) {
        this.hotel_guest_checkout_date = hotel_guest_checkout_date;
    }

    public String getHotel_guest_express_checkout_datetime() {
        return hotel_guest_express_checkout_datetime;
    }

    public void setHotel_guest_express_checkout_datetime(String hotel_guest_express_checkout_datetime) {
        this.hotel_guest_express_checkout_datetime = hotel_guest_express_checkout_datetime;
    }

    public String getHotel_guest_integration_data() {
        return hotel_guest_integration_data;
    }

    public void setHotel_guest_integration_data(String hotel_guest_integration_data) {
        this.hotel_guest_integration_data = hotel_guest_integration_data;
    }

    public String getActivation_datetime() {
        return activation_datetime;
    }

    public void setActivation_datetime(String activation_datetime) {
        this.activation_datetime = activation_datetime;
    }

    public String getReturn_datetime() {
        return return_datetime;
    }

    public void setReturn_datetime(String return_datetime) {
        this.return_datetime = return_datetime;
    }

    public String getScheduled_return_datetime() {
        return scheduled_return_datetime;
    }

    public void setScheduled_return_datetime(String scheduled_return_datetime) {
        this.scheduled_return_datetime = scheduled_return_datetime;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStripe_customer_id() {
        return stripe_customer_id;
    }

    public void setStripe_customer_id(String stripe_customer_id) {
        this.stripe_customer_id = stripe_customer_id;
    }

    public String getPaydollar_member_id() {
        return paydollar_member_id;
    }

    public void setPaydollar_member_id(String paydollar_member_id) {
        this.paydollar_member_id = paydollar_member_id;
    }

    public String getLast_payment() {
        return last_payment;
    }

    public void setLast_payment(String last_payment) {
        this.last_payment = last_payment;
    }

    public String getCc_type() {
        return cc_type;
    }

    public void setCc_type(String cc_type) {
        this.cc_type = cc_type;
    }

    public String getCc_name() {
        return cc_name;
    }

    public void setCc_name(String cc_name) {
        this.cc_name = cc_name;
    }

    public String getCc_number() {
        return cc_number;
    }

    public void setCc_number(String cc_number) {
        this.cc_number = cc_number;
    }

    public String getCc_fingerprint() {
        return cc_fingerprint;
    }

    public void setCc_fingerprint(String cc_fingerprint) {
        this.cc_fingerprint = cc_fingerprint;
    }

    public String getCc_expiry() {
        return cc_expiry;
    }

    public void setCc_expiry(String cc_expiry) {
        this.cc_expiry = cc_expiry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUi_states() {
        return ui_states;
    }

    public void setUi_states(String ui_states) {
        this.ui_states = ui_states;
    }

    public Integer getOutside_hotel() {
        return outside_hotel;
    }

    public void setOutside_hotel(Integer outside_hotel) {
        this.outside_hotel = outside_hotel;
    }

    public Integer getDnd() {
        return dnd;
    }

    public void setDnd(Integer dnd) {
        this.dnd = dnd;
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

    public String getIs_paying() {
        return is_paying;
    }

    public void setIs_paying(String is_paying) {
        this.is_paying = is_paying;
    }

    public String getPayment_token() {
        return payment_token;
    }

    public void setPayment_token(String payment_token) {
        this.payment_token = payment_token;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getGdpr_accepted() {
        return gdpr_accepted;
    }

    public void setGdpr_accepted(Integer gdpr_accepted) {
        this.gdpr_accepted = gdpr_accepted;
    }

}
