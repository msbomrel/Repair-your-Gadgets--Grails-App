package project_grails

class Service {
    String type
    static hasMany = [technician:Technician, enquiry:Enquiry]
    static constraints = {
        type nullable: false, blank: false
    }
//    String toString(){
//        return type
//    }
}
