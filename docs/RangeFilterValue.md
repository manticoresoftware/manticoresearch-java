

# RangeFilterValue

## oneOf schemas
* [BigDecimal](BigDecimal.md)
* [String](String.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import com.manticoresearch.client.model.RangeFilterValue;
import com.manticoresearch.client.model.BigDecimal;
import com.manticoresearch.client.model.String;

public class Example {
    public static void main(String[] args) {
        RangeFilterValue exampleRangeFilterValue = new RangeFilterValue();

        // create a new BigDecimal
        BigDecimal exampleBigDecimal = new BigDecimal();
        // set RangeFilterValue to BigDecimal
        exampleRangeFilterValue.setActualInstance(exampleBigDecimal);
        // to get back the BigDecimal set earlier
        BigDecimal testBigDecimal = (BigDecimal) exampleRangeFilterValue.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set RangeFilterValue to String
        exampleRangeFilterValue.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleRangeFilterValue.getActualInstance();
    }
}
```


