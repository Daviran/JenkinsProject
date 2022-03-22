folder('tools') {
    description: "Folder for miscellanous tools."
}
job('clone-repository') {
    parameters {
        stringParam('GIT_REPOSITORY_URL', 'Git URL of the repository to clone')
    }
    wrappers {
        preBuildCleanup()
    }
    steps {
        shell('git clone ${GIT_REPOSITORY_URL}')
    }
    
}
job('SEED') {
    parameters {
        stringParam('GITHUB_NAME', 'GitHub repository owner/repo_name (e.g.: "EpitechIT31000/chocolatine")')
        stringParam('DISPLAY_NAME', 'Display name for the job')
    }