Ext.define("Client.view.triples.New", {
    extend: 'Ext.panel.Panel',

    xtype: "triples-new",

    requires: [
      "Client.view.triples.NewController",
      "Client.view.triples.NewModel"
    ],

    title: "New Triple",
  
    controller: "triples-new",
  
    viewModel: {
        type: "triples-new"
    },

    items : [
        {
            xtype      : 'textfield',
            bind       : '{rec.subject}',
            fieldLabel : 'Subject'
        },
        {
            xtype      : 'textfield',
            bind       : '{rec.predicate}',
            fieldLabel : 'Predicate'
        },
        {
            xtype      : 'textfield',
            bind       : '{rec.object}',
            fieldLabel : 'Object'
        },
        {
            xtype  : 'button',
            text   : 'Save',
            listeners: {
                click: "createRecord"
            }
        }
    ]
    
});
