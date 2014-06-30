package klass

class Group {

    static mapping = { 
        table "`group`" 
    }

    static constraints = {
        name size: 5..15, blank: false, unique: true
        description size: 5..2000, blank: false
    }

    String name
    String description

}
