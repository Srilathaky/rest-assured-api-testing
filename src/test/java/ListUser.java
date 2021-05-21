import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ListUser {

    /****************************************************************************************************************************************************
     Test Name : testListUser
     Description : validates listuser API gives response status code as 200 and prints the response of the API
     *****************************************************************************************************************************************************/
    @Test
    public void testListUser(){
       Response response= given().contentType(ContentType.JSON).when()
                .get("https://reqres.in/api/users")
                    .then().assertThat().statusCode(200).and().extract().response();
        System.out.println("response of the list user API is  "+response.asString());

    }
}
