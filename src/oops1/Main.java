package oops1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Student raghav = new Student();
        raghav.age = 27;
        raghav.name = "Raghav";
        raghav.psp = 90.3;
        System.out.println(raghav);

        Student jagruthi = new Student();
        jagruthi.age = 25;
        jagruthi.name = "Jagruthi";
        jagruthi.psp = 89.2;
        System.out.println(jagruthi);

        raghav.pauseBatch();
        jagruthi.pauseBatch();

        System.out.println(jagruthi.psp);
    }
}