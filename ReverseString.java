public class ReverseString {
    public static void main(String[] args) {
        String fullName = "Muhammad Ayom Izzuddin";
        char[] fullNameChars = fullName.toCharArray();
        int length = fullNameChars.length;
        char[] reversedChars = new char[length];

        for (int i = 0; i < length; i++) {
            int currentIndex = length - 1 - i;
            reversedChars[currentIndex] = fullNameChars[i];
        }

        System.out.println("Original: " + new String(fullNameChars));
        System.out.println("Reversed: " + new String(reversedChars));
    }
}
