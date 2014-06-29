package clssf
import  grails.rest.*

// https://github.com/grails/grails-core/blob/master/grails-plugin-rest/src/main/groovy/grails/rest/RestfulController.groovy
// http://grails.org/doc/2.4.x/ref/Domain%20Classes/save.html

class GroupController extends RestfulController {
    // static allowedMethods = [save: "POST", update: "PUT", patch: "PATCH", delete: "DELETE"]

    def GroupController() {
        super(Group)
    }

    // def index(){
    // }

    def save() {
        def group = new Group(group_params)
        group.save(flush: true) 
        respond_with(group)
    }

    // def show(){
    // }

    // def update(){
    // }

    // def delete(){
    // }

    def respond_with(group) {
        def status = request.method=="POST" ? 201 : 200
        if (group.hasErrors()) {
            status = 422
        }
        respond group_response(group), [status: status, formats: "json"]
    }

    def group_params() {
        [name: params.name, description: params.description]
    }

    def group_response(group) {
        if(group.hasErrors()) {
            return [errors: group.errors]
        } else {
            return [id: group.id, name: group.name, description: group.description]
        }
    }

}
