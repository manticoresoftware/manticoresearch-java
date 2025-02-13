

# SqlResponse

List of responses from executed SQL queries

## oneOf schemas
* [List<Object>](List<Object>.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.SqlResponse;
import com.manticoresearch.client.model.List<Object>;
import com.manticoresearch.client.model.Object;

public class Example {
    public static void main(String[] args) {
        SqlResponse exampleSqlResponse = new SqlResponse();

        // create a new List<Object>
        List<Object> exampleList<Object> = new List<Object>();
        // set SqlResponse to List<Object>
        exampleSqlResponse.setActualInstance(exampleList<Object>);
        // to get back the List<Object> set earlier
        List<Object> testList<Object> = (List<Object>) exampleSqlResponse.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set SqlResponse to Object
        exampleSqlResponse.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleSqlResponse.getActualInstance();
    }
}
```


