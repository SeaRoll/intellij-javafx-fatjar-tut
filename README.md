# How to create a fat jar in Intellij 2021 and Maven.

### 1. Create a intellij JavaFX application
Create a new javafx project using these parameters. the language should be java
build system should be Maven and test framework can be whatever.
![img](../../Pictures/steps/1.png)


### 2. Create a Super main inside the same package as your normal main file
Intellij does not seem to like the fact to run a main file which extends
to an another class.
![](../../Pictures/steps/2.png)


### 3. Rename the entry file inside pom.xml
We must now specify in pom.xml to point to the super main that we created.
Inside the plugin org.openjfx, change the name inside mainClass tag to the super
main and its package
![](../../Pictures/steps/3.png)


### 4. Add shaded plugin to maven
This plugin will create a "shaded" jar, which means that it will put all necessary
class files from external libraries into the jar. under the openjfx plugin,
put maven-shade-plugin. (see this repository's pom.xml to copy-paste)
![](../../Pictures/steps/4.png)


### 5. Run Maven package
Now that's left is to run the package command for our maven project!
NOTE: You have to run package two times. the first time will create the original
jar file whilst the second run will create the shaded-jar. After this has been run,
you will now see a shaded jar inside your target folder.
![](../../Pictures/steps/5.png)


### 6. Run the jar!
now you can run the jar file by using this:
![](../../Pictures/steps/6.png)


### 7. Simple FAQ:

#### Q: What if I need to rebuild the jar?
You can rebuild the jar by running the clean command and then package two times again
#### Q: How do I run my javafx application inside IntelliJ?
Go to maven control panel -> plugins -> javafx -> javafx:run
