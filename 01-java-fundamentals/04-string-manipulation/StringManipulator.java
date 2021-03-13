public class StringManipulator {
    public static String trimAndConcat(String str1, String str2){
        return ((str1.trim()).concat(str2.trim()));
    }
    public static Integer getIndexOrNull(String str, char letter){
        Integer i = str.indexOf(letter);
        if (i == -1){
            return null;
        }
        return i;
    }
    public static Integer getIndexOrNull(String word, String str1){
        Integer i = word.indexOf(str1);
        if (i == -1){
            return null;
        }
        return i;
    }
    public static String concatSubstring(String str1, int var1, int var2, String str2){
        return (str1.substring(var1, var2).concat(str2));
    }
}
