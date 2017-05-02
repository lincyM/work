package com.paypal.page;

import com.paypal.selion.testcomponents.BasicPageImpl;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.html.Button;
import com.paypal.selion.platform.html.Label;

public class paypal extends BasicPageImpl {

    private TextField passwordTextField;
    private Button signButton;
    private TextField userIDTextField;
    private Label errorLabel;
    private Button loginButton;


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
     

    private static String CLASS_NAME = "paypal";
    private static String PAGE_DOMAIN = "";


    /**
     * Creates a new paypal object
     */
    public paypal() {
        super.initPage(PAGE_DOMAIN, CLASS_NAME);
    }
    
    /**
     * Creates a new paypal object
     *
     * @param siteLocale
     *            The Country locale for the site you are accessing
     */
    public paypal(String siteLocale) {
        super.initPage(PAGE_DOMAIN, CLASS_NAME, siteLocale);
    }

    public paypal getPage() {
        return this;
    }



    /**
     * Used to get passwordTextField in the page paypal
     *
     * @return passwordTextField
     */
    public TextField getPasswordTextField() {
        TextField element = this.passwordTextField;
        if(element == null) {
            this.passwordTextField = new TextField(getObjectMap().get("passwordTextField"), "passwordTextField",
                    this);
        }
        return this.passwordTextField;
    }

    /**
     * Used to set the value of passwordTextField in the page paypal.
     */
    public void setPasswordTextFieldValue(String password) {
        getPasswordTextField().type(password);
    }
    
    /**
     * Used to get the value of passwordTextField in the page paypal.
     *
     * @return text in passwordTextField
     */
    public String getPasswordTextFieldValue() {
        return getPasswordTextField().getText();
    }



    /**
     * Used to get signButton in the page paypal
     *
     * @return signButton
     */
    public Button getSignButton() {
        Button element = this.signButton;
        if(element == null) {
            this.signButton = new Button(getObjectMap().get("signButton"), "signButton",
                    this);
        }
        return this.signButton;
    }

    /**
     * Used to click signButton in the page paypal and check that resulting page contains expected item.
     */
    public void clickSignButton(Object... expected) {
        getSignButton().click(expected);
    }

    /**
     * Used to click signButton in the page paypal
     */
    public void clickSignButton() {
        getSignButton().click();
    }

    /**
     * Used to get the value of signButton in the page paypal.
     *
     * @return text in signButton
     */
    public String getSignButtonValue() {
        return getSignButton().getText();
    }



    /**
     * Used to get userIDTextField in the page paypal
     *
     * @return userIDTextField
     */
    public TextField getUserIDTextField() {
        TextField element = this.userIDTextField;
        if(element == null) {
            this.userIDTextField = new TextField(getObjectMap().get("userIDTextField"), "userIDTextField",
                    this);
        }
        return this.userIDTextField;
    }

    /**
     * Used to set the value of userIDTextField in the page paypal.
     */
    public void setUserIDTextFieldValue(String userID) {
        getUserIDTextField().type(userID);
    }
    
    /**
     * Used to get the value of userIDTextField in the page paypal.
     *
     * @return text in userIDTextField
     */
    public String getUserIDTextFieldValue() {
        return getUserIDTextField().getText();
    }



    /**
     * Used to get errorLabel in the page paypal
     *
     * @return errorLabel
     */
    public Label getErrorLabel() {
        Label element = this.errorLabel;
        if(element == null) {
            this.errorLabel = new Label(getObjectMap().get("errorLabel"), "errorLabel",
                    this);
        }
        return this.errorLabel;
    }

    /**
     * Used to check for the specific text available in the control errorLabel
     */
    public boolean isTextPresentForErrorLabel(String pattern) {
        return getErrorLabel().isTextPresent(pattern);
    }



    /**
     * Used to get loginButton in the page paypal
     *
     * @return loginButton
     */
    public Button getLoginButton() {
        Button element = this.loginButton;
        if(element == null) {
            this.loginButton = new Button(getObjectMap().get("loginButton"), "loginButton",
                    this);
        }
        return this.loginButton;
    }

    /**
     * Used to click loginButton in the page paypal and check that resulting page contains expected item.
     */
    public void clickLoginButton(Object... expected) {
        getLoginButton().click(expected);
    }

    /**
     * Used to click loginButton in the page paypal
     */
    public void clickLoginButton() {
        getLoginButton().click();
    }

    /**
     * Used to get the value of loginButton in the page paypal.
     *
     * @return text in loginButton
     */
    public String getLoginButtonValue() {
        return getLoginButton().getText();
    }

}

