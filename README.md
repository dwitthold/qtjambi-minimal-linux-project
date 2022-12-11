# qtjambi-minimal-linux-project
A minimal QtJambi app running on linux as a fat JAR.

1. Install Qt, using e.g. the Qt Installer: https://www.qt.io/download-qt-installer
2. Make sure the Version of Qt and the version in the POM match.
3. Build the project: `mvn clean install`
4. Run the app using Qt path as library path.
   * Probably `java -Djava.library.path=/home/USERNAME/Qt/6.4.1/gcc_64/lib/ -jar target/qtjambi-minimal-linux-project-1.0-SNAPSHOT-jar-with-dependencies.jar` if Qt was installed using Qt Installer.

See https://github.com/OmixVisualization/qtjambi and https://github.com/OmixVisualization/qtjambi/blob/master/www/How-to-develop-Qt-in-Java.md for more info.