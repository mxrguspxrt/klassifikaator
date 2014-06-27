Ext.define('Client.controller.Groups', {
    extend: 'Ext.app.Controller',

    views: [
        "groups.List",
        "groups.New"
    ],

    models: [
        'Group'
    ]

});
