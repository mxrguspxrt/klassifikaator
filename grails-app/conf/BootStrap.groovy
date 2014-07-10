class BootStrap {

    def init = { servletContext ->
        if(klass.Triple.count() > 0) return false

        def triples_data = [
            ["Color", "type", "Class"],
            ["Red", "is a", "Color"],
            ["Green", "is a", "Color"],
            ["Car", "type", "Class"],
            ["Car", "has one", "Color"],
            ["Ivani auto", "is a", "Car"],
            ["Ivani auto", "has color", "Red"]
        ]

        triples_data.collect {
            new klass.Triple(subject: it[0], predicate: it[1], object: it[2]).save()
        }

    }

    def destroy = {
    }

}
