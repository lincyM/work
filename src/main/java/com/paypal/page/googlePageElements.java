package com.paypal.page;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.html.Button;
import com.paypal.selion.platform.html.Link;

public class googlePageElements extends BasicPageImpl {

    private Link firstLink;
    private TextField googleTextField;
    private Button searchButton;


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
     

    private static String CLASS_NAME = "googlePageElements";
    private static String PAGE_DOMAIN = "";


    /**
     * Creates a new googlePageElements object
     */
    public googlePageElements() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new googlePageElements object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public googlePageElements(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public googlePageElements getPage() {
        return this;
    }



    /**
     * Used to get firstLink in the page googlePageElements
     *
     * @return firstLink
     */
    public Link getFirstLink() {
        Link element = this.firstLink;
        if(element == null) {
            this.firstLink = new Link(getObjectMap().get("firstLink"), "firstLink",
                    this);
        }
        return this.firstLink;
    }

    /**
     * Used to check the control firstLink in the page googlePageElements and wait for the object to load.
     */
    public void clickFirstLink(Object... expected) {
        getFirstLink().click(expected);
    }

    /**
     * Used to click firstLink in the page googlePageElements
     */
    public void clickFirstLink() {
        getFirstLink().click();
    }



    /**
     * Used to get googleTextField in the page googlePageElements
     *
     * @return googleTextField
     */
    public TextField getGoogleTextField() {
        TextField element = this.googleTextField;
        if(element == null) {
            this.googleTextField = new TextField(getObjectMap().get("googleTextField"), "googleTextField",
                    this);
        }
        return this.googleTextField;
    }

    /**
     * Used to set the value of googleTextField in the page googlePageElements.
     */
    public void setGoogleTextFieldValue(String google) {
        getGoogleTextField().type(google);
    }
    
    /**
     * Used to get the value of googleTextField in the page googlePageElements.
     *
     * @return text in googleTextField
     */
    public String getGoogleTextFieldValue() {
        return getGoogleTextField().getText();
    }



    /**
     * Used to get searchButton in the page googlePageElements
     *
     * @return searchButton
     */
    public Button getSearchButton() {
        Button element = this.searchButton;
        if(element == null) {
            this.searchButton = new Button(getObjectMap().get("searchButton"), "searchButton",
                    this);
        }
        return this.searchButton;
    }

    /**
     * Used to click searchButton in the page googlePageElements and check that resulting page contains expected item.
     */
    public void clickSearchButton(Object... expected) {
        getSearchButton().click(expected);
    }

    /**
     * Used to click searchButton in the page googlePageElements
     */
    public void clickSearchButton() {
        getSearchButton().click();
    }

    /**
     * Used to get the value of searchButton in the page googlePageElements.
     *
     * @return text in searchButton
     */
    public String getSearchButtonValue() {
        return getSearchButton().getText();
    }

}

