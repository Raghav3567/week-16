import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonParsingTest {

    @Test
    public void validateJsonField() {
        // Send GET request
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");

        // Print response
        System.out.println("Response: " + response.asString());

        // Validate status code
        Assert.assertEquals(response.getStatusCode(), 200);

        // Extract field value from JSON
        String title = response.jsonPath().getString("title");

        // Print extracted value
        System.out.println("Title: " + title);

        // Validate the field value
        Assert.assertEquals(title, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
    }
}


// How to Run

// Open terminal and run:

//mvn test
