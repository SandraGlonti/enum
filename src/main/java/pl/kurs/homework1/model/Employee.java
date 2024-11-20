package pl.kurs.homework1.model;

public class Employee {
    private String name;
    private String lastName;
    private Position position;
    private Reward[] rewards;
    private int rewardCounter;

    public Employee(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.rewards = new Reward[10];
        this.rewardCounter = 0;
    }

    public void addReward(Reward reward) {
        if (rewardCounter < rewards.length) {
            rewards[rewardCounter] = reward;
            rewardCounter++;
        } else {
            System.out.println("Nie można dodać więcej nagród");
        }
    }

    public int showBaseSalary() {
        return position.getBaseSalary();
    }

    public String toStirng() {
        String rewardsText = "Brak nagród";
        if (rewardCounter > 0) {
            rewardsText = "";
            for (int i = 0; i < rewardCounter; i++) {
                rewardsText += rewards[i];
                if (i < rewardCounter - 1) {
                    rewardsText += ", ";

                }
            }
        }return "Pracownik: " + name + " " + lastName+
                ", Stanowisko: " + position +
                ", Podstawa pensji: " +showBaseSalary() + " PLN" +
                ", Nagrody: " + rewardsText;
    }
}

