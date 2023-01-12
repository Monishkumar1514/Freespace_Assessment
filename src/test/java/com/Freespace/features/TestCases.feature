Feature: Booking a shoe in Puma Website

Scenario Outline: Login to the Application 

	Given User landed into the Application. 
	When User click the Login with Email button and it navigate to Login page
	And  User landed on the Login page and User Enter the "<email>" in the email field
	And  User Enter the "<password>" in th password Field
  Then User click the Login Button and User is navigated to the HomePage
  When User landed on the HomePage and user click the Home Button
  And  User Click the All Running Shoe button and its navigated to the All running shoe page
  And User "<search>" the Velocity Nitro  Men Running shoe
  And USer click the selected shoe and customise the shoe colour to blue colour in the colour selection field
  And  User Select the shoe color as blue in the color selection field
  And User Select Shoe Size as 11 in the size selection options
  And User add the product to cart.
  And user need to check the product details in the viewcart and click on checkout
  And User need to check the product details in the shopping cart page.
  And User need to checkout the selected product 
  And user need to enter the shipping details such as address, billing address etc.
  And user need to check the payment methods and click on mode of payment as credit card
  And user need to enter the "<credit card name>" in the credit card name  field
  And user need to enter the "<credit card number>" in the credit card number field
  And user need to enter the "<credit card EXPIRATION DATE MM/YY>" in the credit card Date and  Month field
  And user need to enter the "<CVV>"in the credit card cvv field
  And user click the place order button in the payment page
  And user need to click on place order and validate the order rejected popup
  And user need to navigate to the cart again and check whether the product is available in the cart.
  And user need to remove the product from the cart and verify that the cart is empty.
  Then user logout from the application.
  
 
	
	
		

	
	Examples: 
		|email  | password | search | credit card name | credit card number | credit card EXPIRATION DATE MM/YY | CVV |
		|monishkumar0012@gmail.com	| 12021998Febu*	| Velocity Nitro 2 Men's Running Shoes | JCB | 3566000020000410 | 02/2023 | 123 |
	
	
	
