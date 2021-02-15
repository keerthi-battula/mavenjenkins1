pipeline {
agent {
docker
{
image 'maven:4-alpine'
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
