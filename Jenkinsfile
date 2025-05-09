/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.9.9-eclipse-temurin-21-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'Test Redhat9 agent'
	    script {
	      library(
		identifier: 'tipsluo@test', 
		retriever: modernSCM(
                        [$class: 'GitSCMSource',
                         remote: 'https://github.com/yourOrg/tipsluo.git'])
	      )
	      def z = new org.mycode.Mors()
              z.print()
            }
	    }
        }
    }
}
