package project_grails

class Technician {
    String name
    String address
    String contact
    String email
    String experience
    String jobSpecification
    static hasMany = [services:Services]
    static belongsTo = Services

    static constraints = {
        name blank: false, nullable: false
        contact size: 7..10
        email email: true
    }
}
