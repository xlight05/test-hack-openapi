package com.baeldung.petstore.client;

import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.api.DefaultApi;
import com.baeldung.petstore.client.model.Person;
import com.baeldung.petstore.client.model.PersonInput;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            System.out.println("Sending Posts");
            PersonInput personInput1 = new PersonInput();
            personInput1.setFname("Anjana");
            personInput1.setLname("Supun");
            personInput1.setAge(23);
            Object result1 = apiInstance.operation3Post(personInput1);
            System.out.println(result1);

            PersonInput personInput2 = new PersonInput();
            personInput2.setFname("Light");
            personInput2.setLname("Yagami");
            personInput2.setAge(23);
            Object result2 = apiInstance.operation3Post(personInput2);
            System.out.println(result2);

            System.out.println("Getting all docs");
            for (Object o : apiInstance.operation3Get()) {
                System.out.println(o);
            }
            
            System.out.println("Getting first doc");
            Object o = apiInstance.operation2GetId(0);
            System.out.println(o);

            System.out.println("Getting updating docs");
            Person newPerson = new Person();
            newPerson.setId(0);
            newPerson.setFname("New");
            newPerson.setLname("Supun");
            newPerson.setAge(23);
            apiInstance.operation3Put(newPerson);

            System.out.println("Getting all docs again");
            for (Object obj : apiInstance.operation3Get()) {
                System.out.println(obj);
            }

            System.out.println("Deleting stuff bois");
            Object delete = apiInstance.operation2DeleteId(1);
            System.out.println(delete);

            System.out.println("Getting all docs again");
            for (Object obj : apiInstance.operation3Get()) {
                System.out.println(obj);
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation3Post");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
