Ext.define('Client.model.Base', {
    extend: 'Ext.data.Model',

    schema: {
        namespace: 'Client.model',
        proxy: {
            type: 'rest',
            url: '/klass/{entityName:uncapitalize}s',
            reader: {
                type: 'json',
                rootProperty: 'data'
            },
            writer: {
                type: 'json'
            }
        }
    }

});
