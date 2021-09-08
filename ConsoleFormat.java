public class ConsoleFormat {

    // コンストラクタ
    public ConsoleFormat() {

    }

    // メソッド( 外部から利用可能 )
    public void testOutPut( String out ) {
        System.out.println( String.format("testOutPut : %s", out) );
    }

}
