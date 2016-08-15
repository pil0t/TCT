package GitFlowExperiments.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object GitFlowExperiments_HttpsGithubComPil0tTctGit : GitVcsRoot({
    uuid = "a533ed7d-3d0a-4a1d-9344-84d8da33cc35"
    extId = "GitFlowExperiments_HttpsGithubComPil0tTctGit"
    name = "https://github.com/pil0t/TCT.git"
    url = "https://github.com/pil0t/TCT.git"
    authMethod = password {
        userName = "pil0t"
        password = "zxx14e527b2591c04c0b034ffa09d577dc5"
    }
})
