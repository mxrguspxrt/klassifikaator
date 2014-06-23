package clssf

class Association {

    static belongsTo = [left: Classification, right: Classification]

    String type

    static constraints = {
        left blank: false
        right blank: false
        type unique: ['left', 'right']
    }

}
