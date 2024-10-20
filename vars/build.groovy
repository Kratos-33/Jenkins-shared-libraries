def call(String Imagename , String Imagetag){
    echo "This is Build stage"
    sh "docker build -t ${Imagename}:${Imagetag} ."
}
