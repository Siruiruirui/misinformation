java -Dlog4j2.configurationFactory=edu.gmu.mason.vanilla.log.CustomConfigurationFactory -Dlog.rootDirectory=logs -Dsimulation.test=all -jar ../target/vanilla-0.1-jar-with-dependencies.jar -configuration virtual_city_large.properties -until 8640
