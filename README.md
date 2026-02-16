# OptiKea

**A lightweight client-side performance utility mod for Minecraft Fabric designed to reduce unnecessary runtime overhead and improve frame stability.**

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)  
[![Modrinth](https://img.shields.io/badge/Available%20on-Modrinth-1bd96a.svg)](https://modrinth.com/mod/optikea)  
[![Mod Loader](https://img.shields.io/badge/Mod%20Loader-Fabric-dbd0b4.svg)](https://fabricmc.net)  
[![Minecraft](https://img.shields.io/badge/Minecraft-1.21.11-brightgreen.svg)](https://minecraft.net)  
[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://adoptium.net)

---

## Overview

OptiKea is a performance-focused Fabric mod that introduces targeted runtime optimizations aimed at reducing avoidable CPU workload during gameplay. The project focuses on incremental, safe, and measurable optimizations rather than intrusive engine rewrites.

The current implementation provides an optimized performance overlay that minimizes runtime allocations and avoids redundant calculations during HUD rendering. The mod is designed as a modular foundation for future performance systems including rendering, entity processing, and resource management optimizations.

---

## Features

- Lightweight performance overlay  
- Reduced runtime memory allocations  
- Minimal CPU overhead  
- Fully client-side  
- Designed for compatibility with other performance mods  
- Modular architecture for future optimizations  

---

## Compatibility

- Minecraft: 1.21.11  
- Mod Loader: Fabric  
- Java: 21+  
- Environment: Client-side only  

OptiKea is designed to work alongside existing optimization mods such as Sodium, Lithium, and Iris without conflicts.

---

## Installation

### Player Installation

1. Install Fabric Loader version **0.18.4** or newer.  
2. Download the latest release from Modrinth or GitHub Releases.  
3. Place the `.jar` file inside your Minecraft `mods` folder.  
4. Launch Minecraft using the Fabric profile.  

---

### Development Setup

#### Requirements

- JDK 21 or newer  
- Git  
- Gradle (included via wrapper)  

#### Clone Repository

```bash
git clone https://github.com/yKyoshiii/OptiKea.git
cd OptiKea
```

#### Build Mod

**Windows**
```bash
./gradlew build
```

**Linux / macOS**
```bash
chmod +x gradlew
./gradlew build
```

#### Output Location

```
build/libs/optikea-<version>.jar
```

#### Run Development Client

```bash
./gradlew runClient
```

---

## Technical Summary

OptiKea currently optimizes performance by reducing unnecessary runtime overhead inside HUD-related logic.

The overlay system retrieves performance metrics such as FPS and memory usage using efficient runtime calls while avoiding excessive object creation and repeated calculations.

Future versions aim to introduce deeper optimization systems targeting rendering pipelines, entity logic, and visual effect processing.

---

## Roadmap

Planned optimization systems include:

- Entity activity throttling  
- Conditional particle rendering  
- Visual effect frustum filtering  
- Runtime allocation reduction  
- Adaptive rendering systems  
- Advanced performance telemetry  

---

## License

This project is licensed under the GNU General Public License v3.0. See the LICENSE file for details.

---

## Contributing

Contributions, bug reports, and feature suggestions are welcome. Please open an issue or submit a pull request.

---

## Author

*[yKyoshi](https://github.com/yKyoshiii)* - *_Creator_*

---

## Acknowledgements

- FabricMC for the modding toolchain  
- The Minecraft modding community  
- Developers of performance-focused open source mods  
