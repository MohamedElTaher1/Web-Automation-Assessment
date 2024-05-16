# Web-Automation-Assessment
## SignUp Scenario
### Positive Scenario : Verify that user can sign up successfully
* Click on the Sign up button in the Header
* Fill in the username and password in the sign up form
* Submit the sign up form
* Should see the message "Sign up successful."

### Negative Scenario : LogIn With Invalid UserName
* Enter invalid username and valid password
* Click on the Login button
* Should see an error message "User does not exist."

### Negative Scenario : LogIn With Invalid Password
* Enter valid user name enter invalid password
* Click on  Login button
* Should see  error message "Wrong password."

## BuyProduct Scenario
### Positive Scenario : Verify that two products are purchased successfully
* Click on Login button in Header
* Fill in username  and password  in Login Form
* Validate that account is opened Successfully
* Click on Laptops in categories on home page
* Choose product one
* Click on Add to cart button for product one
* Validate that product one is successfully added to cart
* Choose product two
* Click on Add to cart button for product two
* Validate that product two is successfully added to cart
* Click on Cart button in header
* Validate that both products are successfully added in products page
* Validate that the total amount is calculated correctly
* Click on Place order button
* Validate that the total amount is calculated correctly in place order page
* Fill in  place order form
* Click on Purchase button in place order Form
* Validate that 'Thank you for your purchase!' is displayed

### Negative Scenario : Verify That an Alert message Please fill out Name and Creditcard should appear
* Click on Login button in Header
* Fill in username  and password  in Login Form
* Validate that account is opened Successfully
* Click on Laptops in categories on home page
* Choose product one
* Click on Add to cart button for product one
* Validate that product one is successfully added to cart
* Click on Cart button in header
* Click on Place order button
* Fill in  place order without UserName and CreditCard form
* Click on Purchase button in place order Form
* Validate that 'Please fill out Name and Creditcard.' Alert is displayed

  ## Tools Used
  * Java 
  * Shaft_Engine
  * Selenium
  * Cucumber(BDD)
  
