public class Solution {
    public String defangIPaddr(String address) {
        String ret;
        ret=address.replace(".","[.]");
        return ret;

    }
}