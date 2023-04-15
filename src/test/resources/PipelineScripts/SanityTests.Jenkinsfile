pipeline{
    agent any

    stages{

        stage('git'){
            steps{
                git branch: "${env.BRANCH}", credentialsId: '235a3863-59f6-4e0d-8c3d-ce5cc7ca57fa', url: 'https://github.com/johnlinder92/JenkinsTest.git'
            }
        }
        stage('Sanity'){
            steps{

                      bat 'C:/Tools/gradle-8.1/bin/gradle.bat --refresh-dependencies clean build -x test'
                      bat 'C:/Tools/gradle-8.1/bin/gradle.bat --refresh-dependencies clean Sanity'
            }
        }
    }

}