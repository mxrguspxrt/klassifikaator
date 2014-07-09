class UrlMappings {

	static mappings = {

        "/$controller" {
            action = [
              GET: "index",
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
