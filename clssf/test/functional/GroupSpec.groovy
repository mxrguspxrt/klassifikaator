import spock.lang.Shared
import spock.lang.Specification

import grails.plugins.rest.client.RestBuilder


class GroupSpec extends Specification {

    def client = new RestBuilder()

    def "create group successfully"() {
        setup:
            def request_body = new File("test/fixtures/group_create_successful_request.json").text
            def response_body = new File("test/fixtures/group_create_successful_response.json").text
        
        when:
            def resp = client.post("http://localhost:8080/clssf/group") {
                json request_body
            }
        
        then:
            resp.status == 200
            resp.body == response_body
    }

}
