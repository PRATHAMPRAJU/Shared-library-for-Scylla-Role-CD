package org.ansible

class CloneRepo {
    static void cloneRepo(String repoUrl, def steps) {
        def result = steps.sh(script: "git clone ${repoUrl}", returnStatus: true)

        if (result != 0) {
            steps.echo "Cloning repository failed with exit code: ${result}"
            steps.error("Failed to clone the repository. Check the logs for details.")
        } else {
            steps.echo "Repository cloned successfully."
        }
    }
}
