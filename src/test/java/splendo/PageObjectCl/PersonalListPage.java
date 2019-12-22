package splendo.PageObjectCl;

import org.openqa.selenium.By;

import static splendo.PageObjectCl.BaseTest.TextView;
import static splendo.PageObjectCl.BaseTest.app_package_name;

public class PersonalListPage {

    public By PersonalMenuItem = By.xpath(TextView + "[@text='Personal']");
    public By taskInputPersonal = By.id(app_package_name + "edtTaskName");
}