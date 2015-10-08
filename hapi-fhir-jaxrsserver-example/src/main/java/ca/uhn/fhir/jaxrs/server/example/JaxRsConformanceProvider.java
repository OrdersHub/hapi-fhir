package ca.uhn.fhir.jaxrs.server.example;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ca.uhn.fhir.rest.server.Constants;

/**
 * Conformance Rest Service
 * @author Peter Van Houte
 */
//@Local
//@Path(ConformanceRestServer.PATH)
//@Stateless
//@Produces({MediaType.APPLICATION_JSON, Constants.CT_FHIR_JSON, Constants.CT_FHIR_XML})
public class JaxRsConformanceProvider
{
    private static final String SERVER_VERSION = "1.0.0";
    private static final String SERVER_DESCRIPTION = "Jax-Rs Test Example Description";
    private static final String SERVER_NAME = "Jax-Rs Test Example";
    
    @EJB
    private JaxRsConformanceProvider conformanceRestServer;
    @EJB
    private IJaxRsPatientProvider patientRestServer;
    
//    public ConformanceRestServer() {
//        super(SERVER_DESCRIPTION, SERVER_NAME, SERVER_VERSION);
//    }
//
//    @PostConstruct
//    public void createMethod()
//            throws Exception {
//        findResourceMethods(conformanceRestServer, ConformanceRestServer.class);
//        findResourceMethods(patientRestServer, FhirPatientRestServer.class);
//        super.setUpPostConstruct();
//    }
}
