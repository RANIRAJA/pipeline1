pipeline{
    agent any
        stages{
        stage("code pull"){
            steps{
                git credentialsId: 'github', url: 'https://github.com/RANIRAJA/pipeline1.git'
            }
        }
        stage("Build"){
            steps{
                echo 'i am executing build'
            }
        }         
        stage("Test"){
            steps{
                echo 'i am executing test'
            }
        }       
        stage("Deploy"){
            steps{
                echo 'i am executing deploy'
            }
        }    
        stage("status"){
            steps{
                echo 'pipeline execute successfully'
            }
        }    
    }

}    
        