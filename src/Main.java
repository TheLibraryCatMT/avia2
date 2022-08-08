public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        //int ticketPrice = 25; // цена билета
        //int bonusForOneMile = 20; // количество рублей за одну милю
        //int bonusPrice =  ticketPrice / bonusForOneMile;

        //System.out.println("Поздравляем! Вам начислено " + bonusPrice + "  миль  за покупку билета!");
    }

}

