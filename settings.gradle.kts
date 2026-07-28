pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Noor"

include(":app")
include(":core:common")
include(":core:designsystem")
include(":core:navigation")
include(":core:media")
include(":domain")
include(":data")
include(":baseline-profile")
