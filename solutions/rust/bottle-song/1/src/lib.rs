fn num_to_word(n: u32) -> &'static str {
    match n {
        0 => "no",
        1 => "one",
        2 => "two",
        3 => "three",
        4 => "four",
        5 => "five",
        6 => "six",
        7 => "seven",
        8 => "eight",
        9 => "nine",
        10 => "ten",
        _ => "many", // oder panic/Error für > 10
    }
}

fn plural(n: u32) -> &'static str {
    match n {
        1 => "",
        _ => "s",
    }
}

fn capitalize(s: &str) -> String {
    let mut chars = s.chars();
    match chars.next() {
        None => String::new(),
        Some(first) => first.to_uppercase().collect::<String>() + chars.as_str(),
    }
}

pub fn recite(start_bottles: u32, take_down: u32) -> String {
    let mut result = String::new();
    let mut bottles = start_bottles;
    let mut remaining = take_down;
    
    while bottles > 0 && remaining > 0 {
        let next_bottles = bottles.saturating_sub(1);
        
        let current_word = num_to_word(bottles);
        let next_word = num_to_word(next_bottles);
        
        let verse = format!(
            "{} green bottle{} hanging on the wall,\n\
             {} green bottle{} hanging on the wall,\n\
             And if one green bottle should accidentally fall,\n\
             There'll be {} green bottle{} hanging on the wall.\n\n",
            capitalize(current_word), plural(bottles),
            capitalize(current_word), plural(bottles),
            next_word, plural(next_bottles)
        );
        
        result.push_str(&verse);
        bottles = next_bottles;
        remaining -= 1;
    }
    
    result.trim_end().to_string()
}
