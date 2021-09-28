public class ConsoleFormat {

    private String out;

    // コンストラクタ
    public ConsoleFormat() {
        out = "default";
    }
    public ConsoleFormat( String out ) {
        this.out = out;
    }

    // インスタンスメソッド( 外部から利用可能 )
    public void println( ) {
        System.out.println( String.format("実行されたのは : %s", this.out) );
    }

    // クラスメソッド( インスタンスを作らなくてもいいメソッ )
    public static void println_Static( String out ) {
        System.out.println( String.format("println_Static : %s", out) );
    }

}
