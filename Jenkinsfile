pipeline{
	agent any
	
	tools{
		maven 'MAVEN_HOME'
	}
	
	
	
	stages{
		stage('Checkout'){
			steps{
				echo 'Cloning the repository'
				git branch: 'main',url:'https://github.com/TestJenkins7/SamplePractice.git'
				echo 'Cloned'
			}
			
		}
		stage('Build'){
			steps{
				echo 'building the project'
				bat 'mvn clean install'
				echo 'build'
			}
		}
		stage('Test'){
			steps{
				echo 'Running tests..'
				bat 'mvn test'
				echo 'Ran tests..'
			}
			
			
		}
		
	}
	post {
		success {
			echo 'Build completed successfully'
		}
		failure{
			echo'Build failed! check console logs'
		}
	}
}
