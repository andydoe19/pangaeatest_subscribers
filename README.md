# Pangaea Test Subscribers Server
> Test subscribers' server for Pangaea
---
This is a test subscribers' server for Pangaea written in java using Micronaut framework.
This server will receive messages forwarded to it from the Pangaea Test Subscription Server.<br />
Therefore this server works hand in hand with the Pangaea Test Subscription Server 
and receives messages from the subscription server anytime they are fired.<br /><br />

## Development Language
**Java programming language**

## Framework
**Micronaut** - A recent framework of java that employs AoT and other features 
for developing responsive and fast microservices. More about Micronaut are below;<br /><br />

## Requirments
1. Java SDK (version 8)
2. Micronaut Client
3. IntelliJ IDEA
4. Git<br /><br />

## Project Setup
After cloning the project with Git, open IntelliJ and Click on File > Open.
Navigate to "pangaeatest_subscriptionserver" project and open it. 

When asked by IntelliJ to enable auto import for gradle, enable it. 
Else if project hasn't started importing gradle dependencies, click on Gradle tab on the far right,
and click on the "reimport all projects" button (looks like a refresh icon). <br /><br />

## Running the Project
After all dependencies are imported, you can use any of the actions below to run or test the project.
You can run them terminal tab at the lower section of the IntelliJ IDE;

> CLEAN AND BUILD PROJECT
```
$ gradlew clean build
```

> RUN PROJECT
```
$ gradlew run
```

After running the project has run successfully using the `run project` command above,
you can test the project with the url - http://localhost:8000 <br /><br />

## Testing
To check if the test subscriber endpoints receive the message anytime the publish API is fired from the subscription server,
you open the terminal tab, found at the lower section of the IntelliJ IDE, and you will see the message or post data sent from the publish API.

<br/><br/>
***Thats all and Have fun trying out this project!!!***