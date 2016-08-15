package GitFlowExperiments

import GitFlowExperiments.buildTypes.*
import GitFlowExperiments.vcsRoots.*
import GitFlowExperiments.vcsRoots.GitFlowExperiments_HttpsGithubComPil0tTctGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "e568afb7-2f74-452f-80de-3f04f8258202"
    extId = "GitFlowExperiments"
    parentId = "_Root"
    name = "GitFlowExperiments"

    vcsRoot(GitFlowExperiments_HttpsGithubComPil0tTctGit)
    vcsRoot(GitFlowExperiments_HttpsGithubComPil0tGitFlowExperimentsGitRefsHeadsMaster)

    buildType(GitFlowExperiments_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = GitFlowExperiments_HttpsGithubComPil0tTctGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
