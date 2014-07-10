Ext.define('Client.model.Triple', {
    extend: 'Client.model.Base',

    fields: [
        { name: 'subject', type: 'auto' },
        { name: 'predicate', type: 'auto' },
        { name: 'object', type: 'auto' }
    ]

});
