import org.ansible.Deploy

def call(String inventoryPath, String playbookPath) {
    Deploy.deploy(inventoryPath, playbookPath, this)
}
