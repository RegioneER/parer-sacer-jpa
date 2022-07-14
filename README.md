# SACER PA

Questo progetto contiene lo "strato" JPA del progetto SACER, composto dall'insieme di tutti gli entity bean relativi alle tabelle e viste definite sul database. Lo strato JPA era un modulo del progetto sacer che ora è stato scorporato.

## Maven settings.xml

La compilazione del progetto maven, necessita della configurazione di un apposito "mirror" all'interno del settings.xml locale:

```xml
 <mirror>
	  <id>github</id>
	  <name>GitHub eclipselink</name>
	  <url>https://maven.pkg.github.com/RegioneER/parer.sacer.parent</url>
	  <mirrorOf>*,!central,!pentaho</mirrorOf>
   </mirror>
```

ovviamente, oltre a questa sarà necessario configurare, come da indicazioni della guida ufficiale [GitHub](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry), le proprie credenziali (PAT), all'interno del server di riferimento:

```xml
<server>
	<id>github</id>
	<username>USER</username>
	<password>ACCESS_TOKEN</password>
</server>
```
