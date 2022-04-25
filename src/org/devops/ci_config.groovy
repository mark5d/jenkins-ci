package org.devops 

// config {
//     imageRepository = "11111"

//     giblabHost = ""

//     // buildingContainer {
//     //     jdk8-maven3u5u0 = "111111111111"
//     // }
    
// }



class ci_config {
    def imageRepository = "11111"

    def gitlabApiHost = "http://gitlab-headless/api/v4"

    def buildingContainers = [
        "jdk8-maven3u5u0" : "22222"
    ] 
}


