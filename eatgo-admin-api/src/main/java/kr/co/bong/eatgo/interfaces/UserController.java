package kr.co.bong.eatgo.interfaces;

import kr.co.bong.eatgo.application.UserService;
import kr.co.bong.eatgo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> list() {
        List<User> users = userService.getUsers();
        return users;
    }

    @PostMapping("/users")
    public ResponseEntity<?> create(@RequestBody User resource) throws URISyntaxException {
        String email = resource.getEmail();
        String name = resource.getName();

        User user = userService.addUser(email,name);

        URI location = new URI("/users/"+user.getId());

        return ResponseEntity.created(location).body("{}");
    }

    @PatchMapping("/users/{id}")
    public String update(@PathVariable("id") Long id,@RequestBody User resource){
        String email = resource.getEmail();
        String name = resource.getName();
        Long level = resource.getLevel();
        userService.updateUser(id,email,name,level);
        return "{}";
    }

    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.deactiveUser(id);
        return "{}";
    }
}
