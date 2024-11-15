Pipeline {
    agent any
    stages {
        stage("Cleanup"){
            steps {
                deleteDir()
            }
        }
        stage("Clone repo"){
            steps{
                sh "git clone https://github.com/Kratos-33/Git-practice.git"
            }
        }
        stage("Build"){
            steps{
                dir("Good"){
                    sh "mvn clean install"
                }
            }
        }
        stage("Test"){
            steps{
                dir("Test"){
                    sh "mvn test"
                }
            }
        }
    }
}