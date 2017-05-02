package com.paypal.page;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.Link;

public class selioio extends BasicPageImpl {

    private Link viewLink;
    private Link userIDLink;


     /**
     * SeLion GUI Html Object Standard
     *    
     * The naming conventions followed in SeLion for html elements are as follows,
     *
     * <alias>{corresponding class name of the html element in SeLion} where - <alias> will be the object name with its 
     * first letter in lowercase.
     * 
     * <alias>Button                For Button html element.
     * <alias>CheckBox              For Check Box html element.
     * <alias>DatePicker            For Date Picker html element.
     * <alias>Form                  For Form html element.
     * <alias>Image                 For Image html element.
     * <alias>Label                 For Label html element.
     * <alias>Link                  For Link html element.
     * <alias>RadioButton           For Radio Button html element.
     * <alias>List                  For Select List html element.
     * <alias>Table                 For Table html element.
     * <alias>TextField             For Text Field html element.
     * <alias>Container             For Container html element.
     * 
     */
     

    private static String CLASS_NAME = "selioio";
    private static String PAGE_DOMAIN = "";


    /**
     * Creates a new selioio object
     */
    public selioio() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new selioio object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public selioio(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public selioio getPage() {
        return this;
    }



    /**
     * Used to get viewLink in the page selioio
     *
     * @return viewLink
     */
    public Link getViewLink() {
        Link element = this.viewLink;
        if(element == null) {
            this.viewLink = new Link(getObjectMap().get("viewLink"), "viewLink",
                    this);
        }
        return this.viewLink;
    }

    /**
     * Used to check the control viewLink in the page selioio and wait for the object to load.
     */
    public void clickViewLink(Object... expected) {
        getViewLink().click(expected);
    }

    /**
     * Used to click viewLink in the page selioio
     */
    public void clickViewLink() {
        getViewLink().click();
    }



    /**
     * Used to get userIDLink in the page selioio
     *
     * @return userIDLink
     */
    public Link getUserIDLink() {
        Link element = this.userIDLink;
        if(element == null) {
            this.userIDLink = new Link(getObjectMap().get("userIDLink"), "userIDLink",
                    this);
        }
        return this.userIDLink;
    }

    /**
     * Used to check the control userIDLink in the page selioio and wait for the object to load.
     */
    public void clickUserIDLink(Object... expected) {
        getUserIDLink().click(expected);
    }

    /**
     * Used to click userIDLink in the page selioio
     */
    public void clickUserIDLink() {
        getUserIDLink().click();
    }

}

