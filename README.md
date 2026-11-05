# Durak Helper (prototype)

This is an Android project starter for a screen-analysis assistant. It is **not a finished card recognizer** and currently does not analyze game screenshots or provide strategy.

## Build APK using GitHub Actions from a phone
1. Create a GitHub repository and upload the contents of this folder (including `.github`).
2. Open the repository's **Actions** tab.
3. Select **Build APK** and press **Run workflow** (or push to `main`).
4. When the run completes, open its run page, scroll to **Artifacts**, and download `DurakHelper-debug-apk`.
5. Extract the APK and install it on your Android device. Android may ask permission to install apps from that browser/files app.

## Current state
- Android app shell with a basic screen.
- Build workflow uploads a debug APK.
- Overlay permission entry point.
- No screen capture, card recognition, move solver, or floating suggestion overlay yet.

## Technical note
The project uses Gradle 8-compatible Android Gradle Plugin 8.7.3, Kotlin 2.0.21, Java 17, compile SDK 35.
