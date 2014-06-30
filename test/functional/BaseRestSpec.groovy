import spock.lang.Shared
import spock.lang.Specification

import grails.plugins.rest.client.RestBuilder

class BaseRestSpec extends Specification {
    def client = new RestBuilder()
    def baseUrl = "http://localhost:8080"

    def fullUrl(path) {
        return baseUrl + path
    }

    def post(path, closure) {
        client.post(fullUrl(path), closure)
    }

    def get(path) {
        client.get(fullUrl(path))
    }

}
