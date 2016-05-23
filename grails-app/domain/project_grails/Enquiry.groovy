package project_grails

class Enquiry {
    Service service
    User user
    String status
    String priority
    Date serviceReqDate
    int hour
    int minute

    static constraints = {
        status inList: ["New", "In Progress", "Solved"]
        priority inList: ["High", "Normal", "Low"]
        hour size: 1..24
        minute size: 1..60
    }
}
