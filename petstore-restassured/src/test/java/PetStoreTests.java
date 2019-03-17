import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PetStoreTests {
    @Test

    public void getPetId200(){
       RestAssured
                .given()

                .basePath(Config.GET_PET_ENDPOINT)
                .pathParam("id",1)

                .get()
                .then().statusCode(200);

    }
    @Test
    public void getPetId404(){
        RestAssured
                .given()
                .baseUri("https://petstore.swagger.io/v2/pet/f")
                .log().uri()
                .get()
                .then().statusCode(404)
                .and().extract().body();

    }


    private RequestSpecification baseSpecification(){
       return RestAssured.given()
                .baseUri(Config.PETS_TORE_BASE_URI)
                .log().uri();

    }

}
