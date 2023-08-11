def call(body) {
 
  echo "Start Sonar Scans"
  def scannerHome = tool 'ibt-sonarqube';
  
  withSonarQubeEnv(credentialsId: 'sonar-token-student', installationName: 'IBT sonarqube') {
    bat "${scannerHome}/bin/sonar-scanner"
  }
}
