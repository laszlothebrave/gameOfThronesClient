package wallet_pack;

import exception_pack.NotEnoughGold;

public class Wallet {
    static final int MAX_GOLD = 19;
    static final int INITIAL_GOLD = 5;
    private int availableGold;
    private int currentGold;

    public Wallet() {
        currentGold = INITIAL_GOLD;
        availableGold = MAX_GOLD - INITIAL_GOLD;
    }

    public void addGold(int amount) throws NotEnoughGold {
        if (isAvailableToEarn(amount)) {
            currentGold += amount;
            availableGold -= amount;
            return;
        }
        currentGold += availableGold;
        availableGold = 0;
        throw new NotEnoughGold(false);
    }

    public void substractGold(int amount) throws NotEnoughGold {
        if(isAvailable(amount)) {
            currentGold -= amount;
            availableGold += amount;
            return;
        }
        throw new NotEnoughGold(true);
    }

    public void putOneOnMap() throws NotEnoughGold {
        if (isAvailable(1)) {
            currentGold--;
            return;
        }
        throw new NotEnoughGold(true);
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
