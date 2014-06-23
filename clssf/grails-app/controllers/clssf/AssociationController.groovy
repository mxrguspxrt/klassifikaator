package clssf
import  grails.rest.*

class AssociationController extends RestfulController {

    static responseFormats = ['json', 'xml']
    
    AssociationController() {
        super(Association)
    }

}
