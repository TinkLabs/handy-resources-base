package com.tinklabs.handy.soa.resources.base.bean;

/**
 * @description: App 属性值
 * @author: lyon.cao
 * @date: Apr 18, 2019
 * @version: v.0.0.1
 * @copyright: hi inc
 */
public class AppProfile {

    private String  pic_url;

    private String  download_url;

    private String  package_name;

    private String  md5sum;

    private String  sha256sum;

    private String  title;

    private String  desc;

    private boolean isRecommended;

    public AppProfile() {
        super();
    }

    public AppProfile(String package_name, boolean isRecommended) {
        super();
        this.package_name = package_name;
        this.isRecommended = isRecommended;
    }

    public AppProfile(String pic_url, String download_url, String package_name, String md5sum, String sha256sum, String title, String desc, boolean isRecommended) {
        super();
        this.pic_url = pic_url;
        this.download_url = download_url;
        this.package_name = package_name;
        this.md5sum = md5sum;
        this.sha256sum = sha256sum;
        this.title = title;
        this.desc = desc;
        this.isRecommended = isRecommended;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    public String getSha256sum() {
        return sha256sum;
    }

    public void setSha256sum(String sha256sum) {
        this.sha256sum = sha256sum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean getIsRecommended() {
        return isRecommended;
    }

    public void setIsRecommended(boolean isRecommended) {
        this.isRecommended = isRecommended;
    }

}
