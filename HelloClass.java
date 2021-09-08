public class HelloClass {

    public static void main (String[] args) {

        ConsoleFormat cf = new ConsoleFormat( "1番目" );
        ConsoleFormat cf2 = new ConsoleFormat( "ニ番目" );

        cf.testOutPut("こんにちは");
        cf2.testOutPut("こんにちは");

        ConsoleFormat.testOutPutStatic("こんにちは");


    }

}