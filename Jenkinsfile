node {
    stage('Checkout') {
       git 'https://github.com/PSEH-4/kirantest.git'
    }stage('Package') {
       sh "mvn clean package -DskipTests"
    }stage('Docker build') {
       sh "docker build -t kirankumarpolusani/repo:v2.0.0 ."
    }stage('Docker push') {
       sh "docker login -u kirankumarpolusani -p 1D@ntKn@w"
       sh "docker push kirankumarpolusani/repo:v2.0.0"
    }
    stage('Deploy to staging') {
        sh "docker run -d --rm -p 8080:8080 --name springboot kirankumarpolusani/repo:v2.0.0"
    }

}



