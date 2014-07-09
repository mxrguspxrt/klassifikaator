package klass

import groovy.json.JsonBuilder

// TODO
// 1. secure params (only types + list of allowed values)
// 2. optmize response with to work with anything
// 3. 

class TriplesController {

    def index() {
        respond_with(models: Triple.getAll())
    }

    def create() {
        def triple = new Triple(triple_params())
        triple.save()
        respond_with(model: triple, status: 201)
    }

    def update() {
        def triple = Triple.findById(params["id"])
        triple.properties = triple_params()
        triple.save(flush: true)
        respond_with(model: triple, status: 200)
    }

    def show() {
        def triple = Triple.findById(params["id"])
        respond_with(model: triple, status: 200)
    }

    def delete() {
        def triple = Triple.findById(params["id"])
        triple.delete()
        respond_with(status: 204)   
    }

    def respond_with(HashMap opts) {
        def json = new JsonBuilder()

        def model = opts["model"]
        def models = opts["models"]

        if(!models && !model) {
            return render(text: "", status: opts["status"])
        }

        if(models) {
            json(triples: models_response(models))
            return render(text: json.toString(), status: opts["status"])
        }

        if(model && model.hasErrors()) {
            json(errors: [had: "error"])
            return render(text: json.toString(), status: 422)
        } 

        if(model && !model.hasErrors()) {
            json(triple: model_response(model))
            return render(text: json.toString(), status: opts["status"])
        }
    }

    def models_response(models) {
        models.collect { model_response(it) }
    }

    def model_response(model) {
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
