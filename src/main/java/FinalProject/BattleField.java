package FinalProject;

public class BattleField {
    private ObjectList[][] field;

    public BattleField(ObjectList[][] field){
        this.field = field;
    }

    public void printField(){
        System.out.println("\\ 0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i + " ");
            for (ObjectList cell : field[i]) {
                System.out.print(cell.getImg() + " ");
            }
            System.out.println();
        }
    }
}
