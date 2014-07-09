package klass

class Translation {

    static mapping = { 
        table "`translations`" 
    }

    static constraints = {
        txt blank: false
    }

    static translate(String txt) {
        def translation = Translation.findByTxt(txt)
        if(translation) return translation

        def newTranslation = new Translation(txt: txt)
        newTranslation.save(flush: true)
        newTranslation
    }

    String txt

    String toString() {
        txt
    }

}
