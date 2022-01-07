package sonarqubegroovy


import grails.rest.*
import grails.converters.*

class IndexController {
	static responseFormats = ['json', 'xml']
    private String teste = "teste"
	
    def index() { }

    def teste(){
        new BigDecimal(5)
        new BigDecimal(5)
        new BigDecimal(5)
        new BigDecimal(5)
    }
    def teste2(){
        new BigDecimal(5)
        new BigDecimal(5)
        new BigDecimal(5)
        new BigDecimal(5)
    }

}
