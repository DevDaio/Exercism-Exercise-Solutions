pub fn plants(diagram: &str, student: &str) -> Vec<&'static str> {
    fn plant_name(c: char) -> &'static str {
        match c {
            'V' => "violets",
            'R' => "radishes",
            'C' => "clover",
            'G' => "grass",
            _ => panic!("Unbekannte Pflanze"),
        }
    }

    let pupils: [&str; 12] = [
        "Alice", "Bob", "Charlie", "David", "Eve", "Fred",
        "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry",
    ];

    let pupils_index = pupils
        .iter()
        .position(|x| *x == student)
        .expect("Student nicht gefunden");

    let mut pupils_plants = Vec::new();
    let dia_rows: Vec<&str> = diagram.lines().collect();
    
    if dia_rows.len() > 2 || dia_rows.is_empty() {
        panic!("Ungültige Zeilenanzahl");
    } else {
    // Erste Zeile (immer vorhanden)
    pupils_plants.push(plant_name(
        dia_rows[0].chars().nth(pupils_index * 2).unwrap()
    ));
    pupils_plants.push(plant_name(
        dia_rows[0].chars().nth(pupils_index * 2 + 1).unwrap()
    ));
    // Zweite Zeile
    pupils_plants.push(plant_name(
        dia_rows[1].chars().nth(pupils_index * 2).unwrap()
    ));
    pupils_plants.push(plant_name(
        dia_rows[1].chars().nth(pupils_index * 2 + 1).unwrap()
    ));
    if dia_rows.len() > 2 || dia_rows.is_empty() {
        panic!("Ungültige Zeilenanzahl");
    }
}
    pupils_plants
}