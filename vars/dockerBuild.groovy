def call() {
    // Build the docker image using a Dockerfile
    echo "I'm dockerBuild"
    docker.build("${env.IMAGE}")
    // override the latest tag
    docker.build("${env.IMAGE_LATEST}")
}