def call(){
    docker.withRegistry("https://registry.hub.docker.com", "dockerHub")
    {
        echo "I'm finishPublish"
        // version eq latest git tag
        docker.image("${env.IMAGE}").push()
        // override the latest tag
        docker.image("${env.IMAGE_LATEST}").push()
    }
}