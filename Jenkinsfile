/* Requires the Docker Pipeline plugin */
@Library('ez4fun') _
pipeline {
    agent any
    stages {
        stage('build') {
          steps{
	    script {
	      /*library(
		identifier: 'tipsluo@test', 
		retriever: modernSCM(
                        [$class: 'GitSCMSource',
                         remote: 'https://github.com/tipsluo/ez4fun.git'])
	      )*/
	      def z = new org.mycode.Mors()
              z.print1(this)
	    }
        }
      }
    }
}
