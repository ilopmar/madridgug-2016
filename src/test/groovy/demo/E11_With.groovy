package demo

import spock.lang.Specification

class E11_With extends Specification {

    void 'should check value on user'() {
        when:
            def user = new User('Iván', 'López')

        then:
            with(user) {
                name == 'Iván'
                lastName == 'López'
            }

    }

}
