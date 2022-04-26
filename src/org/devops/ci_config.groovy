package org.devops 

// config {
//     imageRepository = "11111"

//     giblabHost = ""

//     // buildingContainer {
//     //     jdk8-maven3u5u0 = "111111111111"
//     // }
    
// }



class ci_config {
    def imageRepository = "https://harbor.templete.com/"

    def gitlabApiHost = "http://gitlab-headless.defult/api/v4"
    def gitlabIngressHost = "gitlab.example.com"
    def gitlabHeadlessHost = "gitlab-headless.defult"
    def gitlabAccountCredentialsId = "root"

    def pipelineWith =[ "main" , "qa" , "dev" ]

    def dockerContainer = ""
    def javaBuildContainers = [
        "jdk8-maven3u5u0" : "22222"
    ] 
}


