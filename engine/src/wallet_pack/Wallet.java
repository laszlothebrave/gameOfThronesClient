package wallet_pack;

import exception_pack.*;

public class Wallet {
    static final int MAX_GOLD = 19;
    static final int INITIAL_GOLD = 5;
    private int availableGold;
    private int currentGold;

    public Wallet() {
        currentGold = INITIAL_GOLD;
        availableGold = MAX_GOLD - INITIAL_GOLD;
    }

    public void addGold(int amount) throws NotEnoughAvailableGold {
        if (isAvailableToEarn(amount)) {
            currentGold += amount;
            availableGold -= amount;
            return;
        }
        currentGold += availableGold;
        availableGold = 0;
        throw new NotEnoughAvailableGold();
    }

    public void substractGold(int amount) throws NotEnoughCurrentGold {
        if(isAvailable(amount)) {
            currentGold -= amount;
            availableGold += amount;
            return;
        }
        throw new NotEnoughCurrentGold();
    }

    public void putOneOnMap() throws NotEnoughCurrentGold {
        if (isAvailable(1)) {
            currentGold--;
            return;
        }
        throw new NotEnoughCurrentGold();
    }

    public void takeOneFromMap() {
        availableGold++;
    }
    public int getCurrentGold() {
        return currentGold;
    }
    public int getAvailableGold() {
        return availableGold;
    }

    private boolean isAvailable(int amount) {
        if (amount <= currentGold) return true;
        return false;
    }

    private boolean isAvailableToEarn(int amount) {
        if (amount <= availableGold) return true;
        return false;
    }
}
