package klass

class TriplesController {

    def index() {

    }

    def create() {
        def triple = new Triple(triple_params())
        triple.save()
        respond_with(model: triple, status: 201)
    }

    def respond_with(HashMap opts) {
        def model = opts["model"]
        def models = opts["models"]

        if(models) {
            def response_models = models.collect { filter_response(it) }
            return render(contentType: "application/json") {
                triples = response_models
            }
        }

        if(model.hasErrors()) {
            return render(contentType: "application/json") {
                errors = model.errors
            }
        } else {
            def response_model = filter_response(model)
            return render(contentType: "application/json") {
                triple = response_model
            }
        }
    }

    def filter_response(model) {
        [
            id: model.id, 
            subject: model.subject,
            predicate: model.predicate, 
            object: model.object
        ]
    }

    def triple_params() {
        def obj = request.JSON.triple
    }

}
