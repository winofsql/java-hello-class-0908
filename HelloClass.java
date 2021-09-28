import java.util.*;

public class HelloClass {

    public static void main(String[] args) {

        ConsoleFormat cf1 = new ConsoleFormat("インスタンス1番目");
        ConsoleFormat cf2 = new ConsoleFormat("インスタンス2番目");

        cf1.println();
        cf2.println();

        ConsoleFormat.println_Static("こんにちは");
        printLocalStatic("こんにちは");

        System.out.println("\n-------forEach メソッド => ラムダ式");

        // ******************************************
        // 環境変数
        // ******************************************
        Map<String, String> env = System.getenv();

        // forEach メソッド => ラムダ式
        env.forEach((key, value) -> {
            String out = String.format("%s => %s", key, value);
            System.out.println(out);
        });

        System.out.println("\n-------env.keySet() : 拡張 for");

        Set<String> set;
        set = env.keySet();

        String key_value;
        for (String key : set) {
            key_value = String.format("%s => %s", key, env.get(key));
            System.out.println(key_value);
        }

        System.out.println("\n-------配列・ソート : 通常 for");

        // for ループ用に配列を作成
        String[] keys;
        // ソート
        keys = set.toArray(new String[0]);

        for (int i = 0; i < keys.length; i++) {
            key_value = String.format("%s => %s", keys[i], env.get(keys[i]));
            System.out.println(key_value);
        }

        System.out.println("\n-------配列・ソート : 拡張 for");

        for (String key : keys) {
            key_value = String.format("%s => %s", key, env.get(key));
            System.out.println(key_value);
        }


    }

    // クラスメソッド( インスタンスを作らなくてもいいメソッド )
    public static void printLocalStatic(String out) {
        System.out.println(String.format("printLocalStatic : %s", out));
    }

}