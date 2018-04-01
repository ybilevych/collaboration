pipeline {
  agent any
  stages {
    stage('stage1') {

      parallel {
        stage('stage1a') {
          steps {
            echo 'Stage1a'
          }
        }
        stage('Stage1b') {
          steps {
            echo 'Stage1b'
          }
        }
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
    stage('stage3') {
      steps {
        echo 'hello3'
      }
    }
  }
}