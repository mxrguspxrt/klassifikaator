package clssf

class Group {

    static hasMany = [classifications: Classification]

    String name
    String description

    static constraints = {
        name size: 5..15, blank: false, unique: true
        description size: 5..2000, blank: true
    }

    static mapping = {
        table "`group`"
    }

}
