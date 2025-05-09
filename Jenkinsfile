/* Requires the Docker Pipeline plugin */
@Library('ez4fun')
import org.mycode.*
pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo Test Redhat9 agent'
	    script {
	      /*library(
		identifier: 'tipsluo@test', 
		retriever: modernSCM(
                        [$class: 'GitSCMSource',
                         remote: 'https://github.com/tipsluo/ez4fun.git'])
	      )*/
	      def z = new Mors()
              z.print()
	    }
            }
        }
    }
}
