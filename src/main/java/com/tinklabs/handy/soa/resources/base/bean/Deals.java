package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Deals implements Serializable {
    private Integer id;

    private Integer dealCategoryId;

    private Integer merchantId;

    private Integer currencyId;

    private String name;

    private BigDecimal listPriority;

    private String passcodes;

    private String email;

    private Boolean isFree;

    private Integer duration;

    private Integer durationInSeconds;

    private Integer dateRequired;

    private Integer daysCutoff;

    private Integer daysForwardAvailable;

    private String availableWeekdays;

    private Integer departureRequired;

    private String availableDeparture;

    private Integer emailConfirmRequired;

    private Boolean instantConfirmation;

    private Integer isEnableContentAutoRefresh;

    private Integer confirmationPeriod;

    private Integer confirmationPeriodInSeconds;

    private Boolean requirePaperVoucher;

    private Boolean hotelPickup;

    private String tourCode;

    private Date dateStart;

    private Date dateEnd;

    private Integer purchaseCount;

    private Integer basePurchaseCount;

    private String minVer;

    private Integer riskLevel;

    private Float purchaseFlowVer;

    private Integer recommended;

    private Integer likeCount;

    private String thirdpartyId;

    private String dealRefCode;

    private String reviewStats;

    private BigDecimal reviewStatsAvg;

    private String status;

    private Date created;

    private Date updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDealCategoryId() {
        return dealCategoryId;
    }

    public void setDealCategoryId(Integer dealCategoryId) {
        this.dealCategoryId = dealCategoryId;
    }

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getListPriority() {
        return listPriority;
    }

    public void setListPriority(BigDecimal listPriority) {
        this.listPriority = listPriority;
    }

    public String getPasscodes() {
        return passcodes;
    }

    public void setPasscodes(String passcodes) {
        this.passcodes = passcodes == null ? null : passcodes.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public Integer getDateRequired() {
        return dateRequired;
    }

    public void setDateRequired(Integer dateRequired) {
        this.dateRequired = dateRequired;
    }

    public Integer getDaysCutoff() {
        return daysCutoff;
    }

    public void setDaysCutoff(Integer daysCutoff) {
        this.daysCutoff = daysCutoff;
    }

    public Integer getDaysForwardAvailable() {
        return daysForwardAvailable;
    }

    public void setDaysForwardAvailable(Integer daysForwardAvailable) {
        this.daysForwardAvailable = daysForwardAvailable;
    }

    public String getAvailableWeekdays() {
        return availableWeekdays;
    }

    public void setAvailableWeekdays(String availableWeekdays) {
        this.availableWeekdays = availableWeekdays == null ? null : availableWeekdays.trim();
    }

    public Integer getDepartureRequired() {
        return departureRequired;
    }

    public void setDepartureRequired(Integer departureRequired) {
        this.departureRequired = departureRequired;
    }

    public String getAvailableDeparture() {
        return availableDeparture;
    }

    public void setAvailableDeparture(String availableDeparture) {
        this.availableDeparture = availableDeparture == null ? null : availableDeparture.trim();
    }

    public Integer getEmailConfirmRequired() {
        return emailConfirmRequired;
    }

    public void setEmailConfirmRequired(Integer emailConfirmRequired) {
        this.emailConfirmRequired = emailConfirmRequired;
    }

    public Boolean getInstantConfirmation() {
        return instantConfirmation;
    }

    public void setInstantConfirmation(Boolean instantConfirmation) {
        this.instantConfirmation = instantConfirmation;
    }

    public Integer getIsEnableContentAutoRefresh() {
        return isEnableContentAutoRefresh;
    }

    public void setIsEnableContentAutoRefresh(Integer isEnableContentAutoRefresh) {
        this.isEnableContentAutoRefresh = isEnableContentAutoRefresh;
    }

    public Integer getConfirmationPeriod() {
        return confirmationPeriod;
    }

    public void setConfirmationPeriod(Integer confirmationPeriod) {
        this.confirmationPeriod = confirmationPeriod;
    }

    public Integer getConfirmationPeriodInSeconds() {
        return confirmationPeriodInSeconds;
    }

    public void setConfirmationPeriodInSeconds(Integer confirmationPeriodInSeconds) {
        this.confirmationPeriodInSeconds = confirmationPeriodInSeconds;
    }

    public Boolean getRequirePaperVoucher() {
        return requirePaperVoucher;
    }

    public void setRequirePaperVoucher(Boolean requirePaperVoucher) {
        this.requirePaperVoucher = requirePaperVoucher;
    }

    public Boolean getHotelPickup() {
        return hotelPickup;
    }

    public void setHotelPickup(Boolean hotelPickup) {
        this.hotelPickup = hotelPickup;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode == null ? null : tourCode.trim();
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(Integer purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public Integer getBasePurchaseCount() {
        return basePurchaseCount;
    }

    public void setBasePurchaseCount(Integer basePurchaseCount) {
        this.basePurchaseCount = basePurchaseCount;
    }

    public String getMinVer() {
        return minVer;
    }

    public void setMinVer(String minVer) {
        this.minVer = minVer == null ? null : minVer.trim();
    }

    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Float getPurchaseFlowVer() {
        return purchaseFlowVer;
    }

    public void setPurchaseFlowVer(Float purchaseFlowVer) {
        this.purchaseFlowVer = purchaseFlowVer;
    }

    public Integer getRecommended() {
        return recommended;
    }

    public void setRecommended(Integer recommended) {
        this.recommended = recommended;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getThirdpartyId() {
        return thirdpartyId;
    }

    public void setThirdpartyId(String thirdpartyId) {
        this.thirdpartyId = thirdpartyId == null ? null : thirdpartyId.trim();
    }

    public String getDealRefCode() {
        return dealRefCode;
    }

    public void setDealRefCode(String dealRefCode) {
        this.dealRefCode = dealRefCode == null ? null : dealRefCode.trim();
    }

    public String getReviewStats() {
        return reviewStats;
    }

    public void setReviewStats(String reviewStats) {
        this.reviewStats = reviewStats == null ? null : reviewStats.trim();
    }

    public BigDecimal getReviewStatsAvg() {
        return reviewStatsAvg;
    }

    public void setReviewStatsAvg(BigDecimal reviewStatsAvg) {
        this.reviewStatsAvg = reviewStatsAvg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}