

# ResponseError

## oneOf schemas
* [ResponseErrorDetails](ResponseErrorDetails.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.ResponseError;
import com.manticoresearch.client.model.ResponseErrorDetails;
import com.manticoresearch.client.model.String;

public class Example {
    public static void main(String[] args) {
        ResponseError exampleResponseError = new ResponseError();

        // create a new ResponseErrorDetails
        ResponseErrorDetails exampleResponseErrorDetails = new ResponseErrorDetails();
        // set ResponseError to ResponseErrorDetails
        exampleResponseError.setActualInstance(exampleResponseErrorDetails);
        // to get back the ResponseErrorDetails set earlier
        ResponseErrorDetails testResponseErrorDetails = (ResponseErrorDetails) exampleResponseError.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ResponseError to String
        exampleResponseError.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleResponseError.getActualInstance();
    }
}
```

