public class stringSearch {
    public static void main(String[] args){
        String name = "Jayanta";
        char target = 'a';
        System.out.println("Search result: " + Search(name, target));

        char[] nameArray = name.toCharArray();
        Reverse(nameArray, 'J', 't');
        System.out.println("Reversed portion: " + new String(nameArray));
    }

    // Search for a character in a string
    static boolean Search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    // Reverse a portion of the string (from 'st' to 'end')
    static void Reverse(char[] name, char st, char end) {
        int start = -1, endIdx = -1;

        // Find the indices of the characters st and end
        for (int i = 0; i < name.length; i++) {
            if (name[i] == st && start == -1) {
                start = i;
            }
            if (name[i] == end) {
                endIdx = i;
                break;
            }
        }

        // If both start and end characters are found
        if (start != -1 && endIdx != -1 && start < endIdx) {
            while (start < endIdx) {
                // Swap the characters
                char temp = name[start];
                name[start] = name[endIdx];
                name[endIdx] = temp;
                start++;
                endIdx--;
            }
        } else {
            System.out.println("Invalid characters or range for reversal");
        }
    }
}
