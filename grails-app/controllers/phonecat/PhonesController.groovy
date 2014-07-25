

package phonecat

import com.mongodb.BasicDBObject
import com.mongodb.DBCursor
import com.mongodb.Mongo

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON
import grails.transaction.Transactional
import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.web.json.JSONArray
import org.codehaus.groovy.grails.web.json.JSONObject

class PhonesController {
	def mongo
	def index() {
		def db = mongo.getDB("phone")
		JSONArray persons = new JSONArray()
		DBCursor cursor = db.phones.find()
		try {
			while(cursor.hasNext()) {
				persons.add(cursor.next() as JSON)
			}
		} finally {
		cursor.close()
		}
		response.setContentType('application/json')
		render persons
		
	}
	def showPhone() {
		def db = mongo.getDB("phone")
		println params.phoneId
		def json = db.phoneDetails.findOne(id: params.phoneId) as JSON
		render json
	}
	

}
