pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat(script: 'mvn -B -DskipTests clean package', returnStatus: true, returnStdout: true)
      }
    }
    stage('Test') {
      steps {
        bat 'mvn clean package'
      }
    }
    stage('Deploy') {
      steps {
        bat 'echo Deploy'
      }
    }
  }
}