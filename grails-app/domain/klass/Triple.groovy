package klass

class Triple {

    static mapping = { 
        table "`triples`" 
    }

    static constraints = {
        subject blank: false, nullable: false, size: 1..10
        predicate blank: false, nullable: false, size: 1..10
        object blank: false, nullable: false, size: 1..10
        subjectTranslation nullable: true
        predicateTranslation nullable: true
        objectTranslation nullable: true
    }

    static belongsTo = [
        subjectTranslation: Translation,
        predicateTranslation: Translation,
        objectTranslation: Translation
    ]

    Translation subjectTranslation
    Translation predicateTranslation
    Translation objectTranslation

    def translate(String txt) {
        Translation.translate(txt)
    }

    def setSubject(String txt) {
        if(txt) this.subjectTranslation = translate(txt)
    }

    def getSubject() {
        if(this.subjectTranslation) this.subjectTranslation.toString()
    }

    def setPredicate(String txt) {
        if(txt) this.predicateTranslation = translate(txt)
    }

    def getPredicate() {
        if(this.predicateTranslation) this.predicateTranslation.toString()
    }

    def setObject(String txt) {
        if(txt) this.objectTranslation = translate(txt)
    }

    def getObject() {
        if(this.objectTranslation) this.objectTranslation.toString()
    }

}
