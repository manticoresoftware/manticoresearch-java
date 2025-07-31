

# HighlightFields

List of fields available for highlighting

## oneOf schemas
* [List<String>](List<String>.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.HighlightFields;
import com.manticoresearch.client.model.List<String>;
import com.manticoresearch.client.model.Object;

public class Example {
    public static void main(String[] args) {
        HighlightFields exampleHighlightFields = new HighlightFields();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set HighlightFields to List<String>
        exampleHighlightFields.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleHighlightFields.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set HighlightFields to Object
        exampleHighlightFields.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleHighlightFields.getActualInstance();
    }
}
```


