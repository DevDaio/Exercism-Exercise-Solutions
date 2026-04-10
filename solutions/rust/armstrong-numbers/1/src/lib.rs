pub fn is_armstrong_number(num: u32) -> bool {
    let num_len = num.to_string().len() as u32;
    let sum: u32 = num.to_string()
        .chars()
        .map(|c| c.to_digit(10).unwrap())
        .map(|d| d.pow(num_len))
        .sum();
    sum == num
}