package org.orion.persist.mem

import spock.lang.Specification


/**
 * User: haswell
 * Date: 3/18/14
 * Time: 10:18 PM
 */
class InMemoryPostRepositorySpec extends Specification {

    def "listing elements in a post repository"(a, b, c) {
        expect:
            Math.max(a, b) == c
        where:
            a | b | c
            1 | 2 | 2
    }

}
