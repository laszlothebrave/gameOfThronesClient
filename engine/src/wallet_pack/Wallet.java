package wallet_pack;

public class Wallet {
    static final int MAX_GOLD = 19;
    static final int INITIAL_GOLD = 5;
    private int availableGold;
    private int currentGold;

    public Wallet() {
        currentGold = INITIAL_GOLD;
        availableGold = MAX_GOLD - INITIAL_GOLD;
    }

    public int getCurrentGold() {
        return currentGold;
    }

    public int getAvailableGold() {
        return availableGold;
    }

    public boolean isAvailable(int amount) {
        if (amount <= currentGold) return true;
        return false;
    }

    public boolean isAvailableToEarn(int amount) {
        if (amount <= availableGold) return true;
        return false;
    }

    public boolean addGold(int amount) {
        if (amount <= availableGold) {
            currentGold += amount;
            availableGold -= amount;
            return true;
        }
        currentGold += availableGold;
        availableGold = 0;
        return false;
    }

    public boolean substractGold(int amount) {
        if(isAvailable(amount)) {
            currentGold -= amount;
            availableGold += amount;
            return true;
        }
        return false;
    }

    public boolean putOneOnMap() {
        if (isAvailable(1)) {
            currentGold--;
            return true;
        }
        return false;
    }

    public void takeOneFromMap() {
        availableGold++;
    }
}
