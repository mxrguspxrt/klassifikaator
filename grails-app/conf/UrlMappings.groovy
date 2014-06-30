class UrlMappings {

	static mappings = {

        "/$controller" (controller: "groups") {
            action = [
              GET: "list",
              POST: "create"
            ]
        }

        "/$controller/$id" (controller: "groups") {
            action = [
                GET: "show",
                PUT: "update",
                DELETE: "delete"
            ]
        }
        
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
