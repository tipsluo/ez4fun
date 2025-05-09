/* Requires the Docker Pipeline plugin */
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'Test Redhat9 agent'
	    script {
	      /*library(
		identifier: 'tipsluo@test', 
		retriever: modernSCM(
                        [$class: 'GitSCMSource',
                         remote: 'https://github.com/tipsluo/ez4fun.git'])
	      )*/
              @Library('ez4fun')
	      def z = new org.mycode.Mors()
              z.print()
	    }
            }
        }
    }
}
