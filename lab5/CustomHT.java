import java.util.Scanner;
 
public class CustomHT {
    private static final int TABLE_SIZE = 256;
 
    private CharacterFrequency[] table;
 
    public CustomHT() {
        table = new CharacterFrequency[TABLE_SIZE];
    }
 
    public void put(char key) {
        int index = key;
        if (table[index] == null) {
            table[index] = new CharacterFrequency(key);
        } else {
            table[index].frequency++;
        }
    }
 
    public CharacterFrequency get(char key) {
        int index = key;
        return table[index];
    }
 
    public static class CharacterFrequency {
        char character;
        int frequency;
 
        public CharacterFrequency(char character) {
            this.character = character;
            this.frequency = 1;
        }
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
 
        CustomHT CustomHT = new CustomHT();
 
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == ' ' || c == '-' || c == '_' || c == '?') {
                CustomHT.put(c);
            }
        }
 
        char maxChar = ' ';
        int maxCount = 0;
 
        for (int i = 0; i < CustomHT.TABLE_SIZE; i++) {
            CustomHT.CharacterFrequency cf = CustomHT.table[i];
            if (cf != null) {
                if (cf.frequency > maxCount || (cf.frequency == maxCount && cf.character < maxChar)) {
                    maxChar = cf.character;
                    maxCount = cf.frequency;
                }
            }
        }
 
        System.out.println(maxChar + " " + maxCount);
    }
}