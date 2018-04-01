pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      parallel {
        stage('Functional test') {
          steps {
            bat 'mvn clean package'
          }
        }
        stage('UI test') {
          steps {
            echo 'UI tests'
          }
        }
        stage('Performance Tests') {
          steps {
            echo 'Performance Tests'
          }
        }
      }
    }
    stage('Make decision') {
      steps {
        input(message: 'Can deploy?', ok: 'Yes')
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploy'
      }
    }
  }
}