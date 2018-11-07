package pages

class GoogleTestPage extends BasePage {

    static url = "http://www.google.com"

    static at = {
        logo.displayed
    }

    static content = {
        logo { $("#hplogo") }
    }
}
