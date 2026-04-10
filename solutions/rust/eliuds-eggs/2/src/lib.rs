pub fn egg_count(display_value: u32) -> usize {
    let mut count = 0;
    let mut num = display_value;
    
    while num > 0 {
        count += (num % 2) as usize;  // Wenn num ungerade ist, gibt's eine 1
        num /= 2;                      // Nächstes Bit (Shift nach rechts)
    }
    
    count
}
