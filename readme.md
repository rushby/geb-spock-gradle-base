# Example Geb and Gradle Project

To run tests from the console against dev environment using chrome:

./gradlew chromeTest -Denvironment=dev

Other browsers:

./gradlew chromeHeadlessTest -Dgeb.env=dev
./gradlew firefoxTest -Dgeb.env=dev


To run tests within IntelliJ using a run configuration:

1.  Run click the test you would like to run
2.  Click "Create <MyTestFileName>..."
3.  Set VM Parameters:

-Dgeb.env=chrome -Denvironment=dev -Dwebdriver.chrome.driver="Path/ToMy/DriverExe"