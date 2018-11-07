import annotations.dev
import annotations.local

def environments = [local:local, dev:dev]

def env = System.getProperty("environment")

if (env) {
    try {
        runner {
            include environments[env]
        }
    }
    catch (Exception e) {
        System.out.print("Invalid environment specified -Denvironment must be set to dev or local" + e)
    }
}