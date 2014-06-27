
Ext.define("Client.view.groups.List",{

    requires: [
      "Client.view.groups.ListController",
      "Client.view.groups.ListModel"
    ],

    extend: "Ext.panel.Panel",
  
    controller: "groups-list",
  
    viewModel: {
        type: "groups-list"
    },
  
    html: "Hello, World!!"

});
