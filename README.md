# OptiKea

**A lightweight Fabric mod that optimizes Minecraft's HUD rendering to boost FPS.**

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
[![Modrinth](https://img.shields.io/badge/Available%20on-Modrinth-1bd96a.svg)](https://modrinth.com/mod/optikea)
[![Fabric](https://img.shields.io/badge/Mod%20Loader-Fabric-dbd0b4.svg)](https://fabricmc.net)

---

## Overview

OptiKea is a client-side performance optimization mod for Minecraft (Fabric) that intelligently reduces the rendering frequency of the Heads-Up Display (HUD). By skipping a configurable number of frames during HUD rendering, it significantly decreases the workload on the GPU without causing the HUD to disappear or flicker. This results in a substantial and smooth FPS boost, particularly beneficial for lower-end systems or for users seeking maximum performance.

The mod operates by intercepting the HUD render cycle and carefully controlling the draw calls, ensuring the last fully rendered frame persists seamlessly when rendering is skipped. The outcome is a fluid visual experience accompanied by a measurable performance gain.

---

## Features

- FPS Boost: Achieves a significant increase in frames per second by reducing HUD rendering overhead.
- Configurable Rendering Interval: Allows adjustment of how often the HUD is fully rendered (every N frames) to balance performance and visual smoothness.
- No Flickering: Employs a smart caching mechanism to prevent the HUD from disappearing or flickering when frames are skipped.
- Client-Side Only: Safe to install on any client, with no server-side requirements.
- Lightweight and Compatible: Minimal code footprint designed to function alongside other Fabric performance mods.

---

## Installation

### For Players (Using the Mod)

1. Ensure Fabric Loader 0.18.4 or higher is installed for Minecraft 1.21.11.
2. Download the latest JAR file from the Modrinth page or the Releases section on GitHub.
3. Place the downloaded JAR file into the Minecraft mods folder.
4. Launch the game using the Fabric profile.

### For Developers (Compiling from Source)

To compile the mod independently or contribute to its development, follow these steps.

#### Prerequisites

- Java Development Kit (JDK) 21 or later.
- Git (optional, for cloning).
- A terminal (PowerShell, Command Prompt, or bash).

#### Steps

1. Clone the repository:
   `git clone https://github.com/yKyoshiii/OptiKea.git`
   `cd OptiKea`

2. Build the mod:

   On Windows (PowerShell):
   `./gradlew build`

   On Linux/macOS:
   `chmod +x gradlew`
   `./gradlew build`

3. Locate the JAR:
   Following a successful build, the compiled mod JAR file will be located at:
   `build/libs/optikea-<version>.jar`

4. For Development and Testing:
   The Minecraft client can be run directly with the mod using the Gradle task:
   `./gradlew runClient`

---

## How It Works

OptiKea employs Mixins to interact with the core rendering classes of Minecraft, specifically the Gui class responsible for the HUD.

1. Frame Counter: The mod maintains a counter that increments with every rendered frame.
2. Skipping Logic: A configurable RENDER_INTERVAL defines the frequency of full HUD renders. For example, with an interval set to 2, the HUD is fully rendered on every second frame.
3. Cancellation with Persistence: When a frame is scheduled to be skipped, the mod cancels the HUD render calls without clearing the screen buffer. This allows the last successfully rendered HUD frame to remain on the display, creating the impression of a continuous, uninterrupted HUD while conserving processing resources.

This targeted optimization reduces the number of draw calls and CPU/GPU work associated with the HUD, translating directly into higher and more stable FPS.

---

## Configuration

Currently, the mod utilizes a hardcoded render interval. A future update will introduce a configuration file for user customization.

The RENDER_INTERVAL value can be manually adjusted in the HudOptimizerMixin.java file prior to compilation to suit individual preferences. Examples include 1 for default rendering, 2 for a 50 percent reduction, and 3 for a 66 percent reduction.

---

## License

This project is licensed under the GNU General Public License v3.0. Refer to the LICENSE file for complete details.

This license permits users to:
- Use the mod for any purpose.
- Modify the source code.
- Distribute copies.
- Distribute modified versions.

Under the condition that the source code of any distributed modifications is disclosed under the same license.

---

## Contributing

Contributions, issues, and feature requests are welcome. Please open an issue or submit a pull request on the GitHub repository.

---

## Author

yKyoshi - GitHub Profile

---

## Acknowledgements

- The FabricMC team for providing the modding toolchain.
- The Minecraft community for continued inspiration and support.

---

## Thank you for using OptiKea to enhance your Minecraft experience.
