package project_grails

class User {

    String name
    String address
    String contact_no
    String email
    String password

    static hasMany = [enquiry: Enquiry]

    static constraints = {
        name blank:false
        contact_no size : 7..10, unique : true
        email email: true, blank: false
        password password:true
    }
}
