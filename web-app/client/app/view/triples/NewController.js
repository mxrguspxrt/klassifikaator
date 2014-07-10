Ext.define('Client.view.groups.NewController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.groups-new',

    createRecord: function(){
        rec = this.getView().getViewModel().getData().rec;
        alert(rec.get("id"));
        rec.save();
        alert(rec.get("id"));
    }
    
});
