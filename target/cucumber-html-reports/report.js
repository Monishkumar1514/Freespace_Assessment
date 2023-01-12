$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Freespace/features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Booking a shoe in Puma Website",
  "description": "",
  "id": "booking-a-shoe-in-puma-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login to the Application",
  "description": "",
  "id": "booking-a-shoe-in-puma-website;login-to-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User landed into the Application.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click the Login with Email button and it navigate to Login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User landed on the Login page and User Enter the \"\u003cemail\u003e\" in the email field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter the \"\u003cpassword\u003e\" in th password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click the Login Button and User is navigated to the HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User landed on the HomePage and user click the Home Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Click the All Running Shoe button and its navigated to the All running shoe page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User \"\u003csearch\u003e\" the Velocity Nitro  Men Running shoe",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "USer click the selected shoe and customise the shoe colour to blue colour in the colour selection field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Select the shoe color as blue in the color selection field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Select Shoe Size as 11 in the size selection options",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User add the product to cart.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user need to check the product details in the viewcart and click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User need to check the product details in the shopping cart page.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User need to checkout the selected product",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user need to enter the shipping details such as address, billing address etc.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user need to check the payment methods and click on mode of payment as credit card",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user need to enter the \"\u003ccredit card name\u003e\" in the credit card name  field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user need to enter the \"\u003ccredit card number\u003e\" in the credit card number field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user need to enter the \"\u003ccredit card EXPIRATION DATE MM/YY\u003e\" in the credit card Date and  Month field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user need to enter the \"\u003cCVV\u003e\"in the credit card cvv field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the place order button in the payment page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user need to click on place order and validate the order rejected popup",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user need to navigate to the cart again and check whether the product is available in the cart.",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user need to remove the product from the cart and verify that the cart is empty.",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user logout from the application.",
  "keyword": "Then "
});
formatter.examples({
  "line": 38,
  "name": "",
  "description": "",
  "id": "booking-a-shoe-in-puma-website;login-to-the-application;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "search",
        "credit card name",
        "credit card number",
        "credit card EXPIRATION DATE MM/YY",
        "CVV"
      ],
      "line": 39,
      "id": "booking-a-shoe-in-puma-website;login-to-the-application;;1"
    },
    {
      "cells": [
        "monishkumar0012@gmail.com",
        "12021998Febu*",
        "Velocity Nitro 2 Men\u0027s Running Shoes",
        "JCB",
        "3566000020000410",
        "02/2023",
        "123"
      ],
      "line": 40,
      "id": "booking-a-shoe-in-puma-website;login-to-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 40,
  "name": "Login to the Application",
  "description": "",
  "id": "booking-a-shoe-in-puma-website;login-to-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User landed into the Application.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click the Login with Email button and it navigate to Login page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User landed on the Login page and User Enter the \"monishkumar0012@gmail.com\" in the email field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Enter the \"12021998Febu*\" in th password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click the Login Button and User is navigated to the HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User landed on the HomePage and user click the Home Button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User Click the All Running Shoe button and its navigated to the All running shoe page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User \"Velocity Nitro 2 Men\u0027s Running Shoes\" the Velocity Nitro  Men Running shoe",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "USer click the selected shoe and customise the shoe colour to blue colour in the colour selection field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Select the shoe color as blue in the color selection field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Select Shoe Size as 11 in the size selection options",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User add the product to cart.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user need to check the product details in the viewcart and click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User need to check the product details in the shopping cart page.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User need to checkout the selected product",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user need to enter the shipping details such as address, billing address etc.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user need to check the payment methods and click on mode of payment as credit card",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user need to enter the \"JCB\" in the credit card name  field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user need to enter the \"3566000020000410\" in the credit card number field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user need to enter the \"02/2023\" in the credit card Date and  Month field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user need to enter the \"123\"in the credit card cvv field",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user click the place order button in the payment page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user need to click on place order and validate the order rejected popup",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user need to navigate to the cart again and check whether the product is available in the cart.",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user need to remove the product from the cart and verify that the cart is empty.",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user logout from the application.",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginpage.user_landed_into_the_Application()"
});
formatter.result({
  "duration": 150236900,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage.user_click_the_Login_with_Email_button_and_it_navigate_to_Login_page()"
});
formatter.result({
  "duration": 635949500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "monishkumar0012@gmail.com",
      "offset": 50
    }
  ],
  "location": "Loginpage.user_landed_on_the_Login_page_and_User_Enter_the_in_the_email_field(String)"
});
formatter.result({
  "duration": 366394800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12021998Febu*",
      "offset": 16
    }
  ],
  "location": "Loginpage.user_Enter_the_in_th_password_Field(String)"
});
formatter.result({
  "duration": 275581300,
  "status": "passed"
});
formatter.match({
  "location": "Loginpage.user_click_the_Login_Button_and_User_is_navigated_to_the_HomePage()"
});
formatter.result({
  "duration": 207168700,
  "status": "passed"
});
formatter.match({
  "location": "Homepage.user_landed_on_the_HomePage_and_user_click_the_Home_Button()"
});
formatter.result({
  "duration": 2932506500,
  "status": "passed"
});
formatter.match({
  "location": "PurchasingPage.user_Click_the_All_Running_Shoe_button_and_its_navigated_to_the_All_running_shoe_page()"
});
formatter.result({
  "duration": 552239100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Velocity Nitro 2 Men\u0027s Running Shoes",
      "offset": 6
    }
  ],
  "location": "PurchasingPage.user_the_Velocity_Nitro_Men_Running_shoe(String)"
});
formatter.result({
  "duration": 688175600,
  "status": "passed"
});
formatter.match({
  "location": "PurchasingPage.user_click_the_selected_shoe_and_customise_the_shoe_colour_to_blue_colour_in_the_colour_selection_field()"
});
formatter.result({
  "duration": 2821311600,
  "status": "passed"
});
formatter.match({
  "location": "PurchasingPage.user_Select_the_shoe_color_as_blue_in_the_color_selection_field()"
});
formatter.result({
  "duration": 2029727300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11",
      "offset": 25
    }
  ],
  "location": "PurchasingPage.user_Select_Shoe_Size_as_in_the_size_selection_options(int)"
});
formatter.result({
  "duration": 185563100,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_add_the_product_to_cart()"
});
formatter.result({
  "duration": 189329100,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_need_to_check_the_product_details_in_the_viewcart_and_click_on_checkout()"
});
formatter.result({
  "duration": 2294075500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_need_to_check_the_product_details_in_the_shopping_cart_page()"
});
formatter.result({
  "duration": 192738000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_need_to_checkout_the_selected_product()"
});
formatter.result({
  "duration": 340498500,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_need_to_enter_the_shipping_details_such_as_address_billing_address_etc()"
});
formatter.result({
  "duration": 10246240400,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_need_to_check_the_payment_methods_and_click_on_mode_of_payment_as_credit_card()"
});
formatter.result({
  "duration": 3893275600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JCB",
      "offset": 24
    }
  ],
  "location": "AddToCart_Page.user_need_to_enter_the_in_the_credit_card_name_field(String)"
});
formatter.result({
  "duration": 305328000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3566000020000410",
      "offset": 24
    }
  ],
  "location": "AddToCart_Page.user_need_to_enter_the_in_the_credit_card_number_field(String)"
});
formatter.result({
  "duration": 3304724300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/2023",
      "offset": 24
    }
  ],
  "location": "AddToCart_Page.user_need_to_enter_the_in_the_credit_card_Date_and_Month_field(String)"
});
formatter.result({
  "duration": 200692500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 24
    }
  ],
  "location": "AddToCart_Page.user_need_to_enter_the_in_the_credit_card_cvv_field(String)"
});
formatter.result({
  "duration": 169250000,
  "status": "passed"
});
formatter.match({
  "location": "AddToCart_Page.user_click_the_place_order_button_in_the_payment_page()"
});
formatter.result({
  "duration": 258611900,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPage.user_need_to_click_on_place_order_and_validate_the_order_rejected_popup()"
});
formatter.result({
  "duration": 3469229900,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPage.user_need_to_navigate_to_the_cart_again_and_check_whether_the_product_is_available_in_the_cart()"
});
formatter.result({
  "duration": 510208300,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPage.user_need_to_remove_the_product_from_the_cart_and_verify_that_the_cart_is_empty()"
});
formatter.result({
  "duration": 494468800,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPage.user_logout_from_the_application()"
});
formatter.result({
  "duration": 1391541900,
  "status": "passed"
});
});