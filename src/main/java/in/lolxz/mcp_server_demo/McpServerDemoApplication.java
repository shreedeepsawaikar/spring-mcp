package in.lolxz.mcp_server_demo;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class McpServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpServerDemoApplication.class, args);
	}

	@Bean
	public List<ToolCallback> danTools(CourseService courseService,
									   DirectoryService directoryService,
									   UserService userService) {
		List<ToolCallback> tools = new ArrayList<>();
		tools.addAll(Arrays.asList(ToolCallbacks.from(courseService)));
		tools.addAll(Arrays.asList(ToolCallbacks.from(directoryService)));
		tools.addAll(Arrays.asList(ToolCallbacks.from(userService)));
		return tools;
	}

	@Bean
	public RestClient restClient() {
		return RestClient.create("https://jsonplaceholder.typicode.com");
	}
}
