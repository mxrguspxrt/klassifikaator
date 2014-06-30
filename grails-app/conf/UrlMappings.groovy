class UrlMappings {

	static mappings = {

        "/$controller" {
            action = [
              GET: "list",
              POST: "create"
            ]
        }

        "/$controller/$id" {
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
