package be.botanico.services.usermanagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UsermanagementApplicationTests {

    private static final String DUMMY_USER_LIST = "[{\"lastName\":\"janssens\",\"firstNames\":[\"johan\",\"albert\"],\"id\":1,\"emails\":[\"johny@botanico.be\",\"johan.janssens@botanico.be\"]},{\"lastName\":\"waterslaeghers\",\"firstNames\":[\"zulma\",\"magda\"],\"id\":2,\"emails\":[\"zulma@botanico.be\"]},{\"lastName\":\"doe\",\"firstNames\":[\"john\"],\"id\":3,\"emails\":[\"john.doe@botanico.be\"]},{\"lastName\":\"smith\",\"firstNames\":[\"john\",\"zulma\"],\"id\":4,\"emails\":[\"john@botanico.be\",\"john.smith@botanico.be\"]}]";

    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUsersList() {
        this.webTestClient.get().uri("/users").exchange().expectStatus().isOk().expectBody(String.class).isEqualTo(DUMMY_USER_LIST);
    }

}
