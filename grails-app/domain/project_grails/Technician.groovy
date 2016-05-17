package project_grails

class Technician {
    String name
    String contact
    String jobSpecification
    static hasMany = [services:Services]
    static constraints = {
    }
}
