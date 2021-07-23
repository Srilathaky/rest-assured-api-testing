import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSingleUser {
    /****************************************************************************************************************************************************
     Test Name : testGetSignleUser
     Description : validates single user API gives response status code as 200 and validate the email id
     *****************************************************************************************************************************************************/
    @Test
    public void testGetSignleUser(){
              Response response=given().contentType(ContentType.JSON).
                when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200).and().extract().response();
        System.out.println("response of the list user API is  "+response.asString());

    }
}
