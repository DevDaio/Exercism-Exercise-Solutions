# java

Datum: 2026-07-13

| Thema | Erkenntnis |
|-------|------------|
| char-Literale | char-Literale brauchen einfache Anführungszeichen (`' '`), Strings brauchen doppelte (`" "`) |
| Character.isLetter() | Prüft, ob ein char ein Unicode-Buchstabe ist – nicht nur ASCII, sondern alle Schriften |
| switch with char | switch kann auf char-Werte angewendet werden; mehrere Werte pro case mit Komma (seit Java 14) |
| StringBuilder | StringBuilder.append(char) zum effizienten Aufbauen eines Strings aus chars |
| boolean Flag | Ein boolean-Flag (z. B. `afterDash`) merkt sich Zustände zwischen Iterationen, z. B. für Kebab-to-CamelCase |
| Character.toUpperCase() | Wandelt einen char in den Großbuchstaben um |
| Leetspeak-Ersetzung | Mapping für squeaky-clean: '4'->'a', '3'->'e', '0'->'o', '1'->'l', '7'->'t' |
| for-each mit char[] | `for (char c : string.toCharArray())` iteriert Zeichen für Zeichen |
