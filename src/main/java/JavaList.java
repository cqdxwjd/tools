import java.util.ArrayList;

public class JavaList {
    public static void main(String[] args) {
        // 创建字符串List
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        // 把字符串List转化为整数List
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (String s : list) {
            intList.add(Integer.parseInt(s));
        }
        // 打印
        System.out.println(intList);
    }
}
