# Developing Demo Java Program in LAB System
- Author: `Anthoniraj Amalanathan`
- Date: 27-July-2023
- Login to your LAB Desktop
	- username: batch1
	- password: Check the LAB Notice Board
## OpenJDK
- 1995: Java (JDK 1.0) was developed by James Gosling in Sun Microsystem
- 2007: JDK was released as open source
- 2010: Oracle acquired Sun
- JDK: OpenJDK comes in many flavors
	- Oracle JDK
	- Microsoft OpenJDK
	- Amazon Correcto
	- Eclipse Temurin	
	- Belsoft OpenJDK
## Editor/IDE
- Popular editors for Java
	- IntelliJ IDE
	- Eclipse IDE
	- Visual Code Editor (VS Code)
## Developing Simple Java Program using VS Code Editor
- Check JDK in your OS
	- Goto Command Prompt
	- Type `java -version`
	- If JDK version is displayed then Java is installed in your machine
- Open Visual Studio Code Editor from Start Menu
- Select `Open Folder` from `File` Menu in VS Code
- Create new file Icon and name the Java Program `Demo.java`
```java
class Demo{
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
	}
}
```
- Open `New Terminal` from `Terminal menu` in VS Code 
- Run the following commands in VS Code Terminal
	- Compile the Java Code: `javac Demo.java`
	- Run the Class File: `java Demo`

## Command Line Arguments
- Command Line arguments can be passed as input while running Java Program
```java
class Demo{
	public static void main(String[] args) {
		System.out.println(args[0]); //prints Welcome from command line input
	}
}
```
- Run the following commands in VS Code Terminal
	- Compile the Java Code: `javac Demo.java`
	- Run the Class File: `java Demo Welcome`
- `Welcome` is the input value passed through command line to args[]

