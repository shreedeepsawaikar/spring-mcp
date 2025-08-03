package in.lolxz.mcp_server_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    RestClient restClient;

    @GetMapping("/users")
    public ResponseEntity<User> getUsers() {
        ResponseEntity<List<User>> listResponseEntity = restClient.get()
                .uri("/users")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<List<User>>() {
                });

        listResponseEntity.getBody().forEach(System.out::println);

        return null;
    }

}
