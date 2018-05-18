package actions.factory;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

public interface Action {
    public String execute(HttpServletRequest request);
    static Logger log = Logger.getLogger(Action.class);
}
