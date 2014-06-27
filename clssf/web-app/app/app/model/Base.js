Ext.define('Client.model.Base', {
    extend: 'Ext.data.Model',

    fields: [
      { name: 'id', type: 'int' }
    ],

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
