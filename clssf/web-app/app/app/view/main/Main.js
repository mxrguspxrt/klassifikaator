Ext.define('Client.view.main.Main', {
    extend: "Ext.container.Viewport",

    layout : {
        type  : 'hbox',
        align : 'stretch'
    },
    
    items : [
        { 
            xtype : 'groups-list' ,
            flex  : 2
        }
    ]
});
