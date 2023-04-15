pipeline {
     agent any

    stages {
        stage('SCM') {
            steps {
                git branch: "${env.BRANCH}", credentialsId: '235a3863-59f6-4e0d-8c3d-ce5cc7ca57fa', url: 'https://github.com/johnlinder92/JenkinsTest.git'
            }
        }
        stage('Clean and Build'){
            steps{
                withGradle {
                    bat 'gradle -b ./build.gradle clean build -x test'
                }

            }
        }
        stage('Execution'){
            steps{
                script{
                    bat returnStatus: false, script: 'C:/Tools/gradle-8.1/bin/gradle.bat -i -b ./build.gradle %USE_CASE%'
                }
            }
        }

    }
   post{
        always{
            echo 'Job is done, now copying reports'
        catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS'){
           // reports()
        }

        }
    }
}

