package klass

import grails.rest.*

class GroupsController extends RestfulController {

    static responseFormats = ['json', 'xml']

    GroupsController() {
        super(Group)
    }   

    def create() {
        render '{"id":1,"name":"Name #1","description":"Description #1"}'
    }

}
