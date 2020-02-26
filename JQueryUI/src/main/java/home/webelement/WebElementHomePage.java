package home.webelement;

import common.WebAPI;

public class WebElementHomePage extends WebAPI {
    //Drag and Drop frame
    public static final String dragAndDrpFrame="//iframe[@class='demo-frame']";
    public static final String dragFrom="//div[@id='draggable']";
    public static final String DroppableToInnerFrame="//div[@id='droppable']";

    public static final String selectable="//a[contains(text(),'Selectable')]";
    public static final String number4="//li[@class='ui-widget-content ui-selectee ui-selected']";

    public static final String datePicker="//a[contains(text(),'Datepicker')]";
    public static final String dateBox="//input[@id='datepicker']";

}
