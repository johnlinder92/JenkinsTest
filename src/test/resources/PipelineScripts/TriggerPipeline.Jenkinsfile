pipeline {
    agent any
    stages {
         stage('Sanity')
        {
            steps{
                SanityTests()

            }
        }
        stage('Execution'){
            steps{
                script{

                     def Executors = [:]
                     def json = readJSON(file:'C:/Sogeti/UseCases.json')
                     def usecases = json['UseCases']

                        for (int i = 0; i < usecases.size(); ++i) {
                            int numberOfRetries = 0;
                            def usecase = usecases[i]
                            echo usecase
                            Executors[i]={
                                stage(usecase){
                                        catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                                        retry(RETRY_AMOUNT as Integer){
                                        echo 'Retry number: ' + numberOfRetries
                                        numberOfRetries++
                                            build job: 'TestNGUsecaseRunner',
                                                parameters: [string(name: 'USE_CASE', value:usecase),
                                                    string(name: 'PROGRAM_VERSION', value:params.PROGRAM_VERSION),
                                                    string(name: 'BRANCH', value:params.BRANCH)]
                                        }
                                    }
                                }
                            }
                       }
       parallel Executors
                  }


                }
            }

        }

    post {
        always {
            script{
                if(params.SEND_EMAIL){
                 //   report()
                }

            }
        }
    }
}

def createPaths(){
    bat label: '', script: 'if not exist "C:\\\\Sogeti\\\\Test_Execution_Reports\\\\%PROGRAM_VERSION%\\\\Tests" mkdir "C:\\\\INCA\\\\Test_Execution_Reports\\\\%PROGRAM_VERSION%\\\\Tests"'
    return true
}

def SanityTests(){
    build job: 'SanityTests', propagate: false, wait: false,
                parameters: [string(name: 'BRANCH', value:params.BRANCH),string(name: 'PROGRAM_VERSION', value:params.PROGRAM_VERSION)]
}

