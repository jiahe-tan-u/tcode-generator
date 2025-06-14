# Docker 镜像构建
# @author <a href="https://github.com/jiahe-tan-u">tanjiahe</a>
# @from <a href="https://tanjiahe.icu">tanjiahe个人博客</a>
FROM maven:3.8.1-jdk-8-slim as builder

# Copy local code to the container image.
WORKDIR /generator
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

# Run the web service on container startup.
CMD ["java","-jar","/generator/target/tcode-generator-web-backend-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]