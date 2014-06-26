package clssf
import  grails.rest.*

class ClassificationController extends RestfulController {

    static responseFormats = ['json', 'xml']
    
    ClassificationController() {
        super(Association)
    }

    def test() {
        render "test yo";
    }

}
