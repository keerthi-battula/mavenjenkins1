pipeline {
agent {
docker
{
image 'jenkins/jenkins:lts'
args '-v/root/.m2:/root/.m2'
}
}
stages {
stage ('bulid')
{
steps {
sh 'mvn -B -DskipTests clean package'
}
}
stage ('test')
{
steps 
{
sh 'mvn test'
}

}
}
}
