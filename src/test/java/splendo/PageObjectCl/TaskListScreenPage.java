package splendo.PageObjectCl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static splendo.PageObjectCl.BaseTest.TextView;
import static splendo.PageObjectCl.BaseTest.app_package_name;

public class TaskListScreenPage {

    public By taskName = By.id(app_package_name + "task_name");
    public By taskCheckBox = By.id(app_package_name + "checkDone");
    public By toolBar = By.id(app_package_name + "spinnerToolbar");
    public By finishedMenuItem = By.xpath(TextView + "[@text='Finished']");

    public By quickTask = By.id(app_package_name + "etQuickTask");
    public By doneButtonForQuickTask = By.id(app_package_name + "ivAddQuickTask");
    public By allListsMenuItem = By.xpath(TextView + "[@text='All Lists']");
    public By listMain = By.id(app_package_name + "listMain");

}







