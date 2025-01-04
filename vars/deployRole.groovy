def call(String inventoryPath, String playbookPath) {
    org.ansible.Deploy.deploy(inventoryPath, playbookPath, this)
}
