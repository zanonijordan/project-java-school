package mws_2018_039.appstudenti;


public class AppStudentiMain {
    public static void main(String[] args) {
        System.out.println("----- AVVIO APP --------");
        AppStudentiController panel = new AppStudentiController();
        panel.avviaPannello();
        System.out.println("----- CHIUSURA APP -----");
    }
}
