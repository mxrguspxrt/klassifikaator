Ext.define("Client.view.triples.List", {
    extend: 'Ext.grid.Panel',

    xtype: "triples-list",

    requires: [
      "Client.view.triples.ListController",
      "Client.view.triples.ListModel"
    ],

    title: "Triples",
  
    controller: "triples-list",
  
    viewModel: {
        type: "triples-list"
    },
  
    columns: [
        { text: 'Subject', dataIndex: 'subject' },
        { text: 'Predicate', dataIndex: 'predicate' },
        { text: 'Object', dataIndex: 'object' }
    ],

    store: "Triple"
    
});
