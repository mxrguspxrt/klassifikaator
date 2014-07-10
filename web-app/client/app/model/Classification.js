Ext.define('Client.model.Classification', {
    extend: 'Client.model.Base',

    fields: [
        { name: 'group_id', reference: 'Group' },
        { name: 'name', type: 'auto' },
        { name: 'description', type: 'auto' }
    ]

});
