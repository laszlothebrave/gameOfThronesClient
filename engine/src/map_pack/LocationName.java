package map_pack;

public enum LocationName {
    czarnyZamek ("Czarny Zamek"),
    karhold ("Karhold"),
    winterfell ("Winterfell"),
    kamiennyBrzeg ("Kamienny brzeg"),
    białyPort ("Biały Port"),
    wdowiaStraznica ("Wdowia Strażnica"),
    portWinterfell ("Port w Winterfell"),
    lodowaZatoka ("Lodowa Zatoka"),
    morzeDreszczy ("Morze Dreszczy"),
    portBiałyPort ("Port Bialy Port"),
    palecFlinta ("Palec Flinta"),
    straznicaNadSzaraWoda ("Strażnica nad Szarą Wodą"),
    fosaCailin("Fosa Cailin"),
    seagard ("Seagard"),
    blizniaki ("Bliźniaki"),
    paluchy ("Paluchy"),
    goryKsiezycowe ("Gory księżycowe"),
    orleGniazdo("Orle Gniazdo"),
    pyke ("Pyke"),
    portPyke ("Port Pyke"),
    riverrun ("Riverrun"),
    lanisport ("Lanisport"),
    portLanisport ("Port Lanisport"),
    kamiennySept ("Kamienny Sept"),
    harrenhal ("Harrenhal"),
    szczypcowyPrzyladek ("Szczypcowy Przylądek"),
    smoczaSkala ("Smocza Skala"),
    portSmoczaSkala ("Port Smocza Skala"),
    morzeZachodzacegoSlonca ("Morze Zachodzącego Słońca"),
    zatokaZelaznychLudzi ("Zatoka Żelaznych Ludzi"),
    zlotaCiesnina ("Złota Cieśnina"),
    waskieMorze ("Wąskie Morze"),
    czarnaZatoka ("Czarna Zatoka"),
    zatokaRozbitkow ("Zatoka Rozbitków"),
    wschodnieMorzeLetnie ("Wschodnie Morze Letnie"),
    zachodnieMorzeLetnie ("Zachodnie Morze Letnie"),
    morzeDornijskie ("Morze Dornijskie"),
    ciesninaRedwyne ("Cieśnina Renwyne'ów"),
    arbor ("Arbor"),
    mokradlaWschodniegoTraktu ("Mokradła Wschodniego Traktu"),
    czarnyNurt ("Czarny nurt"),
    krolewskaPrzystan ("Królewska Przystań"),
    wysogrod ("Wysogród"),
    reach ("Reach"),
    krolewskiLas ("Królewski Las"),
    koniecBurzy ("Koniec Burzy"),
    portKoniecBurzy("Port Koniec Burzy"),
    szlakKosci ("Szlak Kości"),
    dornijskiePogranicze ("Dornijskie Pogranicze"),
    stareMiasto ("Stare Miasto"),
    portStareMiasto ("Port Stare Miasto"),
    trzyWieze ("Trzy Wieże"),
    przelenczKsiecia("Przełencz Księcia"),
    starfall ("Starfall"),
    yronwood ("Yronwood"),
    slonyBrzeg("Słony Brzeg"),
    slonecznaWlocznia ("Słoneczna Włócznia"),
    portSlonecznaWlocznia ("Port Słoneczna Włócznia");

    private String name;

    LocationName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
