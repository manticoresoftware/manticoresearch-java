

# KnnQuery

## oneOf schemas
* [List<BigDecimal>](List<BigDecimal>.md)
* [String](String.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.KnnQuery;
import com.manticoresearch.client.model.List<BigDecimal>;
import com.manticoresearch.client.model.String;

public class Example {
    public static void main(String[] args) {
        KnnQuery exampleKnnQuery = new KnnQuery();

        // create a new List<BigDecimal>
        List<BigDecimal> exampleList<BigDecimal> = new List<BigDecimal>();
        // set KnnQuery to List<BigDecimal>
        exampleKnnQuery.setActualInstance(exampleList<BigDecimal>);
        // to get back the List<BigDecimal> set earlier
        List<BigDecimal> testList<BigDecimal> = (List<BigDecimal>) exampleKnnQuery.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set KnnQuery to String
        exampleKnnQuery.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleKnnQuery.getActualInstance();
    }
}
```

