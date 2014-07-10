Ext.define('Client.model.Base', {
    extend: 'Ext.data.Model',

    schema: {
        namespace: 'Client.model',
        proxy: {
            type: 'rest',
            url: '/klass/triples',       // url: '/klass/{entityName:uncapitalize}',
            reader: {
                type: 'json',
                rootProperty: "triples"
            },
            writer: {
                type: 'json',
                rootProperty: "triple"
            }
        }
    }

});
