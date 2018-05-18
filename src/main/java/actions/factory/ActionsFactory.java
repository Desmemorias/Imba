package actions.factory;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class ActionsFactory {
    public ActionsFactory instance = new ActionsFactory();

    HashMap<String, Action> commands = new HashMap<String, Action>();

    public ActionsFactory getInstance(){
        return instance;
    }

}
