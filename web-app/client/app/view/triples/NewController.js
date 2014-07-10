Ext.define('Client.view.triples.NewController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.triples-new',

    createRecord: function(){
        rec = this.getView().getViewModel().getData().rec;
        alert(rec.get("id"));
        rec.save();
        alert(rec.get("id"));
    }
    
});
