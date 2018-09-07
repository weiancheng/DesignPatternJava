import java.util.HashMap;

public class CarController {
    public enum ECOMMAND {
        FORWARD,
        BACK,
        RIGHT,
        LEFT
    };

    private HashMap<ECOMMAND, ICommand> mTable;

    public CarController() {
        mTable = new HashMap<ECOMMAND, ICommand>();
    }

    public void setCommand(ICommand cmd, ECOMMAND ecmd) {
        mTable.put(ecmd, cmd);
    }

    public void execute(ECOMMAND cmd) {
        mTable.get(cmd).execute();
    }
}