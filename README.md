# Mapping-Midi-NameNote-Dictionary

#### Author: Bocaletto Luca

This repository provides comprehensive mappings from MIDI note numbers (21–108) to musical note names in English, Italian, and combined English + Italian formats. It serves as a ready-to-use reference for audio applications, MIDI data processing, digital instrument development, and educational tools that need to translate raw MIDI signals into human-readable note names.

## Features

- Full coverage of the MIDI note range from A0 (21) through C8 (108)  
- Three distinct mapping dictionaries:
  - English note names (e.g., “C4”, “G#3”)  
  - Italian note names (e.g., “DO4”, “SOL#3”)  
  - Combined English + Italian notation (e.g., “C4 – Do4”)  
- Framework-agnostic format: plain text dictionaries for loading into any programming environment  
- Ideal for real-time MIDI visualizers, music notation tools, educational demos, prototyping, and testing

## Getting Started

1. Clone or download this repository.  
2. Select the mapping file you need:
   - `english_note_names.txt`
   - `italian_note_names.txt`
   - `english&italian-note-names.txt`  
3. Load the chosen file into your application’s data structure (e.g., a dictionary or map).  
4. Use the MIDI note number as the lookup key to obtain its corresponding note name.

No external dependencies are required beyond basic file I/O and data-structure support in your chosen language.

## Repository Contents

```
LICENSE
README.md
english_note_names.txt
italian_note_names.txt
english&italian-note-names.txt
note_name midi-mapping.txt
example.py
example.js
example.php
example.java
example.rb
```

- **Mapping files**  
  - `english_note_names.txt`  
  - `italian_note_names.txt`  
  - `english&italian-note-names.txt`  
- **Core mapping reference**  
  - `note_name midi-mapping.txt`  
- **Demo examples**  
  - `example.py`  (Python)  
  - `example.js`  (JavaScript/Node.js)  
  - `example.php` (PHP)  
  - `example.java` (Java)  
  - `example.rb`  (Ruby)  
- **LICENSE**: GNU General Public License (GPL)  

These example scripts demonstrate how to load the mapping dictionaries and perform lookups in different languages and environments.

## License

This project is released under the GNU General Public License (GPL). See the [LICENSE](LICENSE) file for details.

---

This repository is owned and actively maintained by **bocaletto-luca**.  
**Elektronoide** was my former GitHub account and is no longer in use.

---
