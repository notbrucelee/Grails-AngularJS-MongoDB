// environment specific settings
environments {
    development {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "phone"
            }
        }
    }
    test {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "phone"
            }
        }
    }
    production {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "phone"
            }
        }
    }
}