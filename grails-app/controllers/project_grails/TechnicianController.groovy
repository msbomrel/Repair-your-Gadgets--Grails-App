package project_grails

class TechnicianController {

    def index() {
        Service service=new Service();
        [ser: service.findAll()]
    }

    def add(){
        println "PArams are " : params
//        println "{technician.services} = ${params.services}"

        Technician technician=new Technician(params)
//        println "{technician.services} = ${technician.services}"
        for(def service in params.services){
            println "Service id " + service
            technician.addToServices(Service.findById(service))
        }
        println "{technician.services} = ${technician.services}"
        if (technician.validate()){
            technician.save(flush: true)
            render("Successfully saved")
        }else{
            render (view: "index", model:[tech:technician, ser: Service.findAll()])
        }
    }
}
