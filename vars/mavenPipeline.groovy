def call() {
    pipeline {
        agent any

        stages {
            stage("Clean") {
                steps {
                    script {
                        maven(["clean"])
                    }
                }
            }

            stage("Compile") {
                steps {
                    script {
                        maven(["compile"])
                    }
                }
            }

            stage("Test") {
                steps {
                    script {
                        maven(["test"])
                    }
                }
            }
        }
    }
}
