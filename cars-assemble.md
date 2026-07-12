# cars-assemble

Datum: 2026-07-11

| Thema | Erkenntnis |
|-------|------------|
| `int` vs `double` | `int` fuer ganze Zahlen, `double` fuer Kommazahlen. |
| Implizite Konvertierung | `int` -> `double` ist sicher und passiert automatisch. |
| Expliziter Cast | `double` -> `int` braucht `(int)` und schneidet Nachkommastellen ab. |
| if-else-if | Bedingungen von spezifisch nach allgemein ordnen: `if (speed <= 4) ... else if (speed <= 8) ...` |
| Kombination mit Cast | `(int) (rate / 60)` rundet nicht, sondern schneidet ab (floor). |

