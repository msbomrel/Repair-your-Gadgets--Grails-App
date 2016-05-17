package project_grails

class Services {
    String type
    static hasMany = [technician:Technician]
    static constraints = {
    }
}
