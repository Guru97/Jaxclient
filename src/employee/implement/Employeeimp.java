
package employee.implement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Employeeimp", targetNamespace = "http://implement.employee/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Employeeimp {


    /**
     * 
     * @param arg0
     * @return
     *     returns employee.implement.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDetails", targetNamespace = "http://implement.employee/", className = "employee.implement.GetDetails")
    @ResponseWrapper(localName = "getDetailsResponse", targetNamespace = "http://implement.employee/", className = "employee.implement.GetDetailsResponse")
    @Action(input = "http://implement.employee/Employeeimp/getDetailsRequest", output = "http://implement.employee/Employeeimp/getDetailsResponse")
    public Employee getDetails(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
