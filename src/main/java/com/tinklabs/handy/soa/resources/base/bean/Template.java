package com.tinklabs.handy.soa.resources.base.bean;

public class Template extends BaseVO {

    /**
     * @fields
     */
    private static final long serialVersionUID = 1891815196658572564L;

    private String            deal_ids;
    private String            lockscreen_ids;
    private String            locales;
    private String            name;
    private String            home_url;
    private String            config;
    private String            created;
    private String            modified;
    private String            watch_config_id;

    public String getDeal_ids() {
        return deal_ids;
    }

    public void setDeal_ids(String deal_ids) {
        this.deal_ids = deal_ids;
    }

    public String getLockscreen_ids() {
        return lockscreen_ids;
    }

    public void setLockscreen_ids(String lockscreen_ids) {
        this.lockscreen_ids = lockscreen_ids;
    }

    public String getLocales() {
        return locales;
    }

    public void setLocales(String locales) {
        this.locales = locales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome_url() {
        return home_url;
    }

    public void setHome_url(String home_url) {
        this.home_url = home_url;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
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

    public String getWatch_config_id() {
        return watch_config_id;
    }

    public void setWatch_config_id(String watch_config_id) {
        this.watch_config_id = watch_config_id;
    }

}
