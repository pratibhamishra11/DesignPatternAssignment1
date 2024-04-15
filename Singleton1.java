class VotingSystem {
    private static VotingSystem instance;
    private int totalVotes;

    private VotingSystem() {
        totalVotes = 0;
    }

    public static VotingSystem getInstance() {
        if (instance == null) {
            instance = new VotingSystem();
        }
        return instance;
    }

    public void vote() {
        totalVotes = totalVotes + 1;
    }

    public int getTotalVotes() {
        return totalVotes;
    }
}

class Singleton1 {
    public static void main(String[] args) {
        VotingSystem votingSystem1 = VotingSystem.getInstance();
        VotingSystem votingSystem2 = VotingSystem.getInstance();

        votingSystem1.vote();
        votingSystem2.vote();
        votingSystem1.vote();
        votingSystem2.vote();

        System.out.println("Total votes : " + votingSystem1.getTotalVotes());
    }
}