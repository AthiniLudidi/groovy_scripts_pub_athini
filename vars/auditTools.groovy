def call(){
  node{
    sh '''
        git version
        docker version
        // dotnet --list-sdks
        // dotnet --list-runtimes
        echo "it ran"
    '''
  }
}

def getVersionNumber(map config){

}
