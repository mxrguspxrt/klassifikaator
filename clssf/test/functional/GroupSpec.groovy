import spock.lang.Shared
import spock.lang.Specification

import grails.plugins.rest.client.RestBuilder


class GroupSpec extends Specification {

    def "create group succesfully"() {
        setup:
            def client = new RestBuilder()
        
        when:
            def resp = client.get("http://www.neti.ee")
        
        then:
            resp.status == 200
            resp.body == "yo"
    }

}
