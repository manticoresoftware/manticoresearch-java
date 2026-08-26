

# SqlResponse

List of responses from executed SQL queries

## oneOf schemas
* [List<Object>](List<Object>.md)
* [SqlObjResponse](SqlObjResponse.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.SqlResponse;
import com.manticoresearch.client.model.List<Object>;
import com.manticoresearch.client.model.SqlObjResponse;

public class Example {
    public static void main(String[] args) {
        SqlResponse exampleSqlResponse = new SqlResponse();

        // create a new List<Object>
        List<Object> exampleList<Object> = new List<Object>();
        // set SqlResponse to List<Object>
        exampleSqlResponse.setActualInstance(exampleList<Object>);
        // to get back the List<Object> set earlier
        List<Object> testList<Object> = (List<Object>) exampleSqlResponse.getActualInstance();

        // create a new SqlObjResponse
        SqlObjResponse exampleSqlObjResponse = new SqlObjResponse();
        // set SqlResponse to SqlObjResponse
        exampleSqlResponse.setActualInstance(exampleSqlObjResponse);
        // to get back the SqlObjResponse set earlier
        SqlObjResponse testSqlObjResponse = (SqlObjResponse) exampleSqlResponse.getActualInstance();
    }
}
```

