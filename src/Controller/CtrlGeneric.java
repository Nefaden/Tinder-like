package controleur;

import View.ViewGeneric;
import Controller.CtrlMain;

/**
 * Generic Controller
 * Basic controller model
 * Each Controller got :
 * - a view
 * - a bind to the Main controller
 *
 * @author ydurand
 * @version 0.1
 **/
public abstract class CtrlGeneric {

    protected ViewGeneric view = null;
    protected CtrlMain ctrlMain = null;

    // Generic controller constructor
    protected CtrlGeneric(CtrlMain ctrlMain) {
        this.ctrlMain = ctrlMain;
    }

    /**
     *
     * @return view : generic view
     */
    public ViewGeneric getView() {
        return view;
    }

    /**
     *
     * @param view : Generic view bind to the controller
     */
    public void setView(ViewGeneric view) {
        this.view = view;
    }

    /**
     *
     * @return ctrlMain : getter from Main controller
     */
    public CtrlMain getCtrlMain() {
        return (CtrlMain) ctrlMain;
    }

    /**
     *
     * @param ctrlMain : Setter from Main controller
     */
    public void setCtrlMain(CtrlMain ctrlMain) {
        this.ctrlMain = ctrlMain;
    }

}