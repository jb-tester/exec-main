project to test exec-maven-plugin

here we have 2 main classes, and 2 different approaches for maven run configurations creating.

for the MainClass executing the exec-maven-plugin configuration is provided in the pom.xml. It sets the executable
name ('java'), the main class name and the parameters to pass to main class. The 'exec:java' run configuration is used
to run in this case, providing the following maven command

```
mvn package exec-maven-plugin:java
```

Note the 'package' goal that should be executed before the plugin goal.

For the second main class i don't provide the explicit plugin configuration in the pom.xml, and pass the plugin
configuration parameters as arguments. See the 'GetInputFromUser_edited' run configuration for the details. Note also
that this application allows to test the user input in console: it prompts user to enter some string and some numbers.
The running console should allow and accept the user input
