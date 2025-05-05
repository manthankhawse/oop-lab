public class CeaserCipher {
    private int shift;

    CeaserCipher(int key) {
        shift = key % 26;
    }

    public String encrypt(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                res.append((char) ('A' + (ch - 'A' + shift) % 26));
            } else if (Character.isLowerCase(ch)) {
                res.append((char) ('a' + (ch - 'a' + shift) % 26));
            } else {
                res.append(ch); 
            }
        }

        return res.toString();
    }

    public String decrypt(String s) {
        CeaserCipher cc = new CeaserCipher(26 - shift);
        return cc.encrypt(s);
    }

    public static void main(String[] args) {
        CeaserCipher cc = new CeaserCipher(18);
        String en = cc.encrypt("Hello");
        String de = cc.decrypt(en);

        System.out.println("Encrypted String: " + en);
        System.out.println("Decrypted String: " + de);
    }
}

