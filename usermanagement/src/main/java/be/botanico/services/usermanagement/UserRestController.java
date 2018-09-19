package be.botanico.services.usermanagement;

import be.botanico.services.usermanagement.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class UserRestController {

    @RequestMapping("/users")
    public List<User> getUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(User.builder().emails(Arrays.asList("johny@botanico.be", "johan.janssens@botanico.be")).firstNames(Arrays.asList("johan", "albert")).lastName("janssens").id(1L).build());
        //noinspection SpellCheckingInspection
        users.add(User.builder().emails(Collections.singletonList("zulma@botanico.be")).firstNames(Arrays.asList("zulma", "magda")).lastName("waterslaeghers").id(2L).build());
        users.add(User.builder().emails(Collections.singletonList("john.doe@botanico.be")).firstNames(Collections.singletonList("john")).lastName("doe").id(3L).build());
        users.add(User.builder().emails(Arrays.asList("john@botanico.be", "john.smith@botanico.be")).firstNames(Arrays.asList("john", "zulma")).lastName("smith").id(4L).build());
        return users;
    }

}
