Feature:Search product
  @wip-ProductSearch
  Scenario: Search as user
    Given The user on the home page
    When The user should be able to search "ProductName" this item
    And For the best result choose above four stars and the sort by the "Avg. Customer Review"
    And The user should be able to see items and add to card it and verify that
    Then The user should be able to see item in the card
