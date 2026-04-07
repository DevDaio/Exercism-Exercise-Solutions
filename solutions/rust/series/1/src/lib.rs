pub fn series(digits: &str, len: usize) -> Vec<String> {
// todo!("What are the series of length {len} in string {digits:?}")
    let mut new: Vec<String> = Vec::new();
    let iter = digits.as_bytes().windows(len)
        .map(|w| String::from_utf8(w.to_vec()).unwrap());
    for i in iter {
        new.push(i);}
        print!("{:?}",new);
        new
}

