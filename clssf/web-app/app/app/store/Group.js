Ext.define('Client.store.Group', {
    extend: 'Ext.data.Store',

    requires: [
        'Client.model.Group'
    ],
    
    storeId: 'Group',
    
    autoLoad: true,

    autoSync: true,

    model: 'Client.model.Group',

    proxy: {
        type: 'rest',
        url: '/clssf/group',
        reader: {
            type: 'json',
            rootProperty: 'data'
        },
        writer: {
            type: 'json'
        }
    }


});