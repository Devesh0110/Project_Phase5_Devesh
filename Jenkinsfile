pipeline {
    agent any 

    triggers {
        pollSCM('* * * * *')
    }

    stages {
        
        stage('Maven Compile') {
            steps {
                echo '----------------- This is a compile phase ----------'
                sh 'mvn clean compile'
            }
        }
        
         stage('Maven Test') {
            steps {
                echo '----------------- This is a compile phase ----------'
                sh 'mvn clean test'
            }
        }
        
        stage('Maven Build') {
             steps {
                echo '----------------- This is a build phase ----------'
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Docker Build') {
            steps {
                echo '----------------- This is a build docker image phase ----------'
                sh '''
                    docker image build -t phase5devesh .
                '''
            }
        }

        stage('Docker Deploy') {
            steps {
                echo '----------------- This is a docker deploment phase ----------'
                sh '''
                 (if  [ $(docker ps -a | grep phase5devesh | cut -d " " -f1) ]; then \
                        echo $(docker rm -f phase5devesh); \
                        echo "---------------- successfully removed phase5devesh ----------------"
                     else \
                    echo OK; \
                 fi;);
            docker container run --restart always --name phase5devesh -p 8081:8081 -d phase5devesh
            '''
            }
        }
    }
}
