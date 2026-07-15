# need-for-speed

Datum: 2026-07-14

| Thema | Erkenntnis |
|-------|------------|
| Klassen und Objekte | Zwei Klassen (`NeedForSpeed`, `RaceTrack`) kooperieren, indem eine die andere als Referenz erhält. |
| Instanzvariablen | `speed`, `battery`, `batteryDrain`, `distance` als Zustand pro Objekt. |
| Guard Clause | `drive()` bricht früh ab, wenn `batteryDrained()` – fährt nur bei genug Batterie. |
| static Factory Method | `nitro()` erzeugt ein neues `NeedForSpeed`-Objekt mit festen Werten – Alternative zum direkten Konstruktor. |
| Integer-Division | `(battery / batteryDrain) * speed` in `canFinishRace()` nutzt Ganzzahldivision (kein Runden, kein Gleitkomma) für maximale Strecke. |
| `this`-Zugriff | Instanzvariablen brauchen `this`, wenn Parameter denselben Namen haben (`this.speed = speed`). |
| Sichtbarkeit (default) | Kein `public`/`private` – package-private als Standard (reicht fuer eine Datei). |
