def call(String Sonarpath , String Name , String Key){
withSonarQubeEnv("$Sonarpath"){
sh "${Sonar_Home}/bin/sonar-scanner -Dsonar.projectName = ${Name} -Dsonar.projectKey = ${Key}"
}
}
