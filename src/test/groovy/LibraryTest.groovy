/*
 * This Spock specification was auto generated by running the Gradle 'init' task
 * by 'linheng' at '2018/2/16 下午 10:52' with Gradle 3.2.1
 *
 * @author linheng, @date 2018/2/16 下午 10:52
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
