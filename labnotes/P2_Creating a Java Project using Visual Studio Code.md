# Creating a Java Project using Visual Studio Code
- Author: `Anthoniraj Amalanathan`
- Date: 28-07-2023

Visual Studio Code  (VS Code) is the simple and lightweight editor that can be customized for any programming language. Microsoft provides a powerful VS Code plugin for Java Development. You need a stable JDK for developing Java Project.
- Java Development Kit (JDK):  `Bell Soft OpenJDK version 17`
- Editor: `VS Code`

## Install Bell Soft OpenJDK
Download and install OpenJDK from the official website (64-Bit Full JDK)
- https://download.bell-sw.com/java/17.0.3.1+2/bellsoft-jdk17.0.3.1+2-windows-amd64-full.msi
- After installing the JDK, Go to `Command window and check the java version,
	- `java -version`

## Setting up the VS Code Editor
- Download Link: https://code.visualstudio.com/download
- After installing VS Code, Navigate `extension icon` and search by typing the keyword `java`
- Install `Extension Pack for Java` plugin from Microsoft
![vscode_01](https://raw.githubusercontent.com/anthoniraj/java_fall_2022_23/master/images/vscode_java_project_01.png)

## Create a Java Project
- Press Ctrl+Shift+P -> Search `java` in popup then choose `Java: Create Java Project` option
![vscode_02](https://raw.githubusercontent.com/anthoniraj/java_fall_2022_23/master/images/vscode_java_project_02.png)
- Select `No Build Tools`
- Now `Choose the workspace directory` for your java project
- Input `Java Project Name` E.g. `Demo` and then `press Enter to confirm`
- Enable `Trust the authors of all files in the parent folder` and press `I trust the authors` button

## Run the Java Code
- Navigate `App.java` in `src` folder of your Java project
- you can find `Run` option before main method of App.java
- Just Click `Run` to execute the Java Program
![vscode_03](https://raw.githubusercontent.com/anthoniraj/java_fall_2022_23/master/images/vscode_java_project_03.png)