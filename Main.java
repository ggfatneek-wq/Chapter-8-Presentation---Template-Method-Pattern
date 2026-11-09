public class Main {
    public static void main(String[] args) {
        MissionPreparation warrior = new WarriorPreparation();
        MissionPreparation mage = new MagePreparation();

        System.out.println("WARRIOR:");
        warrior.prepare();

        System.out.println("\nMAGE:");
        mage.prepare();
    }
}

abstract class MissionPreparation {
    public final void prepare() {
        checkMission();
        equipGear();
        specialPreparation();
        depart();
    }

    private void checkMission() {
        System.out.println("Checking mission details.");
    }

    protected abstract void equipGear();

    protected void specialPreparation() {
        // Optional hook.
    }

    private void depart() {
        System.out.println("Departing for the mission.");
    }
}

class WarriorPreparation extends MissionPreparation {
    @Override
    protected void equipGear() {
        System.out.println("Equipping a sword and shield.");
    }
}

class MagePreparation extends MissionPreparation {
    @Override
    protected void equipGear() {
        System.out.println("Equipping a staff and robes.");
    }

    // Type the hook override here during recording.
}
