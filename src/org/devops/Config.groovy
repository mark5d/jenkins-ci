package org.devops 

// config {
//     imageRepository = "11111"

//     giblabHost = ""

//     // buildingContainer {
//     //     jdk8-maven3u5u0 = "111111111111"
//     // }
    
// }



class Config {
    def imageRepository = "11111"

    def buildingContainers = [
        "jdk8-maven3u5u0" : "22222"
    ] 
}


