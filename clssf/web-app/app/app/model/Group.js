Ext.define('Client.model.Group', {
    extend: 'Ext.data.Model',

    associations: [{
        model: 'Classification',
        type: 'hasMany',
        autoLoad: false
    }],
    
    fields: [
        { name: 'id', type: 'int' },
        { name: 'name', type: 'auto' },
        { name: 'description', type: 'auto' }
    ],

    proxy: {
        type: 'rest',
        url : '/group'
    }

});
