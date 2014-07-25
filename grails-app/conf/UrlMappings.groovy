class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
		"/phones/phones.json" {
			controller = "phones"
		}
		
		"/phones/${phoneId}.json" {
			controller = "phones"
			action = "showPhone"
		}

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
