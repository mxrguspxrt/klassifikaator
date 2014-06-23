package clssf

class Classification {

    static belongsTo = [group: Group]

    String name
    String description

    static constraints = {
        name size: 5..15, blank: false, unique: true
        description size: 5..2000, blank: true
    }

}
