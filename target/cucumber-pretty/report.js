$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/couponfeature/coupon.feature");
formatter.feature({
  "name": "sign up feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add functionality of coupon",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on coupons",
  "keyword": "Given "
});
formatter.step({
  "name": "User navigate to coupon Dashboard",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Add button",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the \"\u003cCoupon Name\u003e\",\"\u003cCode\u003e\",\"\u003cDiscount\u003e\",\"\u003cTotal Amount\u003e\",\"\u003cproducts\u003e\",\"\u003ccategory\u003e\",\"\u003cDate Start\u003e\",\"\u003cDate End\u003e\",\"\u003cUses per coupon\u003e\",\"\u003cUses per Customer\u003e\",",
  "keyword": "And "
});
formatter.step({
  "name": "User Select Type,Customer_Login,Free_shipping,Status",
  "keyword": "And "
});
formatter.step({
  "name": "User click on save button",
  "keyword": "And "
});
formatter.step({
  "name": "User CLick the displayed message",
  "keyword": "And "
});
formatter.step({
  "name": "user redirected to the coupons home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Coupon Name",
        "Code",
        "Discount",
        "Total Amount",
        "products",
        "category",
        "Date Start",
        "Date End",
        "Uses per coupon",
        "Uses per Customer"
      ]
    },
    {
      "cells": [
        "abcde98288@",
        "abcd$#1136",
        "20",
        "5000",
        "xyz123",
        "electonic",
        "2021-10-06",
        "2021-11-06",
        "",
        ""
      ]
    }
  ]
});
formatter.background({
  "name": "Login the user",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Retail application",
  "keyword": "Given "
});
formatter.match({
  "location": "coupondefination.user_is_on_the_Retail_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "coupondefination.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the Dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.user_navigate_to_the_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on button menu",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.click_on_button_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Marketing",
  "keyword": "Then "
});
formatter.match({
  "location": "coupondefination.user_click_on_Marketing()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add functionality of coupon",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on coupons",
  "keyword": "Given "
});
formatter.match({
  "location": "coupondefination.user_click_on_coupons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to coupon Dashboard",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.user_navigate_to_coupon_Dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add button",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.click_on_Add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the \"abcde98288@\",\"abcd$#1136\",\"20\",\"5000\",\"xyz123\",\"electonic\",\"2021-10-06\",\"2021-11-06\",\"\",\"\",",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.enter_the(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Select Type,Customer_Login,Free_shipping,Status",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.user_Select_Type_Customer_Login_Free_shipping_Status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.user_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User CLick the displayed message",
  "keyword": "And "
});
formatter.match({
  "location": "coupondefination.user_CLick_the_dispalyed_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user redirected to the coupons home page",
  "keyword": "Then "
});
formatter.match({
  "location": "coupondefination.user_redirected_to_the_coupons_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});