package GitFlowExperiments.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object GitFlowExperiments_HttpsGithubComPil0tGitFlowExperimentsGitRefsHeadsMaster : GitVcsRoot({
    uuid = "2296c879-5781-4b21-9cb5-2f086254a523"
    extId = "GitFlowExperiments_HttpsGithubComPil0tGitFlowExperimentsGitRefsHeadsMaster"
    name = "https://github.com/pil0t/GitFlowExperiments.git#refs/heads/master"
    url = "https://github.com/pil0t/GitFlowExperiments.git"
    authMethod = password {
        userName = "pil0t"
        password = "zxx989b25d753223608"
    }
})
