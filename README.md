# BEYMEN-Mobile-Application-Appium

This project is developed to perform automation tests for the Beymen Mobile Application using a Java and Selenium-based Appium test framework.

<p align="center">
  <img src="https://landostudio.com/wp-content/uploads/2020/11/beymen-logo.png" alt="Project Logo" width="300" />
</p>

## Requirements

- Java Development Kit (JDK) 1.8 or above
- Maven
- IntelliJ IDEA (or your preferred Java IDE)
- Appium
- Android Emulator or Physical Android Device

## Test Scenarios

This project follows the BDD (Behavior-Driven Development) approach. Test scenarios are written in the Gherkin language in Cucumber feature files. Scenarios are designed based on user behaviors, and different scenarios are tested to ensure the functionality of the application.

## Kurulum

1. Download or clone this project from GitHub.

2. Go to the project folder and execute the following command to install the necessary dependencies:
   ```
   mvn clean install
   ```

3. Start the Appium server and prepare the Android Emulator or Physical Device for running application tests.

4. Update the deviceName, platformName, platformVersion, and appPath variables in the ConfigReader.java file according to your device and application information.

5. To run the tests, use the following command:
   ```
   mvn test
   ```

## Scenarios

This project includes two separate scenarios:
### @accountVerify

**Scenario 1: Automation of Signing Up with Beymen Mobile Application***
- Enable location services.
- Click on the "My Profile" button.
- Click on the "Sign Up" button.
- Enter the email address.
- Enter the password.
- Click on the "Sign In" button.
- Click on the "My Profile" button.
- Verify successful sign-in with the correct email.

### @adressVerify

**Scenario 2: Verify Registered Address with Beymen Mobile Application**
- Enable location services.
- Click on the "My Profile" button.
- Click on the "Sign Up" button.
- Enter the email address.
- Enter the password.
- Click on the "Sign In" button.
- Click on the "My Profile" button.
- Click on the "Addresses" button.
- Click on the "Add New Address" button.
- Enter address information.
- Go to the menu page.
- Go back to the home page.
- Click on the "Categories" button.
- Click on the "Men" category.
- Click on the "New Arrivals" category.
- Select a product and add it to the cart.
- Go to the cart page.
- Make a purchase.
- Verify the address on the purchase page.
- Go back to the cart page.
- Go back to the "New Arrivals" page.
- Go back to the "Categories" page.
- Click on the "My Profile" button.
- Click on the "Addresses" button.
- Delete the added address.

## Test Reports

After each test run, test reports are automatically generated and stored under the target/cucumber-reports/index.html file. You can view the reports through this file.

## License

This project is open-source and subject to the terms specified in the License File.

## Contact

For any questions or suggestions, please contact us at farslan0699@gmail.com.

## Contribution

If you would like to contribute to this project, you can do so by opening a "Pull Request" to submit your changes. Additionally, you can review existing "Issues" and provide feedback to help improve the project.

---

This detailed README file has been enriched by adding more information about the project's structure, test scenarios, installation, and contribution process. Additionally, information about test reports has been provided, and the contact email for the project has been included. This provides a comprehensive guide for users and contributors to the project.
