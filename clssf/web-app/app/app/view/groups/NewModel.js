Ext.define('Client.view.groups.NewModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.groups-new',

    data: {
        rec: Ext.create("Client.model.Group")
    }

});
