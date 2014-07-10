Ext.define('Client.controller.Triples', {
    extend: 'Ext.app.Controller',

    views: [
        "triples.List",
        "triples.New"
    ],

    models: [
        'Triple'
    ]

});
