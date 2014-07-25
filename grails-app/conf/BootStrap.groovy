import com.mongodb.Mongo
import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.commons.GrailsApplication
class BootStrap {
//	def mongo
//	GrailsApplication grailsApplication
    def init = { servletContext ->
//		def db = mongo.getDB("phone")
//		File detailFolder = grailsApplication.mainContext.getResource("/phones_data").file
//		detailFolder.listFiles().each {file ->
//			if(file.name.equals("phones.json")) {
//				def jsonList = new JsonSlurper().parseText(file.text)
//				jsonList.each{ obj ->
//					db.phones.insert(obj)
//				}
//			}
//			else if(!file.isHidden()) {
//				def jsonObj = new JsonSlurper().parseText(file.text)
//				db.phoneDetails.insert(jsonObj)
//			}
//		}
    }
    def destroy = {
		
    }
}
