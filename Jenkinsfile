pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -DskipTests clean package'
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