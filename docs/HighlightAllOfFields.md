

# HighlightAllOfFields

List of fields available for highlighting

## anyOf schemas
* [List<String>](List<String>.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.HighlightAllOfFields;
import com.manticoresearch.client.model.List<String>;
import com.manticoresearch.client.model.Object;

public class Example {
    public static void main(String[] args) {
        HighlightAllOfFields exampleHighlightAllOfFields = new HighlightAllOfFields();

        // create a new List<String>
        List<String> exampleList<String> = new List<String>();
        // set HighlightAllOfFields to List<String>
        exampleHighlightAllOfFields.setActualInstance(exampleList<String>);
        // to get back the List<String> set earlier
        List<String> testList<String> = (List<String>) exampleHighlightAllOfFields.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set HighlightAllOfFields to Object
        exampleHighlightAllOfFields.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleHighlightAllOfFields.getActualInstance();
    }
}
```


