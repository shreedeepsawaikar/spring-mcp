package in.lolxz.mcp_server_demo;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class UserService {

    @Autowired
    RestClient restClient;

    @Tool(name = "get_users", description = "Get users all from api")
    public List<User> getUsers() {
        return restClient.get()
                .uri("/users")
                .retrieve()
                .toEntity(new ParameterizedTypeReference<List<User>>() {
                }).getBody();
    }

//    @Tool(name = "get_user", description = "Get users all from api")
//    public User getUser(int id) {
//        return restClient.get()
//                .uri("/users/" + id)
//                .retrieve()
//                .toEntity(new ParameterizedTypeReference<User>() {})
//                .getBody();
//    }


}
