package com.tinklabs.handy.soa.resources.base.bean;

import java.io.Serializable;
import java.util.Date;

public class Articles implements Serializable {
    private Integer id;

    private String locales;

    private String name;

    private Integer feedCategoryId;

    private Integer featured;

    private String type;

    private Integer sticky;

    private Integer advertisement;

    private Integer usesFlex;

    private Date dateStart;

    private Date dateEnd;

    private String icon;

    private String clickTrackCode;

    private String impressionTrackCode;

    private Integer likeCount;

    private Date created;

    private Date updated;

    private String fodId;

    private Integer userId;

    private Integer draft;

    private Integer published;

    private String source;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocales() {
        return locales;
    }

    public void setLocales(String locales) {
        this.locales = locales == null ? null : locales.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getFeedCategoryId() {
        return feedCategoryId;
    }

    public void setFeedCategoryId(Integer feedCategoryId) {
        this.feedCategoryId = feedCategoryId;
    }

    public Integer getFeatured() {
        return featured;
    }

    public void setFeatured(Integer featured) {
        this.featured = featured;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getSticky() {
        return sticky;
    }

    public void setSticky(Integer sticky) {
        this.sticky = sticky;
    }

    public Integer getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Integer advertisement) {
        this.advertisement = advertisement;
    }

    public Integer getUsesFlex() {
        return usesFlex;
    }

    public void setUsesFlex(Integer usesFlex) {
        this.usesFlex = usesFlex;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getClickTrackCode() {
        return clickTrackCode;
    }

    public void setClickTrackCode(String clickTrackCode) {
        this.clickTrackCode = clickTrackCode == null ? null : clickTrackCode.trim();
    }

    public String getImpressionTrackCode() {
        return impressionTrackCode;
    }

    public void setImpressionTrackCode(String impressionTrackCode) {
        this.impressionTrackCode = impressionTrackCode == null ? null : impressionTrackCode.trim();
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
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

    public String getFodId() {
        return fodId;
    }

    public void setFodId(String fodId) {
        this.fodId = fodId == null ? null : fodId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDraft() {
        return draft;
    }

    public void setDraft(Integer draft) {
        this.draft = draft;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}