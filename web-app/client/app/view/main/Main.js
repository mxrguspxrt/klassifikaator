Ext.define('Client.view.main.Main', {
    extend: "Ext.container.Viewport",

    layout : {
        type  : 'hbox',
        align : 'stretch'
    },
    
    items : [
        { 
            xtype : 'triples-list',
            flex  : 1
        },
        { 
            xtype : 'triples-new',
            flex  : 1
        }

    ]
});
