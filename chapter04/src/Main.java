//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        Chapter04 C04 = new Chapter04();
        System.out.println("======test1=======");
        C04.test1();
        System.out.println("======test2=======");
        C04.test2();
        System.out.println("======test3=======");
        C04.test3();
        System.out.println("======test4=======");
        C04.test4();
        System.out.println("======test5=======");
        C04.test5();
        System.out.println("======test6=======");
        C04.test6();

        addChapter04 addC04 = new addChapter04();
        addC04.test1();

    }
}