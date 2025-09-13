//utilisation de Java pour changer.
//auteur: Samit Sabah Adelyar


class Solution {
    public boolean isPalindrome(int x) {
        String original = "" + x;
        String n = "";
        for(int i = 0; i < original.length(); i++)
        {
            n += original.charAt(original.length()-1-i);
        }
        if(n.equals(original))
    {
        return true;
    }
    return false;
}
}
