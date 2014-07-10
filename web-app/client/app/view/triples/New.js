Ext.define("Client.view.groups.New", {
    extend: 'Ext.panel.Panel',

    xtype: "groups-new",

    requires: [
      "Client.view.groups.NewController",
      "Client.view.groups.NewModel"
    ],

    title: "New Group",
  
    controller: "groups-new",
  
    viewModel: {
        type: "groups-new"
    },

    items : [
        {
            xtype      : 'textfield',
            bind       : '{rec.name}',
            fieldLabel : 'Name'
        },
        {
            xtype      : 'textfield',
            bind       : '{rec.description}',
            fieldLabel : 'Description'
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
