/* Requires the Docker Pipeline plugin */
pipeline {
    agent { docker { image 'maven:3.9.9-eclipse-temurin-21-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'Test Redhat9 agent'
            }
	    script {
	      library identifier: 'my-lib@main', retriever: modernSCM(
                        [$class: 'GitSCMSource',
                         remote: scm.userRemoteConfigs[0].url])
	      def z = new org.mycode.Mors()
              z.print()
            }
        }
    }
}
