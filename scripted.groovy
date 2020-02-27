node{
    a=10
    stages{
        stage('code pull'){
            step{
                echo "code pulling"
            }

        }
        stage('build'){
            step{
                echo "code pulling"
            }

        }
    }
}