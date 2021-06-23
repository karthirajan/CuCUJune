$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Validating add customer flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@AddCustomer"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Customer validation by 1D list concept",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddCustomer"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@OneDimList"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user need to fill up the fields by oneDim list",
  "rows": [
    {
      "cells": [
        "Soundar",
        "Rajan",
        "Rajan@gmail.com",
        "Addr",
        "65465464"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_need_to_fill_up_the_fields_by_oneDim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_verify_customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});