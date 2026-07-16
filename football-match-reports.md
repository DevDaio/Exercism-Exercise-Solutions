# football-match-reports

Datum: 2026-07-16

| Thema | Erkenntnis |
|-------|------------|
| Switch Statement | `switch (ausdruck) { case wert: ... break; default: ... }` fuer primitive/string-Vergleiche |
| Multi-Label case | `case 3, 4:` oder `case 6, 7, 8:` – erlaubt mehrere Werte pro case (Java 14+) |
| default-Zweig | Wird ausgefuehrt, wenn kein case passt – hier fuer ungueltige Trikotnummern |
| break vergessen | Ohne break fallthrough – Code des naechsten case wird ebenfalls ausgefuert |
| Strings direkt zurueckgeben | `return "goalie"` statt `return "goalie".toString()` reicht aus |
