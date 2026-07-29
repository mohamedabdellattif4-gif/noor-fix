# Noor — Android Quran App

Noor is an offline-first Android application built with Kotlin, Jetpack Compose,
Material 3, Clean Architecture, MVVM, Hilt, Room, Media3, DataStore, and
WorkManager.

## Toolchain

- JDK 17
- Gradle 9.4.1
- Android SDK Platform 37
- Android Build Tools 36.0.0

## Common commands

```bash
./gradlew test
./gradlew lintDebug
./gradlew :app:assembleDebug
python3 tools/verify_final.py
```

The release signing keystore and all signing credentials must remain outside
the repository. See `RELEASE_SIGNING.md` and `docs/RELEASE.md`.
