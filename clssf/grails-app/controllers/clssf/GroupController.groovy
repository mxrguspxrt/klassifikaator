package clssf
import  grails.rest.*

class GroupController extends RestfulController {

    static responseFormats = ['json', 'xml']
    
    GroupController() {
        super(Group)
    }

}
