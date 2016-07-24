package demo

import spock.lang.Shared
import spock.lang.Specification

class E7_Shared extends Specification {

    @Shared
    def user = new User('Iván', 'López')

    void 'should get name'() {
        expect:
            println user
    }

    void 'should get lastName'() {
        expect:
            println user
    }

}
