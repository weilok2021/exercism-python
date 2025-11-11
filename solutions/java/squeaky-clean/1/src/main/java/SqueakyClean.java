class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char[] identifier_arr = identifier.toCharArray();

        boolean isCamel = false;
        for (char c: identifier_arr) {
            if (isCamel) {
                c = Character.toUpperCase(c);
                isCamel = false;
            }
            // Replace any spaces in identifier with underscore
            if (Character.isWhitespace(c)) {
                sb.append('_');
            } 
            // Convert any '-' to camelCase
            else if (c == '-') {
                isCamel = true;
            }
            else if (c == '4') {
                sb.append('a');
            }
            else if (c == '3') {
                sb.append('e');
            }           
            else if (c == '0') {
                sb.append('o');
            }            
            else if (c == '1') {
                sb.append('l');
            }            
            else if (c == '7') {
                sb.append('t');
            }
            else if (Character.isLetter(c)){
                sb.append(c);
            }
            // Omit character that are not letters, so do nothing.
        }
        return sb.toString();
    }
}
