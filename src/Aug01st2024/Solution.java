package Aug01st2024;

// Problem 2678: Number of Senior Citizens
// https://leetcode.com/problems/number-of-senior-citizens/description/?envType=daily-question&envId=2024-08-01

public class Solution {
    public static void main(String[] args) {
        String[] details = new String[] {
                "7868190130M7522",
                "5303914400F9211",
                "9273338290F4010"
        };

        System.out.println(countSeniors(details));

        /*
        Every element in this String array provides in4 of 1 passenger
        Store in 15-characters:
        [phone number] - 10 first characters
        [gender] - 1 character
        [age] - 2 characters
        [seat number] - last 2 characters
         */

    }

    // Return the number of passengers who are strictly more than 60 years old.
    public static int countSeniors(String[] details) {
        int count = 0;
        for (String person : details) {
            //Use substring function to split string from: start -> end. If end is not specify, split start -> end of string
            int age = Integer.parseInt(person.substring(11, 13));
            if (age > 60)
                count++;
        }
        return count;
    }
}
