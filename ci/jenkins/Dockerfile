FROM jenkins/jenkins

USER root

RUN apt-get update; apt-get install docker.io -y; usermod -aG docker jenkins
USER jenkins
COPY .jenkins/plugins.txt /tmp/plugins.txt
RUN jenkins-plugin-cli --plugin-file /tmp/plugins.txt
COPY .jenkins/jobs /usr/share/jenkins/ref/jobs
