
Ext.define("Client.view.groups.List",{
    extend: 'Ext.grid.Panel',

    xtype: "groups-list",

    requires: [
      "Client.view.groups.ListController",
      "Client.view.groups.ListModel"
    ],

    title: "Groups",
  
    controller: "groups-list",
  
    viewModel: {
        type: "groups-list"
    },
  
    columns: [
        { text: 'Name', dataIndex: 'name' },
        { text: 'Description', dataIndex: 'description' }
    ],

    store: "Group"
    
});
