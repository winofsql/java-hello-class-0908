public class ConsoleFormat {

    private String out;

    // コンストラクタ
    public ConsoleFormat() {
        out = "default";
    }
    public ConsoleFormat( String out ) {
        this.out = out;
    }

    // メソッド( 外部から利用可能 )
    public void testOutPut( String out ) {
        System.out.println( String.format("%s : %s", this.out, out) );
    }

    // クラスメソッド( インスタンスを作らなくてもいい )
    public static void testOutPutStatic( String out ) {
        System.out.println( String.format("testOutPutStatic : %s", out) );
    }

}
