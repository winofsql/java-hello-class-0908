import java.util.*;

public class HelloClass {

    public static void main (String[] args) {

        ConsoleFormat cf = new ConsoleFormat( "1番目" );
        ConsoleFormat cf2 = new ConsoleFormat( "ニ番目" );

        cf.testOutPut("こんにちは");
        cf2.testOutPut("こんにちは");

        ConsoleFormat.testOutPutStatic("こんにちは");
        testOutPutStatic("こんにちはです");

        Map<String, String> env = System.getenv();
        // forEach メソッド => ラムダ式
        env.forEach( (key, value) -> {
            String out = String.format( "%s => %s", key, value );
            System.out.println( out );
        });

        System.out.println( "------------------------------------" );

        // for ループ用に配列を作成
        Set<String> set;
        set = env.keySet();

        String[] keys;
        keys = set.toArray(new String[0]);

        String key_value;
        for( int i = 0; i < keys.length; i++ ) {
            key_value = String.format( "%s => %s", keys[i], env.get( keys[i] ) );
            System.out.println( key_value );
        }

    }

    // クラスメソッド( インスタンスを作らなくてもいい )
    public static void testOutPutStatic( String out ) {
        System.out.println( String.format("testOutPutStatic : %s", out) );
    }


}