pipeline {
  agent {
    docker {
      image 'maven'
    }
    
  }
  stages {
    stage('Build') {
      steps {
        bat(script: 'mvn -B -DskipTests clean package', returnStatus: true, returnStdout: true)
      }
    }
    stage('stage2') {
      parallel {
        stage('stage2') {
          steps {
            echo 'hello2'
          }
        }
        stage('Stage2b') {
          steps {
            echo 'Stage2b'
          }
        }
        stage('Stage2c') {
          steps {
            echo 'Stage2c'
          }
        }
      }
    }
    stage('Test') {
      steps {
        bat 'mvn clean package'
      }
    }
  }
}