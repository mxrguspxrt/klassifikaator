Ext.define('Client.model.Classification', {
    extend: 'Ext.data.Model',
    
    belongsTo: 'Group',

    fields: [
        { name: 'id', type: 'int' },
        { name: 'groupId', type: 'int' },
        { name: 'name', type: 'auto' },
        { name: 'description', type: 'auto' }
    ],

    proxy: {
        type: 'rest',
        url : '/classification'
    }

});
