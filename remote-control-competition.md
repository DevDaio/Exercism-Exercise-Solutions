# remote-control-competition

Datum: 2026-07-15

| Thema | Erkenntnis |
|-------|------------|
| `Comparable<T>` Interface | Interface aus `java.lang` (kein Import nötig). Erzwingt `compareTo(T other): int`. Definiert die natürliche Sortierreihenfolge einer Klasse. |
| `compareTo()` Vertrag | negativ = `this < other`, 0 = gleich, positiv = `this > other`. `Collections.sort()` ruft es intern für Paare auf und tauscht Positionen. |
| Absteigend sortieren | `Integer.compare(a, b)` sortiert aufsteigend (`a < b` → negativ). Für absteigend Parameter vertauschen: `Integer.compare(other.number, this.number)`. |
| `Collections.sort(List)` | Sortiert eine Liste mit der natürlichen Ordnung (`compareTo`). Modifiziert die übergebene Liste direkt. |
| Utility-Klasse (static) | `TestTrack` hat nur statische Methoden (`race()`, `getRankedCars()`). Kein `implements List` – es ist keine Liste, sondern ein Helfer. |
| Liste als Parameter | `getRankedCars(List<ProductionRemoteControlCar> cars)` bekommt die Liste vom Aufrufer. Kein eigenes Feld nötig. |
| Tests als Quelle der Wahrheit | README gibt Richtung vor, Tests zeigen exakte Parameter- und Rückgabetypen. |
| `import` für Standardbibliothek | `java.util.Collections` und `java.util.List` müssen explizit importiert werden. |
