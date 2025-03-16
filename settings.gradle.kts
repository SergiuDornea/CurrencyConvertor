pluginManagement {
    includeBuild("build-logic")
    includeBuild("C:\\Users\\dorne\\StudioProjects\\CurrencyConvertor\\build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "CurrencyConvertor"
include(":app")
include(":core")
include(":core:network")
include(":core:ui")
include(":core:model")
