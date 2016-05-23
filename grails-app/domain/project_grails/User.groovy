package project_grails

class User {

    String name
    String address
    String phone_no
    String telephone_no
    String email

    static hasMany = [enquiry: Enquiry]

    static constraints = {
        name blank:false

        phone_no size : 10, unique : true
        telephone_no size: 7, unique: true
        email email: true, blank: false
    }
}
