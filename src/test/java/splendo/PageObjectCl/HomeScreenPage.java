package splendo.PageObjectCl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import splendo.test.AndroidSetup;

import org.openqa.selenium.By;

import static splendo.PageObjectCl.BaseTest.TextView;
import static splendo.PageObjectCl.BaseTest.app_package_name;


public class HomeScreenPage {

    public By addFirstTaskButton = By.id(app_package_name + "imgFirstTask");
    public By addNewTaskButton = By.id(app_package_name + "ivFAB_AddTask");
    public By taskInput = By.id(app_package_name + "edtTaskName");
    public By dueDate = By.id(app_package_name + "edtDueD");
    public By dueTime = By.id(app_package_name + "edtDueT");
    public By saveTask = By.id(app_package_name + "action_save_task");
    public By doneButton = By.id("android:id/button1");
    public By repeatButton = By.id(app_package_name + "spinnerRepeat");
    public By repeatButtonOnceAWeek = By.xpath(TextView + "[@text='Once a Week']");
    public By addToListButton = By.id(app_package_name + "spinnerLists");
    public By addToListButtonPersonal = By.xpath(TextView + "[@text='Personal']");
    public By popUpReapeatTaskNo = By.id("android:id/button2");

}