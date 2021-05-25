/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CollectionModelCar;
import io.swagger.client.model.EntityModelCar;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerEntityApi
 */
@Ignore
public class CustomerEntityApiTest {

    private final CustomerEntityApi api = new CustomerEntityApi();

    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingDELETETest() throws ApiException {
        String carId = null;
        Integer id = null;
        api.customerCustomerUsingDELETE(carId, id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingDELETE1Test() throws ApiException {
        Integer id = null;
        api.customerCustomerUsingDELETE1(id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingGETTest() throws ApiException {
        Integer id = null;
        CollectionModelCar response = api.customerCustomerUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingGET1Test() throws ApiException {
        String carId = null;
        Integer id = null;
        EntityModelCar response = api.customerCustomerUsingGET1(carId, id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingPATCHTest() throws ApiException {
        List<String> body = null;
        Integer id = null;
        CollectionModelCar response = api.customerCustomerUsingPATCH(body, id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingPOSTTest() throws ApiException {
        List<String> body = null;
        Integer id = null;
        CollectionModelCar response = api.customerCustomerUsingPOST(body, id);

        // TODO: test validations
    }
    
    /**
     * customerCustomer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerCustomerUsingPUTTest() throws ApiException {
        List<String> body = null;
        Integer id = null;
        CollectionModelCar response = api.customerCustomerUsingPUT(body, id);

        // TODO: test validations
    }
    
}
