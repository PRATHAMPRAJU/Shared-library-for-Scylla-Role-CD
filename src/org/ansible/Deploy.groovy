package org.ansible

class Deploy {
    static void deploy(String inventoryPath, String playbookPath, def steps) {
        // Change to the cloned repository directory
        steps.dir('scylla-Role') {
            def result = steps.sh(script: """
                ansible-playbook -i ${inventoryPath} ${playbookPath}
            """, returnStatus: true)

            if (result != 0) {
                steps.echo "Deployment failed with exit code: ${result}"
                steps.error("Deployment failed. Check the logs for details.")
            } else {
                steps.echo "Deployment completed successfully."
            }
        }
    }
}
