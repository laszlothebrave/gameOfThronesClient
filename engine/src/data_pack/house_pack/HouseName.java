package data_pack.house_pack;

public enum HouseName {
    Stark ("Rod Starkow"),
    Greyjoy("Rod Greyjoyow"),
    Lannister("Rod Lannisterow"),
    Martell("Rod Martellow"),
    Tyrell("Rod Tyrellow"),
    Baratheon("Rod Baratheonow");

    private String name;

    HouseName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
