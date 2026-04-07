pub fn series(digits: &str, len: usize) -> Vec<String> {
    let chars: Vec<char> = digits.chars().collect();
    chars.windows(len)
        .map(|w| w.iter().collect())
        .collect()
}

