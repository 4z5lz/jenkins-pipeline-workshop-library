def call() {
    // calculate GIT lastest commit short-hash
    echo "I'm buildPreparations"
    gitCommitHash = sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
    shortCommitHash = gitCommitHash.take(7)
    // calculate a sample version tag
    env.VERSION = shortCommitHash
    // set the build display name
    currentBuild.displayName = "#${BUILD_ID}-${VERSION}"
    env.IMAGE = "$PROJECT:$VERSION"
    env.IMAGE_LATEST = "$PROJECT:latest"
}