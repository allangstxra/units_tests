pipeline {
    agent any

    tools {
        maven 'mvn'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}