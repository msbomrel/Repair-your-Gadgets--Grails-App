package project_grails

class Technician {
    String name
    String address
    String contact
    String email
    String experience
    static hasMany = [services:Service]
    static belongsTo = Service


    static constraints = {
        name blank: false, nullable: false
        contact size: 7..10
        email email: true
        experience blank: true, nullable: true
        address blank: true, nullable: true
    }
}
