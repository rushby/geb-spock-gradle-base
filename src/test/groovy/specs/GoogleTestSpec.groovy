package specs

import annotations.dev
import pages.GoogleTestPage

@dev
class GoogleTestSpec extends BaseGebSpec {

    def "As a user I can navigate to the Google homepage"() {

        when: "I navigate to the Google homepage"
            to GoogleTestPage

        then: "I am on the Google homepage"
            at GoogleTestPage
    }
}