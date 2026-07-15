# jedliks-toy-car

Datum: 2026-07-13

| Thema | Erkenntnis |
|-------|------------|
| Klassen und Instanzen | `new JedliksToyCar()` erzeugt eine neue Instanz; `static`-Methoden gehören zur Klasse, nicht zur Instanz. |
| Instanzvariablen | `int distance` und `int battery` sind pro Instanz vorhanden, werden im Konstruktor implizit auf 0 bzw. 100 initialisiert. |
| Guard Clause | `if (battery == 0) return;` verhindert weiteres Fahren bei leerem Akku – early exit statt else-Verschachtelung. |
| String-Konkatenation | `"Driven " + distance + " meters"` baut den Anzeigetext; `String.valueOf()` ist hier überflüssig. |
| StringBuilder | Alternative zu `+` bei bedingtem String-Aufbau, z. B. `"Battery at " + battery + "%"` vs. `"Battery empty"`. |
| `void`-Methode | `drive()` ändert den Zustand, gibt aber nichts zurück – Rücksetyp `void`. |
