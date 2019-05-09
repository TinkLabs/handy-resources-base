package com.tinklabs.handy.soa.resources.base.bean;

/**
 * @description
 * @author Landin
 * @date 2019-05-03
 */
public class BottomMenu {

    private String name;
    private String icon;
    private String action;
    public BottomMenu() {
        super();
    }
    public BottomMenu(String name, String icon, String action) {
        this.name = name;
        this.icon = icon;
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
