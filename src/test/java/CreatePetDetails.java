import io.restassured.http.ContentType;
import org.data.entities.Category;
import org.data.entities.PetDetails;
import org.data.entities.Tags;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatePetDetails {

    @Test
    public void testCreatingAUser() {

        PetDetails petDetails = new PetDetails();

        Category category = new Category();
        category.setId(0);
        category.setName("name");
        petDetails.setCategory(category);

        petDetails.setName("Doggie");

//        String[] photoUrls = {"photoUrl"};
//        petDetails.setPhotoUrls(photoUrls);
//
//        Tags[] tags = new Tags[0];
//        petDetails.setTags(tags);
//
//        petDetails.setStatus("available");

        PetDetails createdPetDetails =

                given().
                        contentType(ContentType.JSON).
                        body(petDetails).
                        log().body().
                        when().
                        post("https://petstore.swagger.io/v2/pet").
                        as(PetDetails.class);

        System.out.println(createdPetDetails.getName());

    }
}
