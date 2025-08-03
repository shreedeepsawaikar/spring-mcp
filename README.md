# Spring MCP Server

A Model Context Protocol (MCP) server implementation built with Spring Boot and Java. This project demonstrates how to create an MCP server that provides tools, resources, and prompts to AI assistants like Claude Desktop.

## What is MCP?

The Model Context Protocol (MCP) is an open standard that enables developers to build secure, two-way connections between their data sources and AI-powered tools. It allows AI assistants to interact with local and remote resources through standardized server implementations.

## Prerequisites

- Java 21 or higher
- Maven 3.6+ or Gradle 7+
- Claude Desktop application

## Quick Start

### 1. Clone the Repository

```bash
git clone https://github.com/shreedeepsawaikar/spring-mcp.git
cd spring-mcp
```

### 2. Build the Project

Using Maven:
```bash
mvn clean install
```

Using Gradle:
```bash
./gradlew build
```

### 3. Run the MCP Server

```bash
mvn spring-boot:run
```

Or using the JAR file:
```bash
java -jar target/spring-mcp-*.jar
```

The server will start and be available for MCP connections.

## Claude Desktop Integration

### 1. Install Claude Desktop

Download and install Claude Desktop from [Anthropic's website](https://claude.ai/desktop).

### 2. Configure MCP Server in Claude Desktop

Add your Spring MCP server to Claude Desktop's configuration:

**On macOS:**
Edit `~/Library/Application Support/Claude/claude_desktop_config.json`

**On Windows:**
Edit `%APPDATA%\Claude\claude_desktop_config.json`

Add your server configuration:

```json
{
  "mcpServers": {
    "spring-mcp": {
      "command": "java",
      "args": [
        "-jar",
        "/path/to/your/spring-mcp-server.jar"
      ],
      "env": {
        "SPRING_PROFILES_ACTIVE": "mcp"
      }
    }
  }
}
```

### 3. Alternative: STDIO Configuration

For STDIO transport (recommended for desktop use):

```json
{
  "mcpServers": {
    "spring-mcp": {
      "command": "java",
      "args": [
        "-jar",
        "/path/to/your/spring-mcp-server.jar",
        "--spring.ai.mcp.server.transport=stdio"
      ]
    }
  }
}
```

### 4. Restart Claude Desktop

Close and reopen Claude Desktop. Your Spring MCP server should now be available, and you'll see the tools in Claude's interface.

### 5. Testing the Connection

Once configured, you can test your MCP server by asking Claude Desktop to:

1. **List available tools**: "What tools do you have access to?"
2. **Use your custom tools**: "Can you get the list of users?" (if you implemented a user management tool)
3. **Check server status**: Claude will show connected MCP servers in its interface

## Troubleshooting

### Common Issues

1. **Server not starting**: Check Java version (21+ required)
2. **Claude Desktop not connecting**: Verify JSON configuration syntax
3. **Tools not appearing**: Check server logs for registration errors
4. **Permission issues**: Ensure Claude Desktop has access to the JAR file path

### Debug Mode

Enable debug logging in `application.yml`:

```yaml
logging:
  level:
    org.springframework.ai.mcp: DEBUG
    com.example.springmcp: DEBUG
```
