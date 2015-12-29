# example-boutique-app

```console
  $ git clone https://github.com/rzen/example-boutique-app.git example-bq
 Cloning into 'example-bq'...
 remote: Counting objects: 14, done.
 remote: Compressing objects: 100% (9/9), done.
 remote: Total 14 (delta 0), reused 10 (delta 0), pack-reused 0
 Unpacking objects: 100% (14/14), done.
 Checking connectivity... done.
  $ cd example-bq
  $ mvn package
 Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=256m; support was removed in 8.0
 Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=512m; support was removed in 8.0
 [INFO] Scanning for projects...
 [INFO]
 [INFO] ------------------------------------------------------------------------
 [INFO] Building bq-app 1.0-SNAPSHOT
 [INFO] ------------------------------------------------------------------------
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.4.2/maven-shade-plugin-2.4.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.4.2/maven-shade-plugin-2.4.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/28/maven-plugins-28.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/28/maven-plugins-28.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/27/maven-parent-27.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/27/maven-parent-27.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/apache/17/apache-17.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/apache/17/apache-17.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.4.2/maven-shade-plugin-2.4.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/2.4.2/maven-shade-plugin-2.4.2.jar (0 B at 0.0 KB/sec)
 [INFO]
 [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ bq-app ---
 [INFO] Using 'UTF-8' encoding to copy filtered resources.
 [INFO] skip non existing resourceDirectory /Users/rzen/Documents/nhllink/code/example-bq/src/main/resources
 [INFO]
 [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ bq-app ---
 [INFO] Changes detected - recompiling the module!
 [INFO] Compiling 1 source file to /Users/rzen/Documents/nhllink/code/example-bq/target/classes
 [INFO]
 [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ bq-app ---
 [INFO] Using 'UTF-8' encoding to copy filtered resources.
 [INFO] skip non existing resourceDirectory /Users/rzen/Documents/nhllink/code/example-bq/src/test/resources
 [INFO]
 [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ bq-app ---
 [INFO] No sources to compile
 [INFO]
 [INFO] --- maven-surefire-plugin:2.19:test (default-test) @ bq-app ---
 Downloading: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom
 Downloaded: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar
 Downloading: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.2.1/maven-plugin-api-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/2.2.1/maven-settings-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-descriptor/2.2.1/maven-plugin-descriptor-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-project/2.2.1/maven-project-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact-manager/2.2.1/maven-artifact-manager-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-profile/2.2.1/maven-profile-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/2.2.1/maven-artifact-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/junit/junit/4.12/junit-4.12.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-registry/2.2.1/maven-plugin-registry-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/2.2.1/maven-repository-metadata-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/2.2.1/maven-model-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/2.2.1/maven-core-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-parameter-documenter/2.2.1/maven-plugin-parameter-documenter-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-error-diagnostics/2.2.1/maven-error-diagnostics-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-monitor/2.2.1/maven-monitor-2.2.1.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-toolchain/2.2.1/maven-toolchain-2.2.1.jar (0 B at 0.0 KB/sec)
 [INFO] No tests to run.
 [INFO]
 [INFO] --- maven-jar-plugin:2.6:jar (default-jar) @ bq-app ---
 Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.4/plexus-io-2.4.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/2.4/plexus-io-2.4.jar (0 B at 0.0 KB/sec)
 [INFO] Building jar: /Users/rzen/Documents/nhllink/code/example-bq/target/bq-app-1.0-SNAPSHOT.jar
 [INFO]
 [INFO] --- maven-shade-plugin:2.4.2:shade (default) @ bq-app ---
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.2/asm-5.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.2/asm-5.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/5.0.2/asm-parent-5.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/5.0.2/asm-parent-5.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.2/asm-commons-5.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.2/asm-commons-5.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.2/asm-tree-5.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.2/asm-tree-5.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.2/maven-dependency-tree-2.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.2/maven-dependency-tree-2.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/vafer/jdependency/1.0/jdependency-1.0.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/vafer/jdependency/1.0/jdependency-1.0.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.3/asm-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.3/asm-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/5.0.3/asm-parent-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-parent/5.0.3/asm-parent-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.pom
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/11.0.2/guava-11.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/11.0.2/guava-11.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/11.0.2/guava-parent-11.0.2.pom
 Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/11.0.2/guava-parent-11.0.2.pom (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar
 Downloading: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.0/maven-core-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-inject-plexus/1.4.2/sisu-inject-plexus-1.4.2.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.0/maven-settings-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model/3.0/maven-model-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.0/maven-settings-builder-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.0/maven-model-builder-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-spi/1.7/aether-spi-1.7.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.0/maven-aether-provider-3.0.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-impl/1.7/aether-impl-1.7.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-beta-6/wagon-provider-api-1.0-beta-6.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/sonatype/aether/aether-api/1.7/aether-api-1.7.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.2.3/plexus-classworlds-2.2.3.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-compat/3.0/maven-compat-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.2/asm-5.0.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/wagon/wagon-provider-api/1.0-beta-6/wagon-provider-api-1.0-beta-6.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.2/asm-commons-5.0.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.0/maven-artifact-3.0.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.2/asm-tree-5.0.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.0.22/plexus-utils-3.0.22.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/5.0.2/asm-commons-5.0.2.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.jar
 Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.2/maven-dependency-tree-2.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/5.0.2/asm-5.0.2.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/vafer/jdependency/1.0/jdependency-1.0.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/5.0.2/asm-tree-5.0.2.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/2.2/maven-dependency-tree-2.2.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/jdom/jdom/1.1/jdom-1.1.jar (0 B at 0.0 KB/sec)
 Downloading: https://repo.maven.apache.org/maven2/com/google/guava/guava/11.0.2/guava-11.0.2.jar
 Downloaded: https://repo.maven.apache.org/maven2/org/vafer/jdependency/1.0/jdependency-1.0.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/com/google/guava/guava/11.0.2/guava-11.0.2.jar (0 B at 0.0 KB/sec)
 Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.0/maven-repository-metadata-3.0.jar (0 B at 0.0 KB/sec)
 [INFO] Including com.nhl.bootique:bootique:jar:0.10 in the shaded jar.
 [INFO] Including com.google.inject:guice:jar:4.0 in the shaded jar.
 [INFO] Including javax.inject:javax.inject:jar:1 in the shaded jar.
 [INFO] Including aopalliance:aopalliance:jar:1.0 in the shaded jar.
 [INFO] Including com.google.guava:guava:jar:16.0.1 in the shaded jar.
 [INFO] Including com.google.inject.extensions:guice-multibindings:jar:4.0 in the shaded jar.
 [INFO] Including com.fasterxml.jackson.core:jackson-databind:jar:2.6.4 in the shaded jar.
 [INFO] Including com.fasterxml.jackson.core:jackson-annotations:jar:2.6.0 in the shaded jar.
 [INFO] Including com.fasterxml.jackson.core:jackson-core:jar:2.6.4 in the shaded jar.
 [INFO] Including com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:jar:2.6.4 in the shaded jar.
 [INFO] Including org.yaml:snakeyaml:jar:1.15 in the shaded jar.
 [INFO] Including net.sf.jopt-simple:jopt-simple:jar:4.9 in the shaded jar.
 [INFO] Including com.nhl.bootique.jersey:bootique-jersey:jar:0.8 in the shaded jar.
 [INFO] Including org.glassfish.jersey.containers:jersey-container-servlet:jar:2.21 in the shaded jar.
 [INFO] Including org.glassfish.jersey.containers:jersey-container-servlet-core:jar:2.21 in the shaded jar.
 [INFO] Including org.glassfish.jersey.core:jersey-common:jar:2.21 in the shaded jar.
 [INFO] Including javax.annotation:javax.annotation-api:jar:1.2 in the shaded jar.
 [INFO] Including org.glassfish.jersey.bundles.repackaged:jersey-guava:jar:2.21 in the shaded jar.
 [INFO] Including org.glassfish.hk2:osgi-resource-locator:jar:1.0.1 in the shaded jar.
 [INFO] Including org.glassfish.jersey.core:jersey-server:jar:2.21 in the shaded jar.
 [INFO] Including org.glassfish.jersey.core:jersey-client:jar:2.21 in the shaded jar.
 [INFO] Including org.glassfish.jersey.media:jersey-media-jaxb:jar:2.21 in the shaded jar.
 [INFO] Including javax.validation:validation-api:jar:1.1.0.Final in the shaded jar.
 [INFO] Including javax.ws.rs:javax.ws.rs-api:jar:2.0.1 in the shaded jar.
 [INFO] Including org.glassfish.hk2:hk2-api:jar:2.4.0-b31 in the shaded jar.
 [INFO] Including org.glassfish.hk2:hk2-utils:jar:2.4.0-b31 in the shaded jar.
 [INFO] Including org.glassfish.hk2:hk2-locator:jar:2.4.0-b31 in the shaded jar.
 [INFO] Including org.javassist:javassist:jar:3.18.1-GA in the shaded jar.
 [INFO] Including com.nhl.bootique.jetty:bootique-jetty:jar:0.8 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-server:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including javax.servlet:javax.servlet-api:jar:3.1.0 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-http:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-util:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-io:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-servlet:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including org.eclipse.jetty:jetty-security:jar:9.3.6.v20151106 in the shaded jar.
 [INFO] Including org.slf4j:slf4j-api:jar:1.7.13 in the shaded jar.
 [INFO] Including com.nhl.bootique.logback:bootique-logback:jar:0.7 in the shaded jar.
 [INFO] Including ch.qos.logback:logback-classic:jar:1.1.3 in the shaded jar.
 [INFO] Including ch.qos.logback:logback-core:jar:1.1.3 in the shaded jar.
 [INFO] Including org.slf4j:jul-to-slf4j:jar:1.7.13 in the shaded jar.
 [INFO] Replacing original artifact with shaded artifact.
 [INFO] Replacing /Users/rzen/Documents/nhllink/code/example-bq/target/bq-app-1.0-SNAPSHOT.jar with /Users/rzen/Documents/nhllink/code/example-bq/target/bq-app-1.0-SNAPSHOT-shaded.jar
 [INFO] Dependency-reduced POM written at: /Users/rzen/Documents/nhllink/code/example-bq/dependency-reduced-pom.xml
 [INFO] ------------------------------------------------------------------------
 [INFO] BUILD SUCCESS
 [INFO] ------------------------------------------------------------------------
 [INFO] Total time: 7.425 s
 [INFO] Finished at: 2015-12-28T21:50:35-05:00
 [INFO] Final Memory: 36M/566M
 [INFO] ------------------------------------------------------------------------
  $ java -jar target/bq-app-1.0-SNAPSHOT.jar --server
 INFO  [2015-12-29 02:51:42,223] main c.n.b.j.c.ServerCommand: Starting jetty...
 INFO  [2015-12-29 02:51:42,283] main o.e.jetty.util.log: Logging initialized @729ms
 INFO  [2015-12-29 02:51:42,301] main c.n.b.j.s.ServerFactory: Adding servlet mapped to /*
 INFO  [2015-12-29 02:51:42,322] main o.e.j.server.Server: jetty-9.3.z-SNAPSHOT
 INFO  [2015-12-29 02:51:42,971] main o.e.j.s.h.ContextHandler: Started o.e.j.s.ServletContextHandler@1d71006f{/,null,AVAILABLE}
 INFO  [2015-12-29 02:51:42,993] main o.e.j.s.ServerConnector: Started ServerConnector@6f80fafe{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
 INFO  [2015-12-29 02:51:42,993] main o.e.j.server.Server: Started @1442ms
```
