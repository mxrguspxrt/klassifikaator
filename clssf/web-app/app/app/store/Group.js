Ext.define('Client.store.Group', {
    extend: 'Client.store.Base',

    requires: [
        'Client.model.Group'
    ],
    
    storeId: 'Group',
    
    model: 'Client.model.Group'

});