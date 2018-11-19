This instruction for MAC OS

Tools installation
You need to download and install:
 - 'Community' version of Intellij IDEA (https://www.jetbrains.com/idea/download/#section=mac);
 - JDK 10.0.2 (https://www.oracle.com/technetwork/java/javase/downloads/index.html);
 - Firefox  the latest version (https://www.mozilla.org/en-US/firefox/62.0/releasenotes/);
 - Chrome the latest version https://www.google.com/chrome/
 - Download and install git;
 - Download and install maven;


Tools setup
- You must make sure that this program are installed correctly, open the terminal and enter:
- 'java-version',
- 'git - version'
- 'mvm -version'
- Download geckodriver for mac os from https://github.com/mozilla/geckodriver/releases and put it in a folder /usr/local/bin

Project:
src/test/java/page - contains pages with describing web elements and methods
src/test/java/test - contains tests scenarios

pom.xml - this is file wich described the entire project structure and contains information about the project and various configuration details that Maven uses to create the project for example dependencies or plugins.

.gitignore - files this is files which conteins modules which can't be run.

parallel-search-tests.xml - script with executing tests  scenarios in different browsers

How open project and run:

1.Copy the git link to the project https://github.com/InnaYu/
2.Open IntelliJ IDEA
3.Insert the link and download the project
4.Download all the necessary libraries and choose java 10
5.Open terminal in Intellij IDEA
6.Enter mvn clean install -DsuiteXmlFile=parallel-search-tests.xml
