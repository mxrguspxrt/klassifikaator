Ext.define('Client.model.Base', {
    extend: 'Ext.data.Model',

    schema: {
        namespace: 'Client.model',
        proxy: {
            type: 'rest',
            url: '/clssf/{entityName:uncapitalize}',
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
