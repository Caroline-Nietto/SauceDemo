Feature: Select Product in Store
Scenario Outline: Selecting Product with Success DDT
  Given I access SauceDemo store
  When I filled a user <user> and password <password>
  And I click in Login
  Then I verify the page's title "Products"
  And show cart's link
  When I click in product <productId>
  Then I verify the product title <productTitle>
  And I verify the product price <productPrice>
  When I click in Add to Cart
  And I click in Cart icon
  Then I verify the page's title "Your Cart"
  And I verify the product title <productTitle> in cart
  And I verify the quantity is "1"
  And I verify the product price <productPrice> in cart
  Examples:
  | user            | password        | productId | productTitle          |
  |"standard_user"  | "secret_sauce"  | "4"       | "Sauce Labs Backpack" |