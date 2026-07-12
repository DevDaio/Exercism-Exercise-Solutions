# bird-watcher

Datum: 2026-07-11

| Thema | Erkenntnis |
|-------|------------|
| Arrays deklarieren | `int[] name = new int[size]` oder `int[] name = { 1, 2, 3 }`. |
| Array-Laenge | `array.length` (keine Methode, sondern ein Feld -- anders als bei `String`). |
| Index-Zugriff | Arrays sind 0-indexiert: erstes Element ist `arr[0]`, letztes `arr[arr.length - 1]`. |
| For-Each-Schleife | `for (int value : array) { ... }` iteriert ueber alle Elemente. |
| For-Schleife mit Index | `for (int i = 0; i < array.length; i++)` erlaubt Zugriff auf Positionen. |
| `Math.min()` | Begrenzt die Schleifenanzahl: `Math.min(days, array.length)` verhindert IndexOutOfBounds. |

