package map_pack;

import java.util.ArrayList;
import java.util.HashMap;

public class LocationInitialization {
    public static HashMap<LocationName,Location> create(int numberOfPlayers){
        int numberOfLocation;
        HashMap<LocationName,Location> locationList;
        locationList = new HashMap<>();
        if (numberOfPlayers >= 3) {
            locationList.put(LocationName.czarnyZamek,new Land(LocationName.czarnyZamek, 0, 1, 0));
            locationList.put(LocationName.karhold,new Land(LocationName.karhold, 0, 1, 0));
            locationList.put(LocationName.winterfell,new Land(LocationName.winterfell, 1, 1, 2));
            locationList.put(LocationName.białyPort,new Land(LocationName.białyPort, 0, 0, 1));
            locationList.put(LocationName.wdowiaStraznica,new Land(LocationName.wdowiaStraznica, 1, 0, 0));
            locationList.put(LocationName.kamiennyBrzeg,new Land(LocationName.kamiennyBrzeg, 1, 0, 0));
            locationList.put(LocationName.straznicaNadSzaraWoda,new Land(LocationName.straznicaNadSzaraWoda, 1, 0, 0));
            locationList.put(LocationName.fosaCailin,new Land(LocationName.fosaCailin, 0, 0, 1));
            locationList.put(LocationName.palecFlinta,new Land(LocationName.palecFlinta, 0, 0, 1));
            locationList.put(LocationName.seagard,new Land(LocationName.seagard, 1, 1, 2));
            locationList.put(LocationName.blizniaki,new Land(LocationName.blizniaki, 0, 1, 0));
            locationList.put(LocationName.paluchy,new Land(LocationName.paluchy, 1, 0, 0));
            locationList.put(LocationName.goryKsiezycowe,new Land(LocationName.goryKsiezycowe, 1, 0, 0));
            locationList.put(LocationName.orleGniazdo,new Land(LocationName.orleGniazdo, 1, 1, 1));
            locationList.put(LocationName.riverrun,new Land(LocationName.riverrun, 1, 1, 2));
            locationList.put(LocationName.lanisport,new Land(LocationName.lanisport, 2, 0, 2));
            locationList.put(LocationName.kamiennySept,new Land(LocationName.kamiennySept,0, 1, 0));
            locationList.put(LocationName.szczypcowyPrzyladek,new Land(LocationName.szczypcowyPrzyladek, 0, 0, 1));
            locationList.put(LocationName.smoczaSkala,new Land(LocationName.smoczaSkala,1, 1, 2));
            locationList.put(LocationName.krolewskiLas ,new Land(LocationName.krolewskiLas, 1, 1, 0));
            locationList.put(LocationName.koniecBurzy,new Land(LocationName.koniecBurzy,0, 0, 1));
            locationList.put(LocationName.szlakKosci,new Land(LocationName.szlakKosci, 0, 1, 0));
            locationList.put(LocationName.dornijskiePogranicze,new Land(LocationName.dornijskiePogranicze, 0, 1, 0));
            locationList.put(LocationName.przelenczKsiecia,new Land(LocationName.przelenczKsiecia, 1, 1, 0));
            locationList.put(LocationName.trzyWieze,new Land(LocationName.trzyWieze, 1, 0, 0));
            locationList.put(LocationName.stareMiasto,new Land(LocationName.stareMiasto, 0, 0, 2));
            locationList.put(LocationName.wysogrod,new Land(LocationName.wysogrod, 2, 0,2));
            locationList.put(LocationName.mokradlaWschodniegoTraktu,new Land(LocationName.mokradlaWschodniegoTraktu, 1, 0, 0));
            locationList.put(LocationName.harrenhal,new Land(LocationName.harrenhal, 0, 1, 1));
            locationList.put(LocationName.starfall,new Land(LocationName.starfall, 1, 0, 1));
            locationList.put(LocationName.yronwood,new Land(LocationName.yronwood, 0, 0, 1));
            locationList.put(LocationName.slonyBrzeg,new Land(LocationName.slonyBrzeg, 1, 0, 0));
            locationList.put(LocationName.slonecznaWlocznia,new Land(LocationName.slonecznaWlocznia, 1, 1, 2));
            locationList.put(LocationName.reach,new Land(LocationName.reach, 0, 0, 1));
            locationList.put(LocationName.pyke,new Land(LocationName.pyke, 1, 1,2));
            locationList.put(LocationName.arbor,new Land(LocationName.arbor, 0, 1, 0));
            locationList.put(LocationName.krolewskaPrzystan,new Land(LocationName.krolewskaPrzystan, 0, 2, 2));
            locationList.put(LocationName.czarnyNurt,new Land(LocationName.czarnyNurt, 2, 0, 0));
            locationList.put(LocationName.portWinterfell,new Port(LocationName.portWinterfell));
            locationList.put(LocationName.portBiałyPort,new Port(LocationName.portBiałyPort));
            locationList.put(LocationName.portPyke,new Port(LocationName.portPyke));
            locationList.put(LocationName.portLanisport,new Port(LocationName.portLanisport));
            locationList.put(LocationName.portSmoczaSkala,new Port(LocationName.smoczaSkala));
            locationList.put(LocationName.portKoniecBurzy,new Port(LocationName.portKoniecBurzy));
            locationList.put(LocationName.portStareMiasto,new Port(LocationName.portStareMiasto));
            locationList.put(LocationName.portSlonecznaWlocznia,new Port(LocationName.portSlonecznaWlocznia));
            locationList.put(LocationName.morzeDreszczy,new Sea(LocationName.morzeDreszczy));
            locationList.put(LocationName.waskieMorze,new Sea(LocationName.waskieMorze));
            locationList.put(LocationName.zatokaRozbitkow,new Sea(LocationName.zatokaRozbitkow));
            locationList.put(LocationName.czarnaZatoka,new Sea(LocationName.czarnaZatoka));
            locationList.put(LocationName.wschodnieMorzeLetnie,new Sea(LocationName.wschodnieMorzeLetnie));
            locationList.put(LocationName.morzeDornijskie,new Sea(LocationName.morzeDornijskie));
            locationList.put(LocationName.zachodnieMorzeLetnie,new Sea(LocationName.zachodnieMorzeLetnie));
            locationList.put(LocationName.morzeZachodzacegoSlonca,new Sea(LocationName.morzeZachodzacegoSlonca));
            locationList.put(LocationName.zlotaCiesnina,new Sea(LocationName.zlotaCiesnina));
            locationList.put(LocationName.lodowaZatoka,new Sea(LocationName.lodowaZatoka));
            locationList.put(LocationName.ciesninaRedwyne,new Sea(LocationName.ciesninaRedwyne));
            locationList.put(LocationName.zatokaZelaznychLudzi,new Sea(LocationName.zatokaZelaznychLudzi));

        }
        if (numberOfPlayers >= 4) {

        }
        if (numberOfPlayers >= 5) {

        }
        if (numberOfPlayers >= 6) {

        }
        return locationList;
    }
}
