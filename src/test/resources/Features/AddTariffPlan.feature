#Author: your.email@your.domain.com
@AddTariff @regression
Feature: Add Tariff Plan Validation

  Scenario Outline: tariff plan flow validation
    And user click on add tariff button
    When user need to fill up the plan details "<MR>","<FLM>","<FIM>","<FSP>","<LPMC>","<IPMC>","<SPC>"
    And user clicked on the submit button 
    Then user verify congratulation message

    Examples: 
      | MR  | FLM | FIM | FSP | LPMC | IPMC | SPC |
      | 100 | 200 | 300 | 400 |    3 |    2 |   1 |


