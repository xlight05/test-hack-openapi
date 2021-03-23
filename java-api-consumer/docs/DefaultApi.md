# DefaultApi

All URIs are relative to *http://localhost:9090/api/person*

Method | HTTP request | Description
------------- | ------------- | -------------
[**operation2DeleteId**](DefaultApi.md#operation2DeleteId) | **DELETE** /{id} | 
[**operation2GetId**](DefaultApi.md#operation2GetId) | **GET** /{id} | 
[**operation3Get**](DefaultApi.md#operation3Get) | **GET** / | 
[**operation3Post**](DefaultApi.md#operation3Post) | **POST** / | 
[**operation3Put**](DefaultApi.md#operation3Put) | **PUT** / | 



## operation2DeleteId

> Object operation2DeleteId(id)



### Example

```java
// Import classes:
import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.invoker.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class Example {
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

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## operation2GetId

> Object operation2GetId(id)



### Example

```java
// Import classes:
import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.invoker.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            Object result = apiInstance.operation2GetId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation2GetId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## operation3Get

> List&lt;Object&gt; operation3Get()



### Example

```java
// Import classes:
import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.invoker.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<Object> result = apiInstance.operation3Get();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation3Get");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |


## operation3Post

> Object operation3Post(personInput)



### Example

```java
// Import classes:
import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.invoker.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PersonInput personInput = new PersonInput(); // PersonInput | 
        try {
            Object result = apiInstance.operation3Post(personInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation3Post");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personInput** | [**PersonInput**](PersonInput.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |


## operation3Put

> Object operation3Put(person)



### Example

```java
// Import classes:
import com.baeldung.petstore.client.invoker.ApiClient;
import com.baeldung.petstore.client.invoker.ApiException;
import com.baeldung.petstore.client.invoker.Configuration;
import com.baeldung.petstore.client.invoker.model.*;
import com.baeldung.petstore.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9090/api/person");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Person person = new Person(); // Person | 
        try {
            Object result = apiInstance.operation3Put(person);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#operation3Put");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **person** | [**Person**](Person.md)|  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful |  -  |

