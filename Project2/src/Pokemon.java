public class Pokemon {
    private static String name;
    private static int hitPoints;
    private static String move;
    private static int movePower;
    private static int attackSpeed;

    public Pokemon(String name2, String hitPoints2, String move2, String movePower2, String attackSpeed2) {
        name = name2;
        hitPoints = Integer.parseInt(hitPoints2);
        move = move2;
        movePower = Integer.parseInt(movePower2);
        attackSpeed = Integer.parseInt(attackSpeed2);
    }

    public static String getName() {
        return name;
    }
    public static int getHitPoints() {
        return hitPoints;
    }
    public static String getMove() {
        return move;
    }
    public static int getMovePower() {
        return movePower;
    }
    public static int getAttackSpeed() {
        return attackSpeed;
    }

    public void displayStats(String newName, int newHitPoints, String newMove, int newMovePower, int newAttackSpeed){
        newName = name;
        newHitPoints = hitPoints;
        newMove = move;
        newMovePower = movePower;
        newAttackSpeed = attackSpeed;
        System.out.println("Pokemon Stats");
        System.out.println("----------------");
        System.out.println("Name: " + newName);
        System.out.println("Hit Points: " + String.valueOf(newHitPoints));
        System.out.println("Move: " + newMove);
        System.out.println("Move Power: " + String.valueOf(newMovePower));
        System.out.println("Attack Speed: " + newAttackSpeed);
    }
}