import org.ansible.CloneRepo

def call(String repoUrl) {
    CloneRepo.cloneRepo(repoUrl, this)
}
