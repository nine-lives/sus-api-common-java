package uk.co.stuffusell.api.common

import spock.lang.Specification

class ErrorResponseSpec extends Specification {
    def "I can create an exception with just a message"() {
        when:
        ErrorResponse e = new ErrorResponse("error message")

        then:
        e.error == "error message"
    }
}
