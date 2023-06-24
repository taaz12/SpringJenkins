pipeline {
agent any
//triggers {
//cron('*/4 * * * *')
//}

stages{
 stage('clone git'){
    steps {
    echo "Getting Project from Git";
    git branch:"main",url:"https://github.com/MarouaMad/javajenkinsdevops.git";
    
    }
 
 }

 stage('Verificationdu version Maven'){
   steps {
      sh "mvn --version"
   }
 }
}

}
