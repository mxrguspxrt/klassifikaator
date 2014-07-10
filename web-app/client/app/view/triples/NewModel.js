Ext.define('Client.view.triples.NewModel', {
    extend: 'Ext.app.ViewModel',

    alias: 'viewmodel.triples-new',

    data: {
        rec: Ext.create("Client.model.Triple")
    }

});
