# log-levels

Datum: 2026-07-10

| Thema              | Erkenntnis                                                                                                                                                                                                        |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `String.split()`   | Erwartet einen **regulären Ausdruck**, kein plain String. Sonderzeichen wie `[`, `(`, `.`, `*`, `+`, `?`, `\` müssen escaped werden. Escape in Java: `split("\\[")` → Java-String `\[` → Regex matcht literal `[` |
| `String.trim()`    | Entfernt alle Whitespace-Zeichen (`\n`, `\r`, `\t`, Leerzeichen)                                                                                                                                                  |
| Arrays 0-indexiert | Nach `split()`: Index 0 = erstes Element |

