# README
Visit my [Gitlab](https://gitlab.com/modaslam "gitlab.com/modaslam") for more.

###Steps

* Copy your React project into the **frontend** folder (as defined by `<fileset dir="${project.basedir}/frontend/build" />` under **maven-antrun-plugin** in the **pom.xml**).<br/>  

* In the **pom.xml** file, under execution configuration for **frontend-maven-plugin**, make sure to use the **npm** and **node** versions as appropriate for your project.<br/>  

* If using `server.servlet.context-path` in your **application.yml** or **application.properties** file, you need to add the same context path as `homepage` in your **package.json** file. eg: If `server.servlet.context-path=/reactspringcontainer` then the corresponding key-value pair in your package.json should be `"homepage": "/reactspringcontainer"`.<br/>   

* Use `mvn clean install` to build your project jar file and use `java -jar artifact-name.jar` to execute from the **target** folder. 



