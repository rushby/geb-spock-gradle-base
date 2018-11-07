package pages

import geb.Page

class BasePage extends Page {

    static content = {

        heading { $("#banner > h1").text() }
    }
}
