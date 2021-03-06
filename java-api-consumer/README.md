# spring-openapi-generator-api-client

 api person

- API version: 1.0.0

- Build date: 2021-03-23T19:51:44.039603069+05:30[Asia/Colombo]

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.baeldung</groupId>
  <artifactId>spring-openapi-generator-api-client</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.baeldung:spring-openapi-generator-api-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/spring-openapi-generator-api-client-0.0.1-SNAPSHOT.jar`
- `target/lib/*.jar`

## Usage

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.baeldung.petstore.client.invoker.*;
import com.baeldung.petstore.client.api.DefaultApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DefaultApi apiInstance = new DefaultApi(defaultClient);

```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.baeldung.petstore.client.invoker.*;
import com.baeldung.petstore.client.invoker.auth.*;
import com.baeldung.petstore.client.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");
        
        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Object result = apiInstance.operation2DeleteId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation2DeleteId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:9090/api/person*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**operation2DeleteId**](docs/DefaultApi.md#operation2DeleteId) | **DELETE** /{id} | 
*DefaultApi* | [**operation2GetId**](docs/DefaultApi.md#operation2GetId) | **GET** /{id} | 
*DefaultApi* | [**operation3Get**](docs/DefaultApi.md#operation3Get) | **GET** / | 
*DefaultApi* | [**operation3Post**](docs/DefaultApi.md#operation3Post) | **POST** / | 
*DefaultApi* | [**operation3Put**](docs/DefaultApi.md#operation3Put) | **PUT** / | 


## Documentation for Models

 - [Person](docs/Person.md)
 - [PersonInput](docs/PersonInput.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



