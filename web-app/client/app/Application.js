/**
 * The main application class. An instance of this class is created by app.js when it calls
 * Ext.application(). This is the ideal place to handle application launch and initialization
 * details.
 */
Ext.define('Client.Application', {
    extend: 'Ext.app.Application',
    
    name: 'Client',

    models: [
        "Triple"
    ],

    stores: [
        "Triple"
    ],

    controllers: [
        "Triples"
    ],
    
    launch: function () {
    },
    
    autoCreateViewport: 'Client.view.main.Main'

});
