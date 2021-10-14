# How to create a fat jar in Intellij 2021 and Maven.

### 1. Create a intellij JavaFX application
Create a new javafx project using these parameters. the language should be java
build system should be Maven and test framework can be whatever.
![1](https://user-images.githubusercontent.com/26680151/137301177-46ec379f-bdcc-4d24-bfbb-a9c2787a94bd.png)


### 2. Create a Super main inside the same package as your normal main file
Intellij does not seem to like the fact to run a main file which extends
to an another class.
![2](https://user-images.githubusercontent.com/26680151/137301191-880abb49-1a16-4e74-9fa1-88be72738113.png)


### 3. Rename the entry file inside pom.xml
We must now specify in pom.xml to point to the super main that we created.
Inside the plugin org.openjfx, change the name inside mainClass tag to the super
main and its package
![3](https://user-images.githubusercontent.com/26680151/137301200-7636a1cc-cbb8-4234-b8b3-8a6def05cf5d.png)


### 4. Add shaded plugin to maven
This plugin will create a "shaded" jar, which means that it will put all necessary
class files from external libraries into the jar. under the openjfx plugin,
put maven-shade-plugin. (see this repository's pom.xml to copy-paste)
![4](https://user-images.githubusercontent.com/26680151/137301215-60e03da2-db2b-4056-83c4-f2b54c6945ab.png)


### 5. Run Maven package
Now that's left is to run the package command for our maven project!
NOTE: You have to run package two times. the first time will create the original
jar file whilst the second run will create the shaded-jar. After this has been run,
you will now see a shaded jar inside your target folder.
![5](https://user-images.githubusercontent.com/26680151/137301227-bcffae9b-a267-4d5e-b937-d5839b8335e3.png)


### 6. Run the jar!
now you can run the jar file by using this:
![6](https://user-images.githubusercontent.com/26680151/137301241-7dba83e7-72f6-4294-8a4d-1d278ad7eb1d.png)


### 7. Simple FAQ:

#### Q: What if I need to rebuild the jar?
You can rebuild the jar by running the clean command and then package two times again
#### Q: How do I run my javafx application inside IntelliJ?
Go to maven control panel -> plugins -> javafx -> javafx:run
