mvn compile

mvn test-compile

mvn test

mvn surefire:test

# WHERE DID THE JARS GO?

pom.xml

# BUT THERE'S NO HAMCREST!

mvn dependency:list

mvn dependency:tree

# HOW DO I RUN MY PROGRAM?

(show POM)

mvn package

java -jar ./target/target.jar

# HOW CREATING A MAVEN PROJECT FROM SCRATCH

mvn archetype:generate -DgroupId=name -DartifactId=name -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# HOW CAN I LEARN MORE ABOUT MAVEN

Start from the Maven resources on the course webpage.

