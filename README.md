# JOSM Maproulette Plugin

The JOSM Maproulette Plugin attempts to make (some) functionallity of [maproulette][maproulette] available in the [JOSM][josm] editor used to edit [Open Street Map][osm].

As of this writing this plugin is not more than a shell and nothing really is implemented ;)

## Maproulette API

The plugin utelizes the API exposed under [https://maproulette.org/docs/swagger-ui/index.html#/](https://maproulette.org/docs/swagger-ui/index.html#/)

The API code can be generated by running the following

```bash
wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.35/swagger-codegen-cli-3.0.35.jar -O swagger-codegen-cli-3.0.35.jar

# Get Help
# java -jar swagger-codegen-cli-3.0.35.jar config-help -l java
# java -jar swagger-codegen-cli-3.0.35.jar generate --help


cat << EOF > swagger-codegen-config.json
{
  "licenseName": "GPL-v2.0",
  "licenseUrl": "https://choosealicense.com/licenses/gpl-2.0/",
  "artifactUrl": "https://github.com/TheSnoozer/josm-maproulette",
  "artifactDescription": "Generated API classes for the Maproulette API under https://maproulette.org/docs/swagger-ui/index.html#/. Generated via https://github.com/swagger-api/swagger-codegen",
  "scmConnection": "scm:git:git@github.com:TheSnoozer/josm-maproulette.git",
  "scmDeveloperConnection": "scm:git:git@github.com:TheSnoozer/josm-maproulette.git",
  "scmUrl": "https://github.com/TheSnoozer/josm-maproulette",
  "java8": "true",
  "useGzipFeature": "true"
}
EOF

rm -rf maproulette-api

java -jar swagger-codegen-cli-3.0.35.jar generate \
   -i https://maproulette.org/assets/swagger.json \
   -l java \
   --group-id=io.github.thesnoozer \
   --artifact-id=maproulette-api \
   --artifact-version=1.0.0 \
   --library=jersey2 \
   --api-package="io.github.thesnoozer.maproulette.client.api" \
   --model-package="io.github.thesnoozer.maproulette.client.model" \
   -c swagger-codegen-config.json \
   -o maproulette-api

# Workaround for https://github.com/swagger-api/swagger-codegen/issues/11951
sed -i "s#<url>http://www.apache.org/licenses/</url>#<url>https://choosealicense.com/licenses/gpl-2.0/</url>#" maproulette-api/pom.xml

# Workaround for https://github.com/swagger-api/swagger-codegen/issues/11952
sed -i "s#apply plugin: 'maven'#apply plugin: 'maven-publish'#" maproulette-api/build.gradle
sed -i -e '/install {/,+4d' maproulette-api/build.gradle
sed -i 's#compile "#implementation: "#' maproulette-api/build.gradle
sed -i 's#testCompile "#testImplementation: "#' maproulette-api/build.gradle

```

# Contributing
- The source code is hosted on GitHub
- Issues and merge requests are managed in GitHub
- Translation? Not needed yet

# Versioning
This project follows [Semantic Versioning 2.0.0](https://semver.org).

Given a version number `MAJOR.MINOR.PATCH` the following will be incremented:
- `MAJOR` version when there are incompatible API changes
- `MINOR` version when there is functionality added in a backwards compatible manner
- `PATCH` version when there are backwards compatible bug fixes

Additional labels for pre-release and build metadata might be used as extension to the `MAJOR.MINOR.PATCH` format.

# Disclaimer
The project author is not affiliated with [maproulette][maproulette] nor [JOSM][josm].

# License
Published under GPL Version 2 and higher. See included [LICENSE](LICENSE) file.


[osm]:http://www.openstreetmap.org
[josm]:http://josm.openstreetmap.de/
[maproulette]:https://maproulette.org/
