#How to integrate gwt-socialmedia library into a Maven project

# Repository #
If you use Maven to build your project (what i personally recommend) you can easily set your project with gwt-socialmedia by adding the following dependency to your pom.xml:
```
<dependency>
        <groupId>com.tinesoft</groupId>
        <artifactId>gwt-socialmedia-library</artifactId>
        <version>1.0.0</version>
</dependency>
```

The depencency is published on Maven Central. So nothing more is required.

But if you want to use a snapshot (= under development) version of the library, you must add the following in the **`<`repositories`>`** section of your pom.xml:
```
<repository>
        <id>sonatype.snapshots</id>
        <name>Sonatype snapshot repository</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots/</url>  
        <layout>default</layout>
</repository>
```