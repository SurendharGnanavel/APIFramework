import com.api.automation.Faker.BaseFaker;
import com.api.automation.RequestBuilder.RequestBuilder;
import com.api.automation.pojo;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PostTest {

    @Test
    public void createResource(){
        pojo resource  = pojo
                .builder()
                .setName(new BaseFaker().getFirstname())
                .setJob(new BaseFaker().getjobDetails())
                .build();

        Response response  = RequestBuilder.RequestBuilderforPostCalls()
                .body(resource)
                .post("/users");

        response.prettyPrint();
        assertThat(response.getStatusCode()).isEqualTo(201);
    }

}
