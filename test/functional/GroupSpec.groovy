import spock.lang.Shared
import spock.lang.Specification

import grails.plugins.rest.client.RestBuilder


class GroupSpec extends Specification {

    def client = new RestBuilder()

    def "group is created when parameters are valid"() {
        setup:
            def request_body = new File("test/fixtures/group_create_successful_request.json").text
            def response_body = new File("test/fixtures/group_create_successful_response.json").text
        
        when:
            def resp = client.post("http://localhost:8080/klass/groups") {
                json request_body
            }
        
        then:
            resp.status == 201
            resp.body == response_body
    }

    def "groups are listed when there are any"() {
        setup:
            def response_body = new File("test/fixtures/group_create_successful_response.json").text
            response_body = "["+response_body+"]"

        when:
            def resp = client.get("http://localhost:8080/klass/groups")

        then:
            resp.status == 200
            resp.body == response_body
    }

}
