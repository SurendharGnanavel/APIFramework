import com.api.automation.Constants.FrameworkContants;
import com.api.automation.RequestBuilder.RequestBuilder;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.*;


import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.assertThat;

public class getTests {

    @Test
    public void getResources(){
        Response response =  RequestBuilder.RequestBuilderforGetCalls()
                .get("/users");
        response.prettyPrint();

        assertThat(response.getStatusCode()).isEqualTo(200);

    }

    @Test
    public void getResourcesSchemaValidator(){
        Response response =  RequestBuilder.RequestBuilderforGetCalls()
                .get("/users");
        response.prettyPrint();

        assertThat(response.getStatusCode()).isEqualTo(200);
        response.then().body(JsonSchemaValidator.matchesJsonSchema(new File(FrameworkContants.getInstance().getGetSchemaFilePath())));

    }

    @Test
    public void getResource(){
        Response response =  RequestBuilder.RequestBuilderforGetCalls()
                .pathParams("id","2")
                .get("/users/{id}");
        response.prettyPrint();
        assertThat(response.getStatusCode()).isEqualTo(200);
        assertThat(response.body().jsonPath().getInt("data.id")).isEqualTo(2);

    }
}
