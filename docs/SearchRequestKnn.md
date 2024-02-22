

# SearchRequestKnn

## oneOf schemas
* [KnnQueryByDocId](KnnQueryByDocId.md)
* [KnnQueryByVector](KnnQueryByVector.md)

## Example
```java
// Import classes:
import com.manticoresearch.client.model.SearchRequestKnn;
import com.manticoresearch.client.model.KnnQueryByDocId;
import com.manticoresearch.client.model.KnnQueryByVector;

public class Example {
    public static void main(String[] args) {
        SearchRequestKnn exampleSearchRequestKnn = new SearchRequestKnn();

        // create a new KnnQueryByDocId
        KnnQueryByDocId exampleKnnQueryByDocId = new KnnQueryByDocId();
        // set SearchRequestKnn to KnnQueryByDocId
        exampleSearchRequestKnn.setActualInstance(exampleKnnQueryByDocId);
        // to get back the KnnQueryByDocId set earlier
        KnnQueryByDocId testKnnQueryByDocId = (KnnQueryByDocId) exampleSearchRequestKnn.getActualInstance();

        // create a new KnnQueryByVector
        KnnQueryByVector exampleKnnQueryByVector = new KnnQueryByVector();
        // set SearchRequestKnn to KnnQueryByVector
        exampleSearchRequestKnn.setActualInstance(exampleKnnQueryByVector);
        // to get back the KnnQueryByVector set earlier
        KnnQueryByVector testKnnQueryByVector = (KnnQueryByVector) exampleSearchRequestKnn.getActualInstance();
    }
}
```


