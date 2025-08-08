# Vivo Booster (Fake AnTuTu)

A super lightweight, blank Android app designed to trick some phone systems (like Vivo's OriginOS) into enabling a high-performance "benchmark mode" for gaming.

![App Icon](./assets/readme_icon.webp)

## The Goal

This app does nothing on its own. Its only purpose is to have the exact package name of the AnTuTu Benchmark app: `com.antutu.ABenchMark`.

Some phone operating systems detect when a benchmark app is running and boost the phone's CPU and GPU performance to get a higher score. By running this fake app, you can trick the system into thinking it's running a benchmark, giving you that performance boost for other apps (like games).

## How to Use

1.  Go to the [**Releases**](https://github.com/LeTanVn/vivo-booster/releases) section of this repository.
2.  Download the latest `app-debug.apk` and install it on your phone.
3.  Before playing any game, make sure the "Game Booster" app is running in **floating window mode**. This is required to trigger the high-performance boost.

You can do this in two ways:

**Launch it first:**
Open the app before launching your game. Minimize it into a floating window, then start your game.

**Or open it from Game Space/Game Sidebar (in-game):**
While in a game, swipe to open your phone’s Game Space/Game Assistant, then add or launch the "Game Booster" app directly from there. It should appear in floating mode on top of the game.

> ✨ The key is that the system detects the app only while it's active in floating mode. Just opening it in the background or switching away won’t work!

## P.S.

This app is completely safe and contains no trackers, ads, or unnecessary code (I guess). It just displays a black screen with text.

All of the code, build configurations, and GitHub Actions workflows in this repository were generated with the help of **Google Gemini 2.5 Pro**.
