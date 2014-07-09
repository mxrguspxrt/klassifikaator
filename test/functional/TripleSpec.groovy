class TripleSpec extends BaseRestSpec {

    def "group is created when parameters are valid"() {
        setup:
            def request_body = new File("test/fixtures/group_create_successful_request.json").text
            def response_body = new File("test/fixtures/group_create_successful_response.json").text
        
        when:
            def resp = post("/klass/groups") {
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
            def resp = get("/klass/groups")

        then:
            resp.status == 200
            resp.body == response_body
    }

}
