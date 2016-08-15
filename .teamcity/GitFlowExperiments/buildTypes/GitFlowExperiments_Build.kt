package GitFlowExperiments.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.BuildStep
import jetbrains.buildServer.configs.kotlin.v10.BuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object GitFlowExperiments_Build : BuildType({
    uuid = "b0e1e790-ea4a-44ed-a93b-6ad5eb17adc6"
    extId = "GitFlowExperiments_Build"
    name = "Build"

    vcs {
        root(GitFlowExperiments.vcsRoots.GitFlowExperiments_HttpsGithubComPil0tGitFlowExperimentsGitRefsHeadsMaster)

    }

    steps {
        step {
            type = "jb.nuget.installer"
            param("nuget.path", "%teamcity.tool.NuGet.CommandLine.DEFAULT%")
            param("sln.path", "GitFlowExperiments/GitFlowExperiments.sln")
        }
        step {
            type = "VS.Solution"
            param("build-file-path", "GitFlowExperiments/GitFlowExperiments.sln")
            param("msbuild_version", "12.0")
            param("toolsVersion", "12.0")
            param("vs.version", "vs2013")
        }
    }

    triggers {
        vcs {
        }
    }
})
